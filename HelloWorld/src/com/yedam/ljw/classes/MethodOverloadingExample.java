package com.yedam.ljw.classes;
//메소드 오버로딩 : 동인한 메소드 사용
public class MethodOverloadingExample {
	public static void main(String[] args) {
		
		
		int num1=10, num2=20;
		double d1=1.5, d2=2.3;
		print(sum(num1, num2));
		print(sum(d1, d2));
		print();
	}
	static void print() {
		System.out.println();
	}
	static void print(String str) {
		System.out.println(str);
	}
	static void print(int str) {
		System.out.println(str);
	}
	static void print(double str) {
		System.out.println(str);
	}
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	static double sum(double a, double b) {
		return (double)(a + b);
	}
	static double sum(double a, int b) {
		return a + b;
	}
	static double sum(int a, double b) {
		return a + b;
	}
}
