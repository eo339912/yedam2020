package com.yedam.ljw.referenceType;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int[] intAry = {3, 7, 5, 8, 4};
		int sum = 0;
		
		System.out.println(intAry.length); //배열의 크기를 불러온다.
		
		for(int i=0; i<5; i++) {
			sum = intAry[i] + sum;
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i=0; i< intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println(sum);
		
		sum = sumArrayMethod(intAry);
		System.out.println(sum);
		
		int[] intAry2 = {35, 75, 52, 82, 45};
		sum = sumArrayMethod(intAry2);
		System.out.println(sum);
	}

	//배열의 요소 합을 계산하는 method.
	public static int sumArrayMethod(int[] ary) {
		
		int sum = 0;
		for(int i=0; i< ary.length; i++) {
			sum += ary[i];
		}
		
		return sum;
	}
}
