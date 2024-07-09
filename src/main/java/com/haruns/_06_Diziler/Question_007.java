package com.haruns._06_Diziler;

import java.util.Scanner;

public class Question_007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dizi[] = new int[5]; //10 15 20 25 30
		int temp; //10
		for (int i = 0; i <dizi.length ; i++) {
			System.out.println((i+1)+". elemani giriniz : ");
			dizi[i]=sc.nextInt();
		}
		for (int i = 0; i <dizi.length/2 ; i++) {
			temp=dizi[i];
			dizi[i]=dizi[dizi.length-1-i];
			dizi[dizi.length-1-i]=temp;
		}
		for (int item:dizi){
			System.out.println(item);
		}
	}
}