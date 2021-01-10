package com.intgames.calculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <pre>
 * com.intgames.calculator
 * Formula.java
 * </pre>
 * 
 * @author  : Eugene Hong
 * @date    : 2020. 4. 10. 
 * @version :
 * 
 * 
 */
public class Formula {

	/** Formula parsed to <code>List<com.intgames.calculator.Token></code> */
	private List<Token> tokens;
	/** Custom functions */
	private Map<String, Function> customFunc;
	/** Custom Variables */
	private Map<String, Token> customVariables;
	
	/** Standard functions */
	private static final Map<String, Function> basicFunc = new HashMap<>();
	static {
		
		// TODO : add basic functions
		//basicFunc.put(key, value)
		
	}
	/** Standard variables */
	private static final Map<String, Token> basicVariables = new HashMap<>();
	static {
		
		//TODO : add basic variables
		//basicVariable.put(key, value)
		
	}
	
	
	
}// Formula class end
