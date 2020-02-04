package com.yedam.ljw.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
		
		t1.turnOn();
		t1.turnOff();
		
		rc.turnOn();
		rc.turnOff();
	}
}
