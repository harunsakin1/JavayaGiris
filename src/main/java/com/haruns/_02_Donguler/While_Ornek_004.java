package com.haruns._02_Donguler;

import java.util.Scanner;

public class While_Ornek_004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz : ");
		String kelime = sc.next();
		String kelimeTers = "";
		int index = kelime.length() - 1;
		while (index >= 0) {
			kelimeTers += kelime.charAt(index);
			index--;
		}
		System.out.println(kelimeTers);
		if (kelime.equalsIgnoreCase(kelimeTers)) {
			System.out.println(kelime + " Polindrom bir kelimedir");
		}
		else {
			System.out.println(kelime + " Polindrom bir kelime degildir");
		}
		
	}
}