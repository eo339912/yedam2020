package com.yedam.ljw.classes.extendPkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver d1 = new Driver();
		Vehicle vehicle = new Vehicle();
		d1.drive(vehicle);
		vehicle = new Bus(); //vehicle과 부모자식관계로 자동형변환이 일어난다.
		d1.drive(vehicle);
		vehicle = new Truck();
		d1.drive(vehicle);
		
		
	}
}
