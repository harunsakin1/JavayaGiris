package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_004 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double urunFiyat;
		System.out.println("Urun fiyati giriniz : ");
		urunFiyat=sc.nextDouble();
		sc.close();
		if (urunFiyat>=1000){
			System.out.println("Fiyat : "+urunFiyat*0.8);
		}
		else if (urunFiyat>=500){
			System.out.println("Fiyat : "+urunFiyat*0.9);
		}
		else if (urunFiyat>=100){
			System.out.println("Fiyat : "+urunFiyat*0.95);
		}
	}
}