package ua.fp.service;
import ua.fp.dao.InCategoryDAO;
import ua.fp.dao.InSubcategory;
import ua.fp.domain.PlanningInCategoryEntity;
import ua.fp.domain.PlanningInSubcategoryEntity;
import ua.fp.domain.util.PlanningPeriod;

import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:31 PM
 */
@Stateless
public class ConfigurationInCategoriesService {

	public InCategoryDAO m_InCategoryDAO;
	public InSubcategory m_InSubcategory;

	public ConfigurationInCategoriesService(){

	}

	/**
	 * 
	 * @param cat
	 */
	public PlanningInCategoryEntity addCategory(PlanningInCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param period
	 */
	public PlanningInCategoryEntity modifyCategoryPeriod(Long id, PlanningPeriod period){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param date
	 */
	public PlanningInCategoryEntity modifyCategoryDate(Long id, Calendar date){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param amount
	 */
	public PlanningInCategoryEntity modifyCategoryAmount(Long id, BigDecimal amount){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param title
	 */
	public PlanningInCategoryEntity modifyCategoryTItle(Long id, String title){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param title
	 * @param amount
	 * @param period
	 * @param date
	 */
	public PlanningInCategoryEntity modifyCategory(Long id, String title, BigDecimal amount, PlanningPeriod period, Calendar date){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public boolean removeCategory(Long id){
		return false;
	}

	/**
	 * 
	 * @param subcat
	 * @param catId
	 */
	public PlanningInSubcategoryEntity addSubcategory(PlanningInSubcategoryEntity subcat, Long catId){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 */
	public boolean removeSubcategory(Long id, Long catId){
		return false;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 * @param date
	 */
	public PlanningInSubcategoryEntity modifySubcatDate(Long id, Long catId, Calendar date){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 * @param title
	 */
	public PlanningInSubcategoryEntity modifySubcatTitle(Long id, Long catId, String title){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 * @param amount
	 */
	public PlanningInSubcategoryEntity modifySubcatAmount(Long id, Long catId, BigDecimal amount){
		return null;
	}

	public BigDecimal getTotalPeriodAmount(){
		return null;
	}

	public List<PlanningInCategoryEntity> getAllCategories(){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public List<PlanningInSubcategoryEntity> getAllSubcategories(Long id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public PlanningInCategoryEntity getCategory(Long id){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 */
	public PlanningInSubcategoryEntity getSubcategory(Long id, Long catId){
		return null;
	}

}