package com.jsp.exception_handling;

public class DemoException {
	public static void main(String[] args) {
		int m = 14;
		int n = 2;
		String s = " ";

		try //// Exception Handling Using try catch block
		{
			int res = m / n;
			System.out.println(res);
			char c = s.charAt(5);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (StringIndexOutOfBoundsException ie) {
			System.out.println(ie.getMessage());
		}

	}

}
