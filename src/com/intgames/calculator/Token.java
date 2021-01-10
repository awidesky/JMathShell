package com.intgames.calculator;

import java.math.BigDecimal;


/** Object represents each monomials of <code>Formula</code> */
public class Token {
	
	public static final Token PLUS = new Token("+", TokenType.OPERATOR);
	public static final Token MINUS = new Token("-", TokenType.OPERATOR);
	public static final Token MULTIPLY = new Token("*", TokenType.OPERATOR);
	public static final Token DIVISION = new Token("/", TokenType.OPERATOR);
	public static final Token BRACKET_OPEN = new Token("(", TokenType.OPERATOR);
	public static final Token BRACKET_CLOSE = new Token(")", TokenType.OPERATOR);
	
	/** Type of the token */
	private TokenType type;
	private BigDecimal num = null;
	
	enum TokenType {	NUMBER,		OPERATOR,	FUNCTION	}
	
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
	
	
	public static Token getToken(String string, TokenType type) {
		
		return new Token(string, type);
		
	}
	
	
	
}// Token class end
