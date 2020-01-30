package classes;

import java.util.Scanner;//ctrl + shift + o

public class Calculator {
	public static void main(String[] args) {
		int a=10, b=20;
		int result = sum(a, b);
		result = multi(a,b);
		
		cal(10,20,"/");
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("사칙연산 부호 : +, -, *, / q:종료");
			String operator = scn.nextLine();
			
			if(operator.equals("q")) {
				break;
			}
			
			System.out.print("첫번째 수 입력 :");
			System.out.println();
			int num1 = scn.nextInt();
			System.out.print("두번째 수 입력 :");
			System.out.println();
			int num2 = scn.nextInt();
			scn.nextLine(); //수 입력 후 추가된 엔터값을 넣어줘야된다.
			cal(num1, num2, operator);

			
		}
		System.out.println("종료.");
		
	}

	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum(a, b);
		else if (oper.contentEquals("*"))
			result = multi(a, b);
		else if (oper.contentEquals("-"))
			result = minus(a, b);
		else if (oper.contentEquals("/"))
			result = divide(a, b);
		System.out.println(result);

	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(int num1, int num2) {
		return (double) num1 / num2;
	}
}
