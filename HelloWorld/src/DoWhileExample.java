import java.util.Scanner;

public class DoWhileExample {
public static void main(String[] args) {
	/************************************************************/
	
	//처음 do구문을 먼저 실행한 후 while조건을 받는다.
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i == 5);
		
		i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 5);
		
		/*import java.util.Scanner; 상단에 추가한다.*/
		Scanner scn = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		System.out.println("종료하려면 q입력>");
		String input = "";
		
		do {
			System.out.println(">");
			input = scn.nextLine();
			System.out.println("-" + input);
		}while(!input.equals("q")); /*q가 아닐동안 do를 실행한다.*/
		System.out.println("프로그램 종료");
		
/************************************************************/
}
}
