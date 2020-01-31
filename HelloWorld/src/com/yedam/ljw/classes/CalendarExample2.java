package com.yedam.ljw.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample2 {
	
	
	
	static void createCal(int year, int mon) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year,mon-1,1);
		int month = mon;
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "년 " + month + "월");
		
		// 요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();
		// 월의 첫째날의 시작위치 지정.
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}
		// 7일씩 잘라서 출력.
		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}// end of createCal
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int year, month;
		//year = 2020;
		//month = 1;
		//createCal(year, month);
		
		while(true) {
			
			
			System.out.print("년 입력> ");
			year = scn.nextInt();
			
			if(year == 0) {
				break;
			}
			
			System.out.print("달 입력> ");
			month = scn.nextInt();
		
			if(month == 0) {
				break;
			}
			
			createCal(year, month);
			
		}
		System.out.println("종료");
			
		
	}
}
