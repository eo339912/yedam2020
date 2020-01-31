package com.yedam.ljw;

public class Exercise04 {
public static void main(String[] args) {
//	int ii = 0;
//	while(true) {
//		ii =(int)(Math.random() * 6) + 1;
//		System.out.println(ii);
//		if(ii == 6) {
//			break;
//		}
//	}
	
	int num1 = 0;
	int num2 = 0;
	
	while(true) {
		num1 =(int)(Math.random() * 6) + 1;
		num2 =(int)(Math.random() * 6) + 1;
		
		System.out.println("(" + num1 + "," + num2 + ")");
		
		if(num1 + num2 == 5) {
			break;
		}
		
	}
}
}
