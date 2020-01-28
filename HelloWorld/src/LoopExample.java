
public class LoopExample {
public static void main(String[] args) {
	// 1~100 중 3의 배수이면서 7의 배수 출력
	for(int i = 1; i <= 100; i++) {
		if(i%3 == 0 && i%7 == 0 ) {
			System.out.println(i);
		}
	}

	
	int i = 1;
	while(i <= 100) {
		if(i%3 == 0 && i%7 == 0 ) {
			System.out.println(i);
		}
		i++;
	}
	
/******************************************************************/
}
}
