package com.haruns._02_Donguler;

import java.util.Scanner;

public class While_Ornek_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz : ");
		String kelime = sc.next();
		int index = 0;
		while (true) {
			try {
				kelime.charAt(index);
				index++;
			}
			catch (Exception e) {
				// catch blogu try blogunda hata oldugunda calisir.
				break;
			}
		}
		System.out.println(kelime + " kelimesinin harf sayisi : " + index);
		
	}
}