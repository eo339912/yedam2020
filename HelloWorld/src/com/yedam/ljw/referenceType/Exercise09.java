package com.yedam.ljw.referenceType;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("======================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("======================================================");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				int inputSd = scanner.nextInt();
				System.out.println(inputSd);
				studentNum = inputSd;
				
//				System.out.println("학생수> ");
//				studentNum = scanner.nextInt();
//				scores = new int[studentNum];
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				System.out.println(scores.length);
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + "> ");
					int inputSd = scanner.nextInt();
					scores[i] = inputSd; 
					//System.out.println(inputSd2);
					
				}
				//System.out.print(scores);
				
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + ": " + scores[i]);
				}				
			}else if(selectNo == 4) {//분석 최고 점수 및 평균 점수를 구해라
				int par = 0;
				for(int i = 0; i < scores.length; i++) {
					if(par < scores[i]) {
						par = scores[i];
					}
				}
				System.out.println("최고점수 :" + par);
				
				double par2 = 0;
				int sum = 0;
				
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i]; //
				}
				par2 = (double)sum/scores.length;
				System.out.println("평균점수 :" + par2);
			}else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
