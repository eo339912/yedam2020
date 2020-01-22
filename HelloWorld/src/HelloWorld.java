import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.html.MinimalHTMLWriter;

public class HelloWorld{
	/*
	 * 2020.01.21 이지원
	 * 
	 */
	public static void main(String[] args){
		System.out.println("Hello, Welcome to the java world!");
		int age = 30;
		int year = 2020;
		System.out.println("나이는 " + age);
		System.out.println("년도는 " + year);
		
		int height = 170;
		int weight = 60;
		
		year = 2021;
		//변수의 값을 수정할 수있다.
		System.out.println("년도는 " + year);
		
		//여러가지 변수이름을 사용할때는 첫글자 빼고 대문자사용
		//대소문자가 변경되면 다른 변수 취급한다.
		int firstDayOfYear = 1;
		int firstdayofyear = 1;
		
		//int값은 4byte값을 가지기 때문에 일정이상 값을 넘어가면
		//값이 최저값이 나오게 된다. 
		int sum = 0;
		int firstValue = 1000000000;
		int secondValue = 2000000000;
		sum = firstValue + secondValue;
		System.out.println("두수의 합은 : " + sum);
		
		//정수형 연산은 (int type)정수값으로 계산된다
		long sum2 = 0;
		int firstValue2 = 1000000000;
		int secondValue2 = 2000000000;
		sum2 = firstValue2 + secondValue2;
		System.out.println("두수의 합은 : " + sum2);
		

		//연산은 큰타입을 따라서간다.
		long sum3 = 0;
		int firstValue3 = 1000000000;
		int secondValue3 = 2000000000;
		sum3 = (long)firstValue3 + secondValue3;
		System.out.println("두수의 합은 : " + sum3);
		
		//변수 선언은 한라인에 사용해도 된다.(여러개의 변수 선언)
		int num1, num2, num3, num4;
		//초기값은 변수를 선언하면서 줄 수 있다.
		int num5 = 90;
		
		//변수값이 초기화 되기전에 대입하면 에러가 발생한다.
		//int summary = num1 + num2
		
		//값을 할당후에 대입해야된다.
		num3 = 10;
		num4 = 20;
		int summary = num3 + num4;
		System.out.println("두수의 합은 : " + summary);
		
		
		
	}
}
