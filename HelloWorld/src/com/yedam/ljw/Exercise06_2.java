package com.yedam.ljw;

public class Exercise06_2 {
	public static void main(String[] args) {
		
		for(int i=0;i<=4 ; i++) {
			for(int j=4-i;j>0 ; j--) {
				System.out.print(" ");
			}
			for(int j=-1;j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=0;i<5 ; i++) {
			for(int j=0;j<5 ; j++) {
				
				if(i+j >= 4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
