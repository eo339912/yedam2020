package com.yedam.ljw.classes;

public class Student {
	//필드 ->속성
	String name; 
	int age;	
	int height;
	int weight;
	static String major;
	//private String name;
	//private외부에서 사용하지 못하게 함
	//다른 파일에서 사용하지 못함
	//생성자나 메소드를 통해서 접근할 수 있다.
	
	/*********************************************************/
	
	//생성자 (인스턴스를 만들면서 필드값을 초기화)
	//default생성자, 만들지 않아도 있다고 여겨진다.
	//Student(){} 면 default로 다른 패키지에서 사용할 수 없기때문에 public으로 바꿔줌
	public Student(){
		
	}
	
	public Student(String name){
		//클래스의 필드를 불러올때 this를 사용한다. (겹치는게 없을때 생략가능)
		this.name = name;
	}
	Student(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
		
	/*********************************************************/
		
	//메소드는 리턴타입이 있어야됨
	//메소드 -> 기능
	public void study() {
		System.out.println("공부한다.");
	}
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		}
		
		else {
			this.age = 0;
		}
	}
	
	int getAge() {
		return age;
	}//age라는 필드를 반환

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
