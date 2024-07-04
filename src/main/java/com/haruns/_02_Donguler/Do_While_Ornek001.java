package com.haruns._02_Donguler;

import java.util.Scanner;

public class Do_While_Ornek001 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int toplam=0,sayi;
		do {
			System.out.println("Bir sayi giriniz : ");
			sayi=sc.nextInt();
			toplam+=sayi;
		}while (sayi!=0);
		System.out.println("Toplam : "+toplam);
	}
}