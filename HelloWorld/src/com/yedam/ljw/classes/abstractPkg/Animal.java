package com.yedam.ljw.classes.abstractPkg;

public abstract class Animal { //추상클래스
	//필드
	String kind;
	//기본생성자 존재.
	
	//메소드
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	abstract void sound(); //Animal이라는 실제 클레스를 통해서 sound라는 추상클레스가 구현된다.
	abstract void sleep(); // 추상메소드를 추가해주면 animal메소드를 상속받는 클래스에 override재정의 해줘야된다.
}
