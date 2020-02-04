package com.yedam.ljw.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10);
		d1.powerOn(); //CellPhone 메소드(부모)
		d1.turnOnDmb(); //DmbCellPhone 메소드(자식)
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다.");//CellPhone 메소드
		d1.receiveMessage("안녕하세요.");
		d1.powerOff();
		
		//자식의 인스턴스를 부모의 타입에 담는다. 메소드는 x?
		CellPhone c1 = new DmbCellPhone(); //자동형변환 promotion 
		DmbCellPhone d2 = (DmbCellPhone) c1; //강제형변환 casting
		d2.turnOnDmb();
		d2.changeChannel(40);
		d2.turnOffDmb();
		
		CellPhone c11 = new DmbCellPhone(); 
		
		if(c1 instanceof DmbCellPhone) {
			DmbCellPhone d21 = (DmbCellPhone) c11; //강제형변환 casting
			d21.turnOnDmb();
			d21.changeChannel(40);
			d21.turnOffDmb();
		}
		
		//CellPhone c2 = new CellPhone();
		//DmbCellPhone d3 = (DmbCellPhone)c2;
		
		CellPhone c2 = new CellPhone();
		if(c2 instanceof DmbCellPhone ) { //instance가 담길 수 있는지 확인
			DmbCellPhone d3 = (DmbCellPhone)c2;
		}else {
			System.out.println("casting 불가.");
		}
		
		
	}
}
