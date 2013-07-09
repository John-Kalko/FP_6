package ua.fp.dao.impl;
import ua.fp.dao.UserDAO;
import ua.fp.domain.PlanningInCategoryEntity;
import ua.fp.domain.UserAccountEntity;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:34 PM
 */
@Stateless
public class UserDAOImpl extends JpaDAO<UserAccountEntity> implements UserDAO {

	public UserDAOImpl(){

	}

	/**
	 * 
	 * @param email    email
	 */
    public UserAccountEntity getUserByLogin(String email) {
        UserAccountEntity result;
        result = (UserAccountEntity) super.getEm().createQuery("SELECT o FROM UserAccountEntity o WHERE o.email like :email").
                setParameter("email", email).getSingleResult();
        return result;
    }

    @Override
    protected Class<UserAccountEntity> type() {
        return UserAccountEntity.class;
    }
}