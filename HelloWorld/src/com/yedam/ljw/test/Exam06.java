package com.yedam.ljw.test;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		
		Scanner scn = new Scanner(System.in);
		Student[] sAry = new Student[10];
		
		while(run) {
			System.out.println("===================================");
			System.out.println("1. 등록 | 2. 조회 | 3. 리스트 | 4. 수정 | 5. 삭제");
			System.out.println("===================================");
			System.out.print("선택> ");
			
			int menu = scn.nextInt();
			if(menu == 1) {//등록
				scn.nextLine();
				
				System.out.println("이름 입력.");
				String name = scn.nextLine();
				
				System.out.println("학번 입력.");
				int classNum = scn.nextInt();
				
				System.out.println("영어점수 입력.");
				int eScore = scn.nextInt();
				
				System.out.println("수학점수 입력.");
				int mScore = scn.nextInt();
				
				Student st = new Student(name, classNum, eScore, mScore);
				
				
				for(int i =0; i < sAry.length; i++) {
					if(sAry[i] == null) {
						sAry[i] = st;
						break;
					}
				}
				
			}else if(menu == 2) {//조회
				System.out.println("학번 입력");
				int classNum = scn.nextInt();
				scn.nextLine();
				
				for(Student st : sAry) {
					if(st != null && st.getClassNum() == classNum) {
						System.out.println(st);
					}
				}
				
			}else if(menu == 3) { //리스트
				for(Student st : sAry) {
					if(st != null) {
						System.out.println(st);
					}
				}
			}else if(menu == 4) {//수정
				
				System.out.println("조회 학번 입력.");
				int classNum = scn.nextInt();
				scn.nextLine();
				
				System.out.println("변경할 이름 입력.");
				String name = scn.nextLine();
				
				System.out.println("변경할 영어점수 입력.");
				int eScore = scn.nextInt();
				
				System.out.println("변경할 수학점수 입력.");
				int mScore = scn.nextInt();
				
				Student st = new Student();
				st.setClassNum(classNum);
				st.setEnglishScore(eScore);
				st.setMathScore(mScore);
				st.setName(name);
				
				Student st2 = new Student(name, classNum, eScore, mScore);
								
				for(int i =0; i < sAry.length; i++) {
					if(st != null && st.getClassNum() == classNum) {
						sAry[i] = st2;
						break;
					}
				}
				
			}else if(menu == 5) {//종료
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
