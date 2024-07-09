package com.haruns._06_Diziler;

import java.util.Scanner;

public class Question_006 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dizi[]=new int[5];
		int dizi2[]=new int[5];
		for (int i = 0; i <dizi.length ; i++) {
			System.out.println((i+1)+". elemani giriniz : ");
			dizi[i]=sc.nextInt();
		}
		for (int i = 0; i <dizi2.length ; i++) {
			dizi2[i]=dizi[i];
		}
		System.out.println("1.Dizinin elemanlari : ");
		for (int item:dizi){
			System.out.print(item+" - ");
		}
		System.out.println("\n2.Dizinin elemanlari : ");
		for (int item:dizi2){
			System.out.print(item+" - ");
		}
	}
}