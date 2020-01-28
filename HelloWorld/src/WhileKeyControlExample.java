
public class WhileKeyControlExample {
public static void main(String[] args) throws Exception{
	/***********************************************/
		
	 boolean run = true;
	 int speed = 0;
	 int keyCode = 0;
	 
	 while(run) {
		 if(keyCode != 13 && keyCode != 10) {
			 System.out.println("-----------------------");
			 System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			 System.out.println("-----------------------");
			 System.out.println("선택 : ");
		 }
		 
		 keyCode = System.in.read();//1 Enter => 49, 13, 10
		 
		 if (keyCode == 49) {
			 speed++;
			 System.out.println("현재 속도 = " + (speed * 5));
		 }else if(keyCode == 50) {
			 speed--;
			 System.out.println("현재 속도 =" + speed % 5);
		 }else if(keyCode == 51) {
			 run = false;
		 }else if(keyCode == 13) {
			 System.out.println("13출력");
		 }else if(keyCode == 10) {
			 System.out.println("10출력");
		 }
	 }
	System.out.println("프로그램 종료");
	/***********************************************/
}
}
