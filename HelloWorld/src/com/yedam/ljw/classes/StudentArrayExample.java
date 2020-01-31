package com.yedam.ljw.classes;

public class StudentArrayExample {
	public static void main(String[] args) {

		Student[] stdAry = new Student[3]; // Student class에 변수값으로 배열을 추가한다.

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();
		stnt.setName("hong");
		// stnt.age = -20;
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);

		Student snt = new Student();
		snt.setName("Park");
		// snt.age = 30;
		snt.setAge(-30); // Student파일에서 setAge메소드에 지정해준 if조건에 맞지 않아서 값이 0으로 나온다.
		snt.setHeight(180);
		snt.setWeight(75);

		stdAry[0] = sn;
		stdAry[1] = stnt;
		stdAry[2] = snt;

		stdAry[2] = stdAry[0];
		stdAry[0] = stdAry[1];
		stdAry[1] = stdAry[2];

		for (int i = 0; i < stdAry.length; i++) {
			if (stdAry[i].getName().equals("choi")) {
				System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
			}

			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
			// System.out.println(stdAry[i]) //주소값이 나온다.
		}

		// **************
		int sortAry[] = { 15, 13, 20, 25, 7, 17 };
		int sortAry2 = 0;

		for (int j = 0; j < sortAry.length - 1; j++) {
			for (int i = 0; i < sortAry.length - 1; i++) {
				// System.out.print(sortAry[i] + " ");
				if (sortAry[i] > sortAry[i + 1]) {
					sortAry2 = sortAry[i];
					sortAry[i] = sortAry[i + 1];
					sortAry[i + 1] = sortAry2;
				}
			}
		}
		for (int j = 0; j < sortAry.length; j++) {
			System.out.print(sortAry[j] + " ");
		}
		
		System.out.println(" ");
		
		for (int j = 0; j < sortAry.length - 1; j++) {
			for (int i = 0; i < sortAry.length - 1; i++) {
				// System.out.print(sortAry[i] + " ");
				if (sortAry[i] < sortAry[i++]) {
					sortAry2 = sortAry[i];
					sortAry[i] = sortAry[i++];
					sortAry[i++] = sortAry2;
				}
			}
		}
		for (int j = 0; j < sortAry.length; j++) {
			System.out.print(sortAry[j] + " ");
		}
		// **************
	}
}
