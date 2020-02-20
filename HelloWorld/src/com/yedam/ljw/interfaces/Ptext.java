package com.yedam.ljw.interfaces;

import java.util.Scanner;

public class Ptext {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("사용 전기량을 입력 :");
		int tst = scn.nextInt();
		int m = Electric(tst);
		System.out.println("사용 전기요금은 " + m + "원");
	}
	public static int Electric(int tst) {
		//int tst = 250;
		int m = 0;
		for(int i = 1; i <= tst ; i++) {//36500
			if(i <= 100) {
				m += 100;
			}else if(i > 100 && i<= 200) {
				m += 150;
			}else if(i > 200 && i<= 300) {
				m += 230;
			}else if(i > 300) {
				m += 300;
			}
			System.out.println(i + ","+ m);
		}
		//System.out.println(m);
		return m;
	}
	
	
}
