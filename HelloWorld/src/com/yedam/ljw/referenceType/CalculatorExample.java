package com.yedam.ljw.referenceType;

public class CalculatorExample {
	
	public static void main(String[] args) {
		sum(10, 20);
		
		int num1 = 10;
		int num2 = 20;
		sum(num1, num2);
		minus(num1, num2);
		multi(num1, num2);
		divide(num1, num2);
		
		print(3);
		print2(2, "&&&");
		printStar(7);
		printStar2(7, "+");
		
		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println(r);
		
		/*
		 * void 반환 값이없다.리턴값을 사용할 수 없다.
		 * int 정수값을 리턴해서 값을 반환한다.
		 */
		String ret = welcome("지원");
		System.out.println(ret);
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}
	
	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println(result);
	}
	
	public static void divide(int x, int y) {
		double result = (double) x / y;
		System.out.println(result);
	}
	
	public static void print(int a) {
		for(int i = 0; i < a; i++) {
			System.out.println("*****");
		}
	}
	
	public static void print2(int a, String str) {
		for(int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
	public static void printStar(int a) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) 
				System.out.print("*");
			System.out.println();
			
		}
	}
	
	public static void printStar2(int a, String str) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) 
				System.out.print(str);
			System.out.println();
			
		}
	}
	
	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result; //결과값을 담아준다.
	}
	
	public static String welcome(String name) {
		return "Hello " + name; //결과값을 담아준다.
	}





}
