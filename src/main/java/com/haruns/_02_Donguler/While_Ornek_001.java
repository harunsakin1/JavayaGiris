package com.haruns._02_Donguler;

import java.util.Scanner;

public class While_Ornek_001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		System.out.println("Sayi Giriniz : ");
//		while (sayi!=0){
//			System.out.println("Sayi Giriniz : ");
//			sayi=sc.nextInt();
//			if (sayi!=0){
//				toplam=toplam+sayi;
//			}
//			else {
//				System.out.println("Toplam : "+toplam);
//			}
//		}
		while ((sayi = sc.nextInt()) != 0) {
			toplam += sayi;
		}
		System.out.println("Toplam : " + toplam);
	}
}