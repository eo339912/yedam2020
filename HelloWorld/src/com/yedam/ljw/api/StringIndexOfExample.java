package com.yedam.ljw.api;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		location = subject.indexOf("자바");
		System.out.println(location);
		
		location = subject.indexOf("바자");
		System.out.println(location);
		
		location = subject.indexOf("그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) { //-1은 특정문자열이 포함되지 않는다는 뜻아더,
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군용");
		}
	}
}
