package com.yedam.ljw.classes.abstractPkg;

public class Dog extends Animal{
	
	Dog(){
		kind = "멍멍이";
	}
	
	@Override
	void sound() {
		System.out.println(kind + "멍~");
	}
	
	@Override
	void sleep() {
		System.out.println(kind + "잠들다.");
	}
}
