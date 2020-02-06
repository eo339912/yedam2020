package com.yedam.ljw.generic.before;

public class Box {
	//필드 . object타입이면 다받을 ㅅ있다.
	private Object obj;
	
	//메소드
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
}
