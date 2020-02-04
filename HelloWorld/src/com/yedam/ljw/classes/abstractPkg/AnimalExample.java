package com.yedam.ljw.classes.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		//추상클래스는 직접 인스턴스를 생성하지 못한다.
		
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		cat.breathe();
		
		Animal animal = null;
		animal = cat;
		animal.sound();
		
		animal = dog;
		animal.sound();
	
		System.out.println("==========================");
		animalSound(cat);
		animalSound(dog);
		
		animalSleep(cat);
		animalSleep(dog);
	}
	
	static void animalSound(Animal animal) {
		animal.sound();
	}
	
	static void animalSleep(Animal animal) {
		animal.sleep();
	}
}
