package ua.fp.service;
import ua.fp.dao.ExCategoryDAO;
import ua.fp.dao.ExSubcategory;
import ua.fp.domain.PlanningExCategoryEntity;
import ua.fp.domain.PlanningExSubcategoryEntity;
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
public class ConfigurationExCategoriesService {

	public ExCategoryDAO m_ExCategoryDAO;
	public ExSubcategory m_ExSubcategory;

	public ConfigurationExCategoriesService(){

	}

	/**
	 * 
	 * @param cat
	 */
	public PlanningExCategoryEntity addCategory(PlanningExCategoryEntity cat){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param period
	 */
	public PlanningExCategoryEntity modifyCategoryPeriod(Long id, PlanningPeriod period){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param date
	 */
	public PlanningExCategoryEntity modifyCategoryDate(Long id, Calendar date){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param amount
	 */
	public PlanningExCategoryEntity modifyCategoryAmount(Long id, BigDecimal amount){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param title
	 */
	public PlanningExCategoryEntity modifyCategoryTItle(Long id, String title){
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
	public PlanningExCategoryEntity modifyCategory(Long id, String title, BigDecimal amount, PlanningPeriod period, Calendar date){
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
	public PlanningExSubcategoryEntity addSubcategory(PlanningExSubcategoryEntity subcat, Long catId){
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
	public PlanningExSubcategoryEntity modifySubcatDate(Long id, Long catId, Calendar date){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 * @param title
	 */
	public PlanningExSubcategoryEntity modifySubcatTitle(Long id, Long catId, String title){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 * @param amount
	 */
	public PlanningExSubcategoryEntity modifySubcatAmount(Long id, Long catId, BigDecimal amount){
		return null;
	}

	public BigDecimal getTotalPeriodAmount(){
		return null;
	}

	public List<PlanningExCategoryEntity> getAllCategories(){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public List<PlanningExSubcategoryEntity> getAllSubcategories(Long id){
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public PlanningExCategoryEntity getCategory(Long id){
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param catId
	 */
	public PlanningExSubcategoryEntity getSubcategory(Long id, Long catId){
		return null;
	}

}