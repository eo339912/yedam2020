package com.yedam.ljw.referenceType;

//1. 1차원 배열 -> 10개크기
//2. 2차원 배열 -> [5][5]배열
//3. 야구게임
public class ForWhileExample {
	
	public static void main(String[] args) {
		int[] Array =new int[10];
		mathod1(Array);
		
		System.out.println("=====================================");
		
		int[][] Array2 =new int[5][5];
		//int[][] Array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		mathod2(Array2);
	}
	
	public static void mathod1(int[] intAry) {
		
		//int[] intAry = new int[6]
		int cnt=1;
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = cnt++;
		}
		
		for(int i=0; i<intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
	}
	
	public static void mathod2(int[][] intAry) {
		int cnt=1;
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {				
				intAry[i][j] = cnt++;
			}
		}
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {	
				System.out.printf("%3d", intAry[i][j]);
			}
			System.out.println();
		}
		System.out.println("=====================================");
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {				
				System.out.printf("%3d", intAry[j][i]);
				}
			System.out.println();
		}
	}
}


