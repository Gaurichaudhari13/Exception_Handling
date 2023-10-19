package com.jsp.exception_handling;

public class OverAgeException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Age limit exceeded";

	}
}
