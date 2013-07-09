package ua.fp.service;

import ua.fp.dao.UserDAO;
import ua.fp.domain.UserAccountEntity;

import javax.ejb.*;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class UserAccountService {

    @EJB
    private UserDAO userDAO;

    public UserAccountService() {
    }

    public UserAccountEntity addUser(UserAccountEntity o) {
        return this.userDAO.create(o);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public UserAccountEntity findUser50() {
        return this.userDAO.find(50);
    }

    public UserAccountEntity addUser() {
        return this.userDAO.create(new UserAccountEntity("test", 123, "UA"));
    }
}
