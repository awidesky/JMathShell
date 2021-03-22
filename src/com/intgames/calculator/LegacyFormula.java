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
public class LegacyFormula {

	/** Formula parsed to <code>List<Token></code> */
	@SuppressWarnings("unused")
	private List<Token> tokens;
	/** Custom functions */
	@SuppressWarnings("unused")
	private Map<String, Function> customFunc;
	/** Custom Variables */
	@SuppressWarnings("unused")
	private Map<String, Token> customVariable;
	
	/** Standard functions */
	@SuppressWarnings("unused")
	private static final Map<String, Function> basicFunc = new HashMap<>();
	static {
		
		// TODO : add basic functions
		//basicFunc.put(key, value)
		
	}
	/** Standard variables */
	@SuppressWarnings("unused")
	private static final Map<String, Token> basicVariable = new HashMap<>();
	static {
		
		//TODO : add basic variables
		//basicVariable.put(key, value)
		
	}
	
	
	
}// Formula class end

/** Object represents each monomials of <code>Formula</code> */
class LegacyToken {
	
	public static final LegacyToken PLUS = new LegacyToken("+", TokenType.OPERATOR);
	public static final LegacyToken MINUS = new LegacyToken("-", TokenType.OPERATOR);
	public static final LegacyToken MULTIPLY = new LegacyToken("*", TokenType.OPERATOR);
	public static final LegacyToken DIVISION = new LegacyToken("/", TokenType.OPERATOR);
	public static final LegacyToken BRACKET_OPEN = new LegacyToken("(", TokenType.OPERATOR);
	public static final LegacyToken BRACKET_CLOSE = new LegacyToken(")", TokenType.OPERATOR);
	
	/** Type of the token */
	@SuppressWarnings("unused")
	private TokenType type;
	@SuppressWarnings("unused")
	private BigDecimal num;
	
	enum TokenType {	NUMBER,		OPERATOR,		FUNCTION	}
	
	private LegacyToken(String string, TokenType type) {
		
		this.type = type;
		
		switch(type) {
		
		case NUMBER:
			
			num = new BigDecimal(string);
			break;
			
		case FUNCTION:
		
			
			
		case OPERATOR:
			
		}
	}
	
	
	
	
}// Token class end

/** Object represents functions of <code>Formula</code> */
class LegacyFunction{}
