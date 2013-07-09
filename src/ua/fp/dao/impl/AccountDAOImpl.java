package ua.fp.dao.impl;
import ua.fp.dao.AccountDAO;
import ua.fp.domain.AccountEntity;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.PlanningInCategoryEntity;

import javax.ejb.Stateless;
import java.util.List;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:29 PM
 */
@Stateless
public class AccountDAOImpl extends JpaDAO<AccountEntity> implements AccountDAO {

	public AccountDAOImpl(){
         super();
	}

	public List<PlanningInCategoryEntity> getAllUnlinkedInCategories(){
		return null;
	}

	public List<PlanningExCategoryEntity> getAllUnlinkedExCategories(){
		return null;
	}

    @Override
    protected Class<AccountEntity> type() {
        return AccountEntity.class;
    }

}