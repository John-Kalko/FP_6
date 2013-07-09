package ua.fp.service;
import ua.fp.domain.util.BallanceDisplayer;
import ua.fp.domain.util.PlanningPeriod;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:31 PM
 */
@Stateless
public class ConfigurationPlanningService {

	public ConfigurationPlanningService(){

	}

	/**
	 * 
	 * @param period
	 */
	public BallanceDisplayer setPeriodWithoutQuantity(PlanningPeriod period){
		return null;
	}

	/**
	 * 
	 * @param period
	 * @param quantity
	 */
	public BallanceDisplayer setPeriodWithQuantity(PlanningPeriod period, int quantity){
		return null;
	}

}