package com.haruns._02_Donguler;

import java.util.Scanner;

public class Do_While_Ornek002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi = sc.nextInt();
		int carpim = 1;
		System.out.print(sayi + " ! = ");
		do {
			if (sayi == 1) {
				System.out.print(sayi);
			}
			else {
				System.out.print(sayi + "*");
			}
			carpim *= sayi;
			sayi--;
		} while (sayi > 0);
		System.out.println(" = " + carpim);
	}
}