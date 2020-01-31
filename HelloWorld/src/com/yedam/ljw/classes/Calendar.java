package com.yedam.ljw.classes;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("달을 입력하세요.");
			
			int month = scn.nextInt();
			int monthDay = getMonthDay(month);
			
			System.out.println(month + "월은" + getMonthDay(month));
			
			//요일 출력
			String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
			
			for(int i=0; i < day.length; i++) {
				System.out.print(" " + day[i]);
			}
			System.out.println();
			
			
			
			//월의 첫째날의 시작 위치 지정
			int firstDay = getFirstDay(month);
			for(int i=0; i<firstDay-1; i++) { //firstDay = 4인 경우 4개의 공백이 생기니까 -1을 해준다.
				System.out.print("    ");
			}
			
			
			
			//day를 7일씩 잘라서 출력
			for(int i=1; i<=monthDay; i++) {
				System.out.printf("%4d", i);
				if((firstDay - 1 + i) % 7 == 0) {
					System.out.println();
				};
			}
			System.out.println();
		}
		
		
		
	
	}
	//월 입력하면 해당월의 날짜를 반환해주는 메소드.
	static int getMonthDay(int a) {
		int days = 0;
		if(a == 2) {
			days = 28;
		}else if(a <= 7 && a % 2 == 1) {
			days = 31;
		}else if(a > 7 && a % 2 == 0) {
			days = 30;
		}else {
			days = 30;
		}
		return days;
	}
	//2020년 1,2,3,4월 경우에 해당하는 첫째날의 요일을 가져오는 메소드
	static int getFirstDay(int month) {

		if(month == 1) { //1월달은 수요일
			return 4;
		}else if(month == 2) {
			return 7;
		}else if(month == 3) {
			return 1;
		}else if(month == 4) {
			return 4;
		}else {
			return 0;
		}
		
	}
	
	
}
