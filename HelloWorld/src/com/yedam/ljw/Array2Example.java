package com.yedam.ljw;

public class Array2Example {
public static void main(String[] args) {
	int[] intAry = new int[5];
	
	for (int i = 0; i < 5; i++) {
		intAry[i] = i * 10 + 10;
	}
	
//	System.out.println("배열의 범위내에서 값을 실행.");
//	for(int i = 0; i <= 5; i++) {
//		System.out.println(intAry[i]);
//	}
	
	//
	int[] intAry2 = new int[100];
	for(int i=0; i<100; i++) {
		intAry2[i] = (i + 1) * 5; //5의 배수로 값이 담긴다.
	}
	
	for(int i=0; i<100; i++) {
		System.out.print(intAry2[i] + " ");
		if(intAry2[i] % 25 == 0) {
			System.out.println(" ");
		}		
	}
	
	for(int i=0; i<100; i++) {
		System.out.print(intAry2[i] + " ");
		if(i%5 == 4) {
			System.out.println(" ");
		}		
	}
	
	for(int i=0; i<100; i++) {
		System.out.print(intAry2[i] + " ");
		if((i+1)*25 == intAry2[i]) {
			System.out.println(" ");
		}		
	}

	int i = 0;
	while(i<100) {
		System.out.print(intAry2[i] + " ");
		if(intAry2[i] % 25 == 0) {
			System.out.println(" ");
		}
		i++;
	}
	
	while(i<100) {
		System.out.printf("%4d", intAry2[i]); //printf 자리지정
		if(intAry2[i] % 25 == 0) {
			System.out.println(" ");
		}
		i++;
	}

}
}
