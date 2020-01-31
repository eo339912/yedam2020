package com.yedam.ljw.classes;

import java.util.Scanner;

public class CalculaotrExample {
	public static void main(String[] args) {
		//Calculator c1 = new Calculator();
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("사칙연산 부호 : +, -, *, / q:종료");
			String operator = scn.nextLine();
			
			if(operator.equals("q")) {
				break;
			}
			
			System.out.print("첫번째 수 입력 :");
			System.out.println();
			int num1 = scn.nextInt();
			System.out.print("두번째 수 입력 :");
			System.out.println();
			int num2 = scn.nextInt();
			scn.nextLine(); //수 입력 후 추가된 엔터값을 넣어줘야된다.
			Calculator.cal(num1, num2, operator);

			
		}
		System.out.println("종료.");
	}
}
