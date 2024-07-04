package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sehir giriniz : ");
		String sehir=sc.nextLine();
		sc.close();
		int tutar=0;
		if (sehir.equalsIgnoreCase("Ankara")){
				tutar=100;
		}
		else if (sehir.equalsIgnoreCase("Istanbul")){
			tutar=200;
		}
		else if (sehir.equalsIgnoreCase("Izmir")){
			tutar=150;
		}
		else {
			System.out.println("Geçerli bir sehir seçiniz.");
		}
		System.out.println("Tutar : "+tutar);
		
	}
}