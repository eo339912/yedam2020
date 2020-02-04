package com.yedam.ljw.classes.extendPkg;

public class UnivFriend extends Friend{
	private String university;

	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	} //값을 가져옴

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override //Friend 탭에 있는 값을 재정의
	public void showInfo() {
		//super.showInfo();
		System.out.println("학교친구 이름은 " + super.getName());
		System.out.println("학교친구 전화번호는 " + super.getPhone());
		System.out.println("학교는 " + university);
	}
	
	
	
}
