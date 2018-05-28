package com.sale_stock_indonesia.exercise.exercise2.exception;

public class IncorrectAgeException extends Exception {
	
	static final long serialVersionUID = 19112519201531111l;
	
	private IncorrectAgeException() {};
	
	public IncorrectAgeException(int age) {
		super("Incorrect age : " + age);
	}
}
