public class VariableScope {
	public static void main(String[] args) {
		int  sum, var1;
		
		//if(false) if안의 내용을 반환하지 않겠다는 의미
		if(true) {
			int var2;
			var1 = 10;
			var2 = 20;
			sum = var1 + var2;
			
			System.out.println("두 수의 합은" + sum);
		}
		
		System.out.println(var1);
		//var2는 if안에서 선언되었기 때문에 에러가 발생한다.
		//System.out.println(var2);
		//if블록 안에서 값이 할당되었기 때문에 값이 나타난다.
		System.out.println(sum);
		
		sum = 50; //초기화
		System.out.println(sum);
		
		//for = 반복문 i가 5보다 작은 값까지만 for블록 안의 수식을 실행한다.
		for (int i = 0; i< 5; i++) {
			var1 = var1 + i;
			int var2 = 10;
			System.out.println("var1: " + var1 + ", var2:" + var2);
			
		}
		
		System.out.println("var1: " + var1);
		
		boolean trueOrFalse = false;
		if(!trueOrFalse) {
			System.out.println("참입니다.");
		}
		
		if(3==5) {
			System.out.println("3==5");
		}
		
		if(3!=5) {
			System.out.println("3!=5");
		}
		
	}
}
