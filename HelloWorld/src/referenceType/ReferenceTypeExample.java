package referenceType;

public class ReferenceTypeExample {
	public static void main(String[] args) {
	/****************************************/
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//String str3 = new String("Hello");
		//str3 = null;
		
		System.out.println(str1 == str2); //false -> 주소값을 불러오기 때문
		System.out.println(str1 + "," + str2);
		System.out.println(str1.equals(str2));//true -> 문자열이 같은지 비교한다.		
		//System.out.println(str3.toString());//원래 있던 값을 null로 끊음, NullPointerException
		
		
	/****************************************/	
	}
}
