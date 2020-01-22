public class IfElseExample {
	public static void main(String[] args) {
/*******************************************************/
		int result = 85;
		if(result >= 90) {
			System.out.println("A학점");
		}else if(result >= 80){
			System.out.println("B학점");			
		}else if(result >= 70){
			System.out.println("C학점");			
		}else {
			System.out.println("F학점");
		}
		
		if(result >= 90) {
			if(result >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
		}else if(result >= 80){
			if(result >= 85) {
				System.out.println("B+학점");
			}else {
				System.out.println("B학점");
			}		
		}else if(result >= 70){
			if(result >= 75) {
				System.out.println("C+학점");
			}else {
				System.out.println("C학점");
			}		
		}else {
			System.out.println("F학점");
		}
		
		
		int result2 = 80;
		if(result2 >= 90) {
			System.out.println("A학점");
		}if(result2 >= 80){
			System.out.println("B학점");			
		}if(result2 >= 70){
			System.out.println("C학점");			
		}
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=1; i <= 5; i++) {
			sum2 = sum2 +i;
			System.out.println(sum2);	
		}
		
		//1~100중 짝수만 더한다.
		int sum3 = 0;
		for(int i=1; i <= 100; i++) {
			if(i%2 == 0) {
				sum3 = sum3+i;
				System.out.println(sum3);
			}	
		}
		
		int var1 = 3;
		for(int i=1; i <= 9; i++) {
			//int var2 = var1 * i;
			//System.out.println(var1 + "*" + i + "=" + var2);
			
			System.out.println(var1 + "*" + i + "=" + var1 * i);
//			3*1 = 3
//			3*2 = 6
		}
		
/******************************************************/
	}
}
