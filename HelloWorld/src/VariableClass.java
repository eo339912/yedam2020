
public class VariableClass {
	//1. variableclass 클래스 선언
	//2. int sum, num1, num2, num3
	//3. num1 = 100, num2 = 90, num3 = 80
	//4. sum -> num1, num2, num3 할당
	//5. sum의 값을 콘솔화면에 출력

	public static void main(String[] args){
		int sum = 0;
		int num1 = 100;
		int num2 = 90;
		int num3 = 80;
		
		sum = num1 + num2 + num3;
		
		System.out.println("num1 + num2 + num3 =" + sum);
	}

}
