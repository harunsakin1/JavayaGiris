package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int toplam=0;
		int sayi=sc.nextInt();
		for (int i = 1; i <=sayi ; i++) {
			toplam+=i;
		}
		System.out.println("Toplam : "+toplam);
	}
}