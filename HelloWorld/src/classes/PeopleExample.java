package classes;

public class PeopleExample {
	public static void main(String[] args) {
		People pl2 = new People("Park");
		System.out.println(pl2.name);
		System.out.println(pl2.age);
		
		People pl = new People("Park", 20, 170);
		System.out.println(pl.name);
		System.out.println(pl.age);
		System.out.println(pl.height);
		
		People pp = new People();
		pp.name = "Lee";
		pp.age = 15;
		pp.height = 180;
		
		System.out.println(pp.name);
		System.out.println(pp.age);
		System.out.println(pp.height);
		
		//메소드
		pp.information();
		System.out.println(pp.getAge());
		System.out.println(pp.getHeight());
	}
}
