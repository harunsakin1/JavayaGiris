package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_008 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Boyut girin : ");
		int boyut=sc.nextInt();
		String sekil="";
		
		for (int i = 1; i <= boyut; i++) {
			sekil+="*";
			System.out.println(sekil);
		}
		System.out.println("------------------------");
		for (int i = 1; i <= boyut ; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}