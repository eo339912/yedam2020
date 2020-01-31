package com.yedam.ljw.referenceType;

public class ArrayInitialValueExample {
	public static void main(String[] args) {
		//int, double, string의 초기값
		int[] intAry = new int[5];
		double[] doubleAry = new double[3];
		String[] strAry = new String[4];
		
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		for(int i = 0; i < doubleAry.length; i++) {
			System.out.println(doubleAry[i]);
		}
		
		for(int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		//타입에 맞게 값을 넣어야된다.
		intAry[0] = 10;
		doubleAry[0] = 20.5;
		strAry[0] = "Hello";
		
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		for(int i = 0; i < doubleAry.length; i++) {
			System.out.println(doubleAry[i]);
		}
		
		for(int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		
		
	}
}
