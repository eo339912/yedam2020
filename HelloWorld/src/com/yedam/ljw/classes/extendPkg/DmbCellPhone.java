package com.yedam.ljw.classes.extendPkg;

public class DmbCellPhone extends CellPhone{
	int channel;
	public DmbCellPhone() {
		//super(); //부모클래스를 가져오겠다는 의미, super()는 defult 값으로 없어도 됨
		super();
	}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 DMB방송 수신.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 수신 종료.");
	}
	
}
