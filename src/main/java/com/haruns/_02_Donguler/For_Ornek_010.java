package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Boyut Giriniz : ");
		int boyut = sc.nextInt();
		for (int i = 1; i <= boyut; i++) {
			for (int j = i; j < boyut; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");

//		for (int i=1; i<=boyut; i++) {
//			for(int j=i; j<=boyut;j++) {
//				System.out.print("  ");
//			}
//			for (int k=1; k<=i; k++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println(" ");
//		}
		}
	}
}