package com.yedam.ljw.referenceType;

public class ExerciseChapter5 {
public static void main(String[] args) {
	int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
	System.out.println(array.length);
	System.out.println(array[2].length);
	
	//Exercise07
	int max = 0;
	int[] array2 = {1, 5, 3, 8, 2};
	
	for(int i=0; i < array2.length; i++) {
		if(max < array2[i]) {
			max = array2[i];
		}
	}
	
	System.out.println("max : " + max);
	
	//Exercise08
	int[][] array3 = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
	
	int sum = 0;
	double avg = 0.0;
	
	for(int i=0; i<array3.length; i++) {
		for(int j=0; j<array3[i].length; j++) {
			sum = sum + array3[i][j];
			System.out.print(array3[i][j] + " ");
		}
		avg = avg+array3[i].length;
		System.out.println();
	}
	
	avg = sum/avg;
	
	System.out.println("sum : " + sum);
	System.out.println("avg : " + avg);
	
	sum = 0;
	sum= 95 + 86 + 83 + 92 + 96 + 78 + 83 + 93 + 87 + 88; 
	System.out.println("sum : " + sum);
		
}

}
