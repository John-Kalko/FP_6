package ua.fp.dao;
import ua.fp.domain.UserAccountEntity;

import javax.ejb.Local;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:34 PM
 */
@Local
public interface UserDAO extends GenericDAO<UserAccountEntity> {

	/**
	 * 
	 * @param email    email
	 */
	public UserAccountEntity getUserByLogin(String email);

}