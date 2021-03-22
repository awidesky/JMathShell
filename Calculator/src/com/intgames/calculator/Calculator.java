package com.intgames.calculator;


/**
 * <pre>
 * com.intgames.calculator
 * Calculator.java
 * </pre>
 * 
 * @author  : Eugene Hong
 * @date    : 2020. 4. 10. 
 * @version :
 * 
 * 
 * 
 */
public class Calculator {

	/** Formula to calculation */
	private Formula formula;
	private String origin;

	public Calculator() {}

	/** Create <code>Calculator</code> object with given <code>Formula</code> */
	public Calculator(Formula f) {
	  
		this.formula = f;
	  
	}
	
	/** Create <code>Calculator</code> object with given <code>String</code> */
	public Calculator(String origin) {
	  
		this.origin = origin;
	  
	}
	
	
	public void parse() {
		
		
	}
	
	
}
