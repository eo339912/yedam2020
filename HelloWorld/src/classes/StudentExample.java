package classes;

public class StudentExample {
	public static void main(String[] args) {
		//생성자를 통해서 Student에 인스턴트를 만들면서 값을 초기화해줌
		Student sn = new Student("choi", 20, 180, 70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);
		
		//stnt는 Student 타입의 변수이며, Student()에 담아줌
		//new Student()로 Student 클래스의 인스턴스를 만들었다.
		//동일한 패키지에 있는 Student클래스를 불러와서 인스턴스를 만들었기때문에
		//속성을 불러올때 선언해주지 않았다.
		Student stnt = new Student();
		
		stnt.name = "hong";
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		
		//Student클래스에서 지정해준 메소드가 호출되었다.
		stnt.study();
		stnt.eat();
		System.out.println(stnt.getAge());
		
		Student snt = new Student();
		snt.name = "Park";
		snt.height = 180;
		snt.weight = 75;
		snt.age = 30;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		
		snt.study();
		System.out.println(snt.getAge());
	}
	
}
