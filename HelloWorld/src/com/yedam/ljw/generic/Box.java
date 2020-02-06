package com.yedam.ljw.generic;

public class Box<T> { 	//box클래스가 호출되는 시점에 타입을 지정해준다.
						//타입으로 인한 오류가 발생하는 것을 막아준다.
	private T obj; //타입 미정
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}
