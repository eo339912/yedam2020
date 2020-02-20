package com.yedam.ljw.test;

public class Student {
	String name;
	int classNum;
	int englishScore;
	int mathScore;
	
	//get/set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	//생성자
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int classNum, int englishScore, int mathScore) {
		this.name = name;
		this.classNum = classNum;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	//메소드
	@Override
	public String toString() {
		return "Student [name=" + name + ", classNum=" + classNum + ", englishScore=" + englishScore + ", mathScore="
				+ mathScore + "]";
	}
	
	
	
	
	
}
