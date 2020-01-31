package com.yedam.ljw.classes;

import java.util.Scanner;//ctrl + shift + o

public class Calculator {
	static double PI = 3.14;
	
	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum(a, b);
		else if (oper.contentEquals("*"))
			result = multi(a, b);
		else if (oper.contentEquals("-"))
			result = minus(a, b);
		else if (oper.contentEquals("/"))
			result = divide(a, b);
		System.out.println(result);

	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}
}
