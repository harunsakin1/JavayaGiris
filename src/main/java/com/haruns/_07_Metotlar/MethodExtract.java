package com.haruns._07_Metotlar;

public class MethodExtract {
	public static void main(String[] args) {
		String deger="baslik";
		baslikYaz(deger);
		baslikYaz("Harun");
		carp(1,2,3,4,5,6,7);
	}
	
	private static void carp(int i, int i1, int i2, int i3, int i4, int i5, int i6) {
	
	}
	
	private static void baslikYaz(String deger) {
		System.out.println("**************");
		System.out.println("*******"+ deger +"+*******");
		System.out.println("**************");
	}
}