
public class WhileExample {
	public static void main(String[] args) {
		/*****************************************/
		//i가 5이상이 되면 while문에서 빠져나와라
		int i = 0;
		while(true) {
			System.out.println(i);
			i++;
			if(i >= 5) {
				break;
			}
		}
		
		//랜덤으로 나오는 숫자가 6이되면 while문에서 빠져나와라
		int ii = 0;
		while(true) {
			ii =(int)(Math.random() * 6) + 1;
			System.out.println(ii);
			if(ii == 6) {
				break;
			}
		}
		
	
		//1~100까지 수 중에서 짝수의 합을 구해라.
				int sum = 0;
				i = 1;
				while(i <= 100) {
					if(i % 2 == 0) {
						sum = sum + i;
					}
					i++;
				}
				System.out.println("합계는" + sum);

		//구구단 5단을 출력하는 프로그램
				sum = 5;
				i = 1;
				while(i <= 9) {
					System.out.println(sum + "*"+ i + "=" + sum*i);
					i++;
				}
				
				i = 1;
				while(true) {
					System.out.println(sum + "*"+ i + "=" + sum*i);
					
					if(i >= 9) {
					 break;
					}
					i++;
				}
				

				
				
				
		/*****************************************/
	}
}
