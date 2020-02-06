package com.yedam.ljw.exceptions;

import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Object obj = new Object();
		int num = 10;
		Integer i = num;
		Double d = 3.0;
		
		
		String str = "Hello";
		
		//String str = null;
		try {
			System.out.println(str.toString());
		}catch (Exception e) {
			e.printStackTrace(); //에러가 생기면 에러메세지를 출력하고 다음 프로그램을 실행한다.
			System.out.println("에러발생. 관리자문의");
		}
		while(true) {
			System.out.println("숫자입력: ");
			try {
				int num1 = scn.nextInt();
				
				System.out.println("입력하신 값은: " + num1);
				if(num1 == 9) {
					break;
				}
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("입력값 확인");
				scn.nextLine();
			}finally {
				System.out.println("반드시 실행이 되어야하는 내용.ㅇ");
			}
		}
		
		//System.out.println(str.toString());
		System.out.println("프로그램종료.");
				
		//1예외처리_1
		System.out.println("예외처리 1");
		findClass();
		
		
		//1예외처리_2
		System.out.println("예외처리2");
		try {
			findClass2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}//end of main
	static void findClass() {
		Class t = null;
		try {
			t = Class.forName("java.lang.String2");
			System.out.println(t.getName());
		} catch (ClassNotFoundException e) {
			//System.out.println(1);
			e.printStackTrace();
		}
		
	}
	
	static void findClass2() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());
	}
}
