package com.yedam.ljw.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("Oracle");
		strSet.add("Program");
		strSet.add("Java");//중복값은 허용하지 않는다.
		
		System.out.println(strSet.size());
		
		for(String str : strSet) {
			System.out.println(str);
		}
	}
}
