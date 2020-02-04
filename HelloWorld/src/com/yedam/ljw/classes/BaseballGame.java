package com.yedam.ljw.classes;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int[] answer2 = {a, b, c};
		for(int i = 0; i < answer2.length; i++) {
			System.out.print(answer2[i]);
		}
		System.out.println();
		
		int[] answer = new int[3];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 9) + 1;
			//System.out.print(answer[i]);
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
