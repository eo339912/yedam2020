package com.yedam.ljw.api;

public class StringReplaceExample {
	public static void main(String[] args) {//대소문자 구분합니다.
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
	}
}
