package com.yedam.ljw.common;

import com.yedam.ljw.classes.Student;

public class StudentExample {
	public static void main(String[] args) {
		System.out.println(args[2]);
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		com.yedam.ljw.classes.Student stn = new com.yedam.ljw.classes.Student();
		stn.study();
		com.yedam.ljw.classes.Student snt = new com.yedam.ljw.classes.Student("name");
		snt.eat();
		
		com.yedam.ljw.referenceType.Student stn2 = new com.yedam.ljw.referenceType.Student();
		System.out.println(stn2);
	}
}
