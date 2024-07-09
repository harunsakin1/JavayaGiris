package com.haruns._06_Diziler;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		//Tanimlama :
		int []sayilar={5,6,7}; // Tek boyutlu dizi
		int [][]koordinatlar={ // Iki boyutlu dizi satir:3 sutun:2
				{1,2},
				{3,4},
				{5,6}
		};
		int [][]koordinatlar2={ // Iki boyutlu dizi satir:2 sutun:3
				{1,2,3},
				{4,5,6}
		};
		int[][]koordinatlar3=new int[3][2];
		koordinatlar3[0][0]=1;
		koordinatlar3[0][1]=2;
		
		koordinatlar3[1][0]=3;
		koordinatlar3[1][1]=4;
		
		koordinatlar3[2][0]=5;
		koordinatlar3[2][1]=6;
		
		for (int i = 0; i <koordinatlar3.length ; i++) {
			for (int j = 0; j <koordinatlar3[0].length ; j++) {
				System.out.println(koordinatlar3[i][j]);
			}
		}
	}
}