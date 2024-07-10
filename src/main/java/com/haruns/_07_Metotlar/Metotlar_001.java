package com.haruns._07_Metotlar;

import java.util.Scanner;

public class Metotlar_001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayiyi Giriniz : ");
		int sayi1 = sc.nextInt();
		System.out.println("2. Sayiyi Giriniz : ");
		int sayi2 = sc.nextInt();
		int toplam = topla(sayi1, sayi2);
		System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);
		int buyukSayi = max(sayi1, sayi2);
		System.out.println("\nBuyuk sayi : " + buyukSayi);
		toplam(15,25);
		
	}
	public static int topla(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	public static void toplam(int a,int b){
		System.out.println("Void metodu calisti.");
		System.out.println(topla(a,b));
	}
	public static int max(int a, int b) {
		// return a>b?a:b;
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
}