package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_007 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi=sc.nextInt();
		String tekCift=(sayi%2==0)?"Cift":"Tek";
		System.out.println(sayi+" sayisi "+ tekCift+" sayidir");
	}
}