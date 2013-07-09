package ua.fp.service;
import ua.fp.dao.AccountDAO;
import ua.fp.domain.AccountEntity;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.PlanningInCategoryEntity;

import javax.ejb.Stateless;
import java.util.List;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:30 PM
 */
@Stateless
public class ConfigurationAccountService {

	public AccountDAO m_AccountDAO;

	public ConfigurationAccountService(){

	}

	/**
	 * 
	 * @param account
	 */
	public AccountEntity addAccount(AccountEntity account){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param title
	 */
	public AccountEntity modifyAccountTitle(Long id, String title){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param cat
	 */
	public AccountEntity modifyAccountLinkInCategory(Long id, PlanningInCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param cat
	 */
	public AccountEntity modifyAccountLinkExCategory(Long id, PlanningExCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param cat
	 */
	public AccountEntity modifyAccountUnlinkInCategory(Long id, PlanningInCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param cat
	 */
	public AccountEntity modifyAccountUnlinkExCategory(Long id, PlanningExCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public boolean removeAccount(Long id){
		return false;
	}

	public List<AccountEntity> getAllAccounts(){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public AccountEntity getAccount(Long id){
		return null;
	}

	public List<PlanningInCategoryEntity> getAllUnlinkedInCategories(){
		return null;
	}

	public List<PlanningExCategoryEntity> getAllUnlinkedExCategory(){
		return null;
	}

}