package ua.fp.dao.impl;
import ua.fp.dao.ExCategoryDAO;
import ua.fp.domain.AccountEntity;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.UserAccountEntity;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:31 PM
 */
@Stateless
public class ExCategoryDAOImpl extends JpaDAO<PlanningExCategoryEntity> implements ExCategoryDAO {

	/**
	 * Was not tested!!!
	 * @param id    id
	 */
//	public boolean isSubcatExisits(int id){
//        boolean result = false;
//        char res = (PlanningExCategoryEntity) super.getEm().createQuery("SELECT o FROM PlanningExCategoryEntity o WHERE o.exCatId = :id").
//                setParameter("id", id).getSingleResult().getNoSubcat();
//        if (res == 'Y') {
//            result = true;
//        }
//        return result;
//    }

    @Override
    protected Class<PlanningExCategoryEntity> type() {
        return PlanningExCategoryEntity.class;
    }

}