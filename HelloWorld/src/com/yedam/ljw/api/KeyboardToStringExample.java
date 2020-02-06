package com.yedam.ljw.api;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		System.out.println(readByteNo);
		System.out.println("__");
		
		String str = new String(bytes, 0, readByteNo);
		System.out.print(str);
		System.out.println("__");
		
		String str2 = new String(bytes, 0, readByteNo-2);
		System.out.print(str2);
		System.out.println("__");
	}
	
}
