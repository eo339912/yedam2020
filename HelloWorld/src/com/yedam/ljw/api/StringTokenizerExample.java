package com.yedam.ljw.api;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); 
		System.out.println(countTokens); //꺼내지않고 남아있는 토큰의 수
		
		String token = st.nextToken(); //토큰을 하나씩 꺼내옴
		System.out.println(token);
		token = st.nextToken();
		System.out.println(token);
		token = st.nextToken();
		System.out.println(token);
		
				
		//how1_2
		text = "홍길동2/이수홍2/박연수2";
		
		st = new StringTokenizer(text, "/");
		//countTokens = st.countTokens(); 
		System.out.println(countTokens);
		
		for(int i=0; i<countTokens; i++) {
			String token2 = st.nextToken();
			System.out.println(token2);
			
		}
		System.out.println();
		
//		how2 : 남아있는 토큰을 확인하고 while문을 루핑
		text = "홍길동3/이수홍3/박연수3";
		//countTokens = st.countTokens(); 
		System.out.println(countTokens);
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { //토큰이 남아있을때까지 루핑한다.
			String token3 = st.nextToken();
			System.out.println(token3);
		}
	}
}
