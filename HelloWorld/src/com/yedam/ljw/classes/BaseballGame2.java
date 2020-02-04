package com.yedam.ljw.classes;

import java.util.Scanner;

public class BaseballGame2 {
	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] answer2 = new int[3];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 9) + 1;
			//System.out.print(answer[i]);z
		}
		//System.out.println();
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			
			for(int i = 0; i < answer2.length; i++) {
				answer2[i] = scn.nextInt();
			}
			
			for(int i = 0; i < answer2.length; i++) {
				System.out.print(answer2[i]);
			}
			System.out.println();
			
			
		
			int st = 0;
			for(int i = 0; i < answer.length; i++) {
				if(answer[i] == answer2[i]) {
					st++;
				}
			}
			System.out.println(st + "strike");
			
			
			int ba = 0;
			for(int j = 0; j < answer.length; j++) {
				for(int i = 0; i < answer.length; i++) {
					if(answer[j] == answer2[i] && j != i) {
						ba++;
					}
				}
			}
			System.out.println(ba + "ball");
			
		}
		
	}
}
