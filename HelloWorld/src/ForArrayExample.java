
public class ForArrayExample {
public static void main(String[] args) {
	//1) 배열의 크기가 100인 배열
	int [] intNum = new int[100];
	for(int i=0; i<100; i++) {
		intNum[i] = i + 1;
		System.out.println(intNum[i]);
		
	}
	
	System.out.println("===========================");
	//2) 배열의 홀수번째 위치한 값을 합하는 for 구문
	int sum = 0;
	for(int i=0; i<100; i++) {
		if(i % 2 == 0) {
			sum = sum + intNum[i];
		}
	}
	System.out.println(sum);
	
	
}
}
