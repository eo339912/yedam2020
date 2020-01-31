package com.yedam.ljw;

public class ArrayExample {
public static void main(String[] args) {
	int[] intAry = {2, 3, 4, 5};
	System.out.println(intAry[0]);
	System.out.println(intAry[1]);
	System.out.println(intAry[2]);
	System.out.println(intAry[3]);
	
	int[] int2Ary = new int[5]; //배열의 크기 지정
	int2Ary[0] = 1;
	int2Ary[4] = 1;
	//int2Ary[5] = 1; //ArrayIndexOutOfBoundsException 배열범위가 넘어간 예외
	
	
	//int[] int3Ary = null;
	//int3Ary = new int[] {1, 2, 3};
	
	
	System.out.println("===========================");

	intAry[0] = 20;
	intAry[1] = 30;
	System.out.println(intAry[0]);
	System.out.println(intAry[1]);
	
	System.out.println("===========================");
	
	for(int i=0; i<4; i++) {
		System.out.println(intAry[i]);
	}
	
	System.out.println("===========================");
	
	//intAry에 10, 20, 30, 40의 값을 할당 (대입)
	
	
	for(int i=0; i<4; i++) {
		intAry[i] = i * 10 + 10;
		System.out.println(intAry[i]);
	}
	
	System.out.println("===========================");
	int sum = 0;
	for(int i=0; i<4; i++) {
		intAry[i] = i * 10 + 10;
		System.out.println(intAry[i]);
		
	}
	//sum = intAry[0]+intAry[1]+intAry[2]+intAry[3];
	for(int i=0; i<4; i++) {
		sum = sum + intAry[i];
	}
	System.out.println(sum);
	
	
}
}
