package com.yedam.ljw.interfaces;

public interface RemoteControl { //interface는 구현하는 클레스로....무조건 재정의??
	//(상수)필드
	public static final int MAX_VOLUM = 10;
	//final 값이 정의되면 값이 고정된다.
	int MIN_VOLUME = 0;
	//생성자 (x)
	//(추상)메소드
	public abstract void turnOn();
	public void turnOff();
}
