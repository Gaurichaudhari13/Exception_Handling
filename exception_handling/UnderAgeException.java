package com.jsp.exception_handling;

public class UnderAgeException extends RuntimeException // Unchecked Exception
{
	@Override
	public String getMessage() {
		return "You are under age";
	}
}
