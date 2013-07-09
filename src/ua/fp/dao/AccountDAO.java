package ua.fp.dao;

import ua.fp.domain.AccountEntity;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.PlanningInCategoryEntity;

import javax.ejb.Local;
import java.util.List;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:29 PM
 */
@Local
public interface AccountDAO extends GenericDAO<AccountEntity> {

	public List<PlanningInCategoryEntity> getAllUnlinkedInCategories();

	public List<PlanningExCategoryEntity> getAllUnlinkedExCategories();

}