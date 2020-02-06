package com.yedam.ljw.interfaces;

public class Digitnumber {
	public static void main(String[] args) {

		System.out.println(getDigitNumber(12)); 
	}
	
	static String getDigitNumber(int num) {
		String result = "";
		int divide;
		
		while(true) {
			divide = num % 2;
			result = divide + result;
			num = num / 2;
						
			if(num == 0) {
				break;
			}
		}
		return result;
	}
	
}
