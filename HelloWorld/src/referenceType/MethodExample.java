package referenceType;

public class MethodExample {
/**********************************************/
public static void main(String[] args) {
	int num1, num2;
	int result;
	
	num1 = 10;
	num2 = 20;
	multiAfterSum(num1, num2);
	//result = (num1 + num2) * 3;
	
	//System.out.println(result);
	
	int a1, a2;
	a1 = 100;
	a2 = 200;
	multiAfterSum(a1, a2);
	//result = (a1 + a2) *3;
	//System.out.println(result);
	

}

//메소드 (method)
public static void multiAfterSum(int a, int b) {
		int n1, n2, rslt;
		n1 = a;
		n2 = b;
		rslt = (n1 + n2) *3;
		System.out.println(rslt);
}
/**********************************************/
}
