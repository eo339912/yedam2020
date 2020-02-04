package com.yedam.ljw.classes.extendPkg;

public class CellPhone {
	private String model;
	private String color;
	
	public CellPhone() {
		
	}
	
	public CellPhone(String model, String color) {
		super(); //상속받은 부모가 없음에도 super를 사용하는 이유는 object 파일을 상속받았기때문
		this.model = model;
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendMessage(String message) {
		System.out.println("자신:" + message);
	}
	void receiveMessage(String message) {
		System.out.println("상대방:" + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
