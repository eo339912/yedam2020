package com.yedam.ljw.classes;

import java.util.Calendar;

public class CalendarExample {
	static void createCal(int year, int mon) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year,mon,1);
		int month = mon;
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "년 " + (month+1) + "월");
		
		// 일 출력.
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
	}// end of createCal
	public static void main(String[] args) {
		
		int year, month;
		year = 2020;
		month = 1;
		createCal(year, month);
		
//		System.out.println();
//		
//		Calendar cal = Calendar.getInstance();
//		System.out.println("현재 년도:" + cal.get(Calendar.YEAR));
//		System.out.println("현재 MONTH:" + cal.get(Calendar.MONTH)); //1월은 0이 나온다.
//		System.out.println("현재 DAY:" + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("현재 요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		
//		cal.set(2020,1,1);//날짜를 세팅해준다.
//		System.out.println("셋팅한 년도:" + cal.get(Calendar.YEAR));
//		System.out.println("셋팅한 MONTH:" + cal.get(Calendar.MONTH)); 
//		System.out.println("셋팅한 DAY:" + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("셋팅한 요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("셋팅한 일 수:" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		
		
	}
}
