package com.yedam.ljw.classes;

import java.util.Scanner;

//2,3의 배수 이외의 경우는 기타.
//종료 999 입력
public class MultiplesExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자를 입력하세요. 종료:999");
			System.out.println();
			
			int num = scn.nextInt();
			
			if(num % 2 == 0 && num % 3 == 0) {
				System.out.println("6의 배수입니다.");
			}else if(num % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}else if(num == 999) {
				break;
			}else if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("기타");
			}
			
		}
		System.out.println("끝");
	}
}
