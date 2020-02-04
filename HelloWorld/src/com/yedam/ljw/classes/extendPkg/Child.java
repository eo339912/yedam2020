package com.yedam.ljw.classes.extendPkg;

public class Child extends Parent{

	String field2;
	void method2() {
		System.out.println("자식클래스의 메소드2");
	}
	
	@Override //override/implament methods
	void method1() {
		//super.method1(); //부모클래스의 정보를 불러오겠다.
		System.out.println("자식클래스의 메소드1");
	}

	@Override
	public String toString() {
		return "Parent [field2=" + field2 + "]";
	}
}
