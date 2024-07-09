package com.haruns._06_Diziler;

import java.util.Scanner;
/*Dizideki bir ögeyi arama
5 elemanli elemanlari kullanici tarafindan girilen bir dizi olusturun.
kullanicinin girdigi sayi dizide varsa BULUNDU, yoksa BULUNAMADI seklinde mesaj versin*/
public class Question_005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] dizi=new int[5];
		for (int i = 0; i <dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz :");
			dizi[i]=sc.nextInt();
		}
		System.out.println("Aranacak sayiyiy giriniz : ");
		int aranacakSayi=sc.nextInt();
		// FLAG MANTIGI
		boolean bulunduMu=false;
		for (int i = 0; i <dizi.length ; i++) {
			if (dizi[i]==aranacakSayi){
				bulunduMu=true;
				break;
			}
		}
		System.out.println(bulunduMu?"BULUNDU":"BULUNAMADI");
	}
}