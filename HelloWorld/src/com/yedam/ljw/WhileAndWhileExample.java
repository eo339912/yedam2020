package com.yedam.ljw;

public class WhileAndWhileExample {
public static void main(String[] args) {
// while구문을 이용해서 구구단 만들기
	int i = 1;
	while(true) {
		for(int j=2; j<=9; j++) {
			System.out.print(j + "*" + i + "=" + i*j +" ");
		}
		if(i >= 9) {
			break;
		}
		System.out.println();
		i++;
	}

	

		
		
		
	
	

	
	
	
}
}
