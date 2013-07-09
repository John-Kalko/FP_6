package ua.fp.domain.util;

import java.math.BigDecimal;

/**
 * @author Ievgen_Kalko
 * @version 1.0
 * @created 21-Jun-2013 2:56:40 PM
 */
public class BallanceDisplayer {

	private BigDecimal totalIncome;
	private BigDecimal totalExpense;
	private BigDecimal ballance;

	public BallanceDisplayer(){

	}

	public BigDecimal getBallance(){
		return ballance;
	}

	public BigDecimal getTotalExpense(){
		return totalExpense;
	}

	public BigDecimal getTotalIncome(){
		return totalIncome;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBallance(BigDecimal newVal){
		ballance = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTotalExpense(BigDecimal newVal){
		totalExpense = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTotalIncome(BigDecimal newVal){
		totalIncome = newVal;
	}

}