package com.yedam.ljw;

public class VariableType {
	public static void main(String[] args) {
		byte var1, var2, sum;
		
		var1 = 55;
		var2 = 33;
		//double 소수점이 들어간 실수 계산시 숫자앞에 타입을 넣어주어야한다.
		sum = (byte)((byte)var1 + (byte)var2);
		System.out.println(sum);
		
		sum = (byte)(var1 + var2);
		System.out.println(sum);
		
		char chr1 = 65;
		System.out.println(chr1);
		
		for(int i=0; i<10; i++) {
			chr1 = (char)(chr1 + 1);
			System.out.println(chr1);
		}
	}
}
