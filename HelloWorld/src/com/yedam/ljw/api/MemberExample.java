package com.yedam.ljw.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "park";
		m1.age=10;
		Member m2 = new Member();
		m2.name = "kim";
		m2.age=10;	
		System.out.println(m1.equals(m2));
		//Member.java 파일에서 name, age값과 비교하도록 설정해두었다.
		System.out.println(m1.hashCode());
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		
	}
}
