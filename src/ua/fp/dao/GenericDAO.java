package ua.fp.dao;

import javax.ejb.Local;
import java.util.List;
import java.util.Map;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:32 PM
 */
@Local
public interface GenericDAO<B> {

	/**
	 * 
	 * @param bean    bean
	 */
	public B create(B bean);

    /**
     *
     * @param id
     * @return
     */
    public B find(Object id);

	/**
	 * 
	 * @param bean    bean
	 */
	public B update(B bean);

    /**
     *
     * @param id
     */
	public void delete(final Object id);

	/**
	 * 
	 * @param criteria    criteria
	 */
	public List<B> findAll(final Map criteria);

}