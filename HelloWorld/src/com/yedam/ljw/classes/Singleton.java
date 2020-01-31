package com.yedam.ljw.classes;

public class Singleton {
	//클래스의 인스턴스 정의
	//private 클래스차원에서만 사용가능/외부에서 사용불가능
	//static로 정의한 메소드를 통해서만 접근이 가능하다.
	private static Singleton s1 = new Singleton();
	
	private Singleton() {
		
	}
	
	//메소드를 정의
	static Singleton getInstance(){
		return s1;
	}
}
