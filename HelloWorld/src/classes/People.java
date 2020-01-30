package classes;

public class People {
	//필드
	String name;
	int age;
	int height;
	
	//생성자
	People(){
	}
	People(String name){
		this.name = name;
	}
	People(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//메소드
	void information(){
		System.out.println("이름, 나이, 키");
	}
	int getAge(){
		return age;
	}
	int getHeight(){
		return height;
	}
	
}
