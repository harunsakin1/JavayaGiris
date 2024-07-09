package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_009 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Boyut girin : ");
		int boyut=sc.nextInt();
		for (; boyut>0 ; boyut--) { // Satir sayisi
			for (int i = 1; i <=boyut ; i++) { // satirdaki yildiz sayisi azalarak gelmeli
				System.out.print("*");
			}
			System.out.println();
		}
	}
}