package com.yedam.ljw;
public class Variabletest {
	/*
	 * 1. Variabletest 클래스 생성
	 * 2. 정수연산을 위해서 sum. avg, num1. num2의 변수 선언
	 * 3. sum = num1 + num2
	 * 4. avg에는 평균값
 	 */
	public static void main(String[] args) {
		int sum, num1, num2;
		num1 = 30;
		num2 = 45;
		sum = num1 + num2;
		System.out.println(sum);
		
		double avg1=(double)(((double)num1 + (double)num2)/2);
		double avg2 = (double)sum/2;
		double avg3 = sum/2.0;
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
	}
}
