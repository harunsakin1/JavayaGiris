package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_007 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kare boyutu giriniz : ");
		int sayi=sc.nextInt();
		for (int i = 1; i <= sayi ; i++) {
			for (int j = 1; j <sayi ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
	}
}