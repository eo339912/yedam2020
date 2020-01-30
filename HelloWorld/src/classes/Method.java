package classes;

public class Method {

	int leftField;
	int rightField;
	
	public int getLeftField() {
		return leftField;
	}
	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}
	public int getRightField() {
		return rightField;
	}
	public void setRightField(int rightField) {
		this.rightField = rightField;
	}
	
	public int thisSum() {
		return leftField + rightField;
	}
	
	public int thisMinus() {
		return leftField - rightField;
	}
	/*****************************************************/
	public static void main(String[] args) {
		sum(1,2);
		
		
		int num1 = 10, num2 = 15;
		int result = sum(num1, num2) * minus(num1, num2);
		System.out.println(result);
	}
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	public static int minus(int a, int b) {
		return a - b;
	}
	
}
