package com.yedam.ljw;
public class StringExample {
	public static void main(String[] args) {
		System.out.println(3 + 5);
		System.out.println("두 수의 합은" + 8 + "입니다.");
		System.out.println(3 + 8 + "입니다.");
		
		// 처음 문자가 나오면 뒤에나오는 연산은 문자취급한다.
		System.out.println("두 수의 합은" + 3 + 5 + "입니다.");
		System.out.println("두 수의 합은" + (3 + 5) + "입니다.");
		
		if(5 % 3 != 0) {
			System.out.println("0이 아닙니다.");
		}
		
		int var1 = 9;
		
		if(var1%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		//결과값을 출력한다.
		System.out.println(3 >= 1);
		System.out.println(3 == 1);
		
		
		//삼항연산자
		int var3 = 10, var4 = 20;
		int biggerValue = 0;
		
		if (var3 >= var4) {
			biggerValue = var3;
		}else {

			biggerValue = var4;
		}
		
		System.out.println("큰수는" + biggerValue);
		
		biggerValue = (var3 >= var4) ? var3:var4;
		System.out.println("큰수는" + biggerValue);
		
	}
}
