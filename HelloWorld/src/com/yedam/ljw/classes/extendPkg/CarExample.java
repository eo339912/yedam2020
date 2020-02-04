package com.yedam.ljw.classes.extendPkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i< 5; i++) {
			int problemPosition = car.run();
			switch(problemPosition) {
			case 1:
				System.out.println("앞왼쪽 한국타이어교체.");
				car.tires[0] = new HankookTire("앞왼쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어교체.");
				car.tires[1] = new KumhoTire("앞오른쪽", 18);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어교체.");
				car.tires[2] = new HankookTire("뒤왼쪽", 20);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어교체.");
				car.tires[3] = new KumhoTire("뒤오른쪽", 22);
				break;
//			case 1:
//				System.out.println("앞왼쪽 한국타이어교체.");
//				car.frontLeft = new HankookTire("앞왼쪽", 10);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 금호타이어교체.");
//				car.frontLeft = new KumhoTire("앞오른쪽", 10);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 한국타이어교체.");
//				car.frontLeft = new HankookTire("뒤왼쪽", 10);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 금호타이어교체.");
//				car.frontLeft = new KumhoTire("뒤오른쪽", 10);
//				break;
			}
			System.out.println("--------------------------------------");
		}
		System.out.println("주행종료.");
	}
	
}
