package com.yedam.ljw;

public class ForAndForExample {
public static void main(String[] args) {
	/****************************************************/
		int cnt=0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				cnt++;
				System.out.println("i: " + i + ". j:" + j);
			}
			cnt = 0;
			System.out.println();
		}
		cnt = 0;
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + i*j +" ");
			}
			System.out.println();
		}
		

	/****************************************************/
}
}
