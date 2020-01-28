
public class SwitchExample {
	public static void main(String[] args) {
		/*랜덤 수를 불러온다.*/
		System.out.println(Math.random());
		
		/*랜덤으로 1~5사이에 정수(int때문)를 불러온다. */
		int result = (int) (Math.random() * 6);
		System.out.println(result);
		
		/*랜덤으로 1~6사이에 정수를 불러온다. */
		result = (int) (Math.random() * 6) + 1;
		switch(result) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		System.out.println(result);
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("A~D 임의의 문자입력");						
//		String result2 = scn.nextLine();
//		
//		switch(result2) {
//		case "A":
//			System.out.println("A가 나왔습니다.");
//			break;
//		case "B":
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case "C":
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case "D":
//			System.out.println("4번이 나왔습니다.");
//			break;
//		}
		
		
		int grade = 85;
		if(grade >= 90) {
			System.out.println("A");			
		}else if(grade >= 80) {
			System.out.println("B");
		}
		
		grade = 80;
		int result2 = grade/10;
		switch(result2) {
		case 10:
			System.out.println("A+번이 나왔습니다.");
			break;
		case 9:
			System.out.println("A번이 나왔습니다.");
			break;
		case 8:
			System.out.println("B번이 나왔습니다.");
			break;
		default:
			System.out.println("F번이 나왔습니다.");
			break;
		}
		
		if(result2 == 10) {
			System.out.println("A+번이 나왔습니다.");
		}else if(result2 == 9) {
			System.out.println("A번이 나왔습니다.");
		}else if(result2 == 8) {
			System.out.println("B번이 나왔습니다.");
		}else{
			System.out.println("F번이 나왔습니다.");
		}
		
		
		
		
		
	}
}
