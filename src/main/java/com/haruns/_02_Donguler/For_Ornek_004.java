package com.haruns._02_Donguler;

public class For_Ornek_004 {
	public static void main(String[] args) {
		int toplam=0;
		for (int i = 1; i <100 ; i+=2) {
			toplam+=i;
		}
		System.out.println("1'den 100'e kadar olan tek sayilarin toplami : "+toplam);
	}
}