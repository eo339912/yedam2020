package com.yedam.ljw.api;

public class Member {
	String name;
	int age;
	
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		Member m = (Member)obj; //행변환?
		return this.name == m.name || this.age == m.age;
	}

	@Override
	public int hashCode() {
		//return super.hashCode();
		return age;
	}
	
}
