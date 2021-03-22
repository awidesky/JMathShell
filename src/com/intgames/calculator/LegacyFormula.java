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

	/** Formula parsed to <code>List<Token></code> */
	private List<Token> tokens;
	/** Custom functions */
	private Map<String, Function> customFunc;
	/** Custom Variables */
	private Map<String, Token> customVariable;
	
	/** Standard functions */
	private static final Map<String, Function> basicFunc = new HashMap<>();
	static {
		
		// TODO : add basic functions
		//basicFunc.put(key, value)
		
	}
	/** Standard variables */
	private static final Map<String, Token> basicVariable = new HashMap<>();
	static {
		
		//TODO : add basic variables
		//basicVariable.put(key, value)
		
	}
	
	
	
}// Formula class end

/** Object represents each monomials of <code>Formula</code> */
class Token {
	
	public static final Token PLUS = new Token("+", TokenType.OPERATOR);
	public static final Token MINUS = new Token("-", TokenType.OPERATOR);
	public static final Token MULTIPLY = new Token("*", TokenType.OPERATOR);
	public static final Token DIVISION = new Token("/", TokenType.OPERATOR);
	public static final Token BRACKET_OPEN = new Token("(", TokenType.OPERATOR);
	public static final Token BRACKET_CLOSE = new Token(")", TokenType.OPERATOR);
	
	/** Type of the token */
	private TokenType type;
	private BigDecimal num;
	
	enum TokenType {	NUMBER,		OPERATOR,		FUNCTION	}
	
	private Token(String string, TokenType type) {
		
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
class Function{}
