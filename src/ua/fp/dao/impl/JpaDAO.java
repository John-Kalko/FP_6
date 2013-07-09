package ua.fp.dao.impl;

import ua.fp.dao.GenericDAO;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.persistence.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:33 PM
 */
@Local
public abstract class JpaDAO<B> implements GenericDAO<B> {

    @PersistenceContext(unitName = "FPBaseMain")
    private EntityManager em;

    private Class<B> type;

    public JpaDAO() {
        this.type = type();
    }

    /**
     * @param t bean
     */
    @Override
    public B create(final B t) {
        em.persist(type.cast(t));
        return t;
    }

    /**
     * @param id criteria
     */
    @Override
    public B find(final Object id) {
        return (B) em.find(type, id);
    }

    /**
     * @param t bean
     */
    @Override
    public B update(final B t) {
        return em.merge(t);
    }

    /**
     * @param id bean
     */
    @Override
    public void delete(final Object id) {
        em.remove(em.getReference(type, id));
    }


    /**
     * @param criteria
     * @return
     */
    @Override
    public List<B> findAll(final Map criteria) {
        final Query query;
        List<B> result;
        final StringBuffer queryString = new StringBuffer("SELECT o from ");
        queryString.append(type.getSimpleName()).append(" o ");
        queryString.append(this.getQueryClauses(criteria, null));
        query = em.createQuery(queryString.toString());
        result = query.getResultList();
        return result;
    }

    protected String getQueryClauses(final Map<String, Object> params,
                                     final Map<String, Object> orderParams) {
        final StringBuffer queryString = new StringBuffer();
        if ((params != null) && !params.isEmpty()) {
            queryString.append(" where ");
            for (final Iterator<Map.Entry<String, Object>> it = params
                    .entrySet().iterator(); it.hasNext(); ) {
                final Map.Entry<String, Object> entry = it.next();
                if (entry.getValue() instanceof Boolean) {
                    //If value is a bool
                    queryString.append(entry.getKey()).append(" is ")
                            .append(entry.getValue()).append(" ");
                } else {
                    //If value is a number
                    if (entry.getValue() instanceof Number) {
                        queryString.append(entry.getKey()).append(" = ")
                                .append(entry.getValue());
                    } else {
                        // If value is a string
                        queryString.append(entry.getKey()).append(" = '")
                                .append(entry.getValue()).append("'");
                    }
                }
                if (it.hasNext()) {
                    queryString.append(" and ");
                }
            }
        }
        if ((orderParams != null) && !orderParams.isEmpty()) {
            queryString.append(" order by ");
            for (final Iterator<Map.Entry<String, Object>> it = orderParams
                    .entrySet().iterator(); it.hasNext(); ) {
                final Map.Entry<String, Object> entry = it.next();
                queryString.append(entry.getKey()).append(" ");
                if (entry.getValue() != null) {
                    queryString.append(entry.getValue());
                }
                if (it.hasNext()) {
                    queryString.append(", ");
                }
            }
        }
        return queryString.toString();
    }

    protected abstract Class<B> type();

    protected EntityManager getEm() {
        return em;
    }
}