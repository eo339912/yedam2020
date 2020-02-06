package com.yedam.ljw.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("하준원");
		strList.add("박규림"); //strAry[0] = "hello"
		strList.add("홍성우");
		
		for(int i = 0; i <strList.size(); i++) {
			System.out.println(strList.get(i));
			}
		
		System.out.println("==================");
		
		strList.add(1, "이배진");
		for(int i = 0; i <strList.size(); i++) {
		System.out.println(strList.get(i));
		}
		
		System.out.println("==================");
		
		strList.remove(3);
		System.out.println("remove(3) 이후");
		for(int i = 0; i <strList.size(); i++) {
			System.out.println(strList.get(i));
			}
		
		List<Integer> intList = new LinkedList<>();
	}
}
