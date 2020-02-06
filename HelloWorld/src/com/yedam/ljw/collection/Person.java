package com.yedam.ljw.collection;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		//return this.age - o.age;//결과가 마이너스면 앞부분이 작다.
		//return this.name.compareTo(o.name);
		return o.name.length() - this.name.length() ;
	}
	
	
}
