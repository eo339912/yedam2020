package com.yedam.ljw.classes.abstractPkg;

public class Cat extends Animal{
	
	Cat(){
		kind = "야옹이";
	}
	
	@Override
	void sound() {
		System.out.println( kind +"야옹~");
	}

	@Override
	void sleep() {
		System.out.println(kind + "잠들다.");
	}

	

}
