package ua.fp.dao.impl;
import ua.fp.dao.InCategoryDAO;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.PlanningExSubcategoryEntity;
import ua.fp.domain.PlanningInCategoryEntity;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:32 PM
 */
@Stateless
public class InCategoryDAOImpl extends JpaDAO<PlanningInCategoryEntity> implements InCategoryDAO {

	public InCategoryDAOImpl(){

	}

    /**
     * Was not tested!!!
     * @param id    id
     * @return
     */
//    @Override
//    public boolean isSubcatExisits(int id) {
//        boolean result = false;
//        char res = (PlanningInCategoryEntity) super.getEm().createQuery("SELECT o FROM PlanningInCategoryEntity o WHERE o.exCatId = :id").
//                setParameter("id", id).getSingleResult().getNoSubcat();
//        if (res == 'Y') {
//            result = true;
//        }
//        return result;
//    }

    @Override
    protected Class<PlanningInCategoryEntity> type() {
        return PlanningInCategoryEntity.class;
    }
}