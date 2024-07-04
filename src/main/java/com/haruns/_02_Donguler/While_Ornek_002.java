package com.haruns._02_Donguler;

import java.util.Scanner;

public class While_Ornek_002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi=sc.nextInt();
		int carpim=1;
		System.out.print(sayi+"! = ");
		while (sayi!=1){
			if (sayi==1){
				System.out.print(sayi);
			}
			else {
				System.out.println(sayi+"*");
			}
			carpim*=sayi;
			sayi--;
		}
		System.out.println(carpim);
	}
}