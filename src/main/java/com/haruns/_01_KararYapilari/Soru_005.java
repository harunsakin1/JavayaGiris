package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi=sc.nextInt();
		sc.close();
		if (sayi>0){
			System.out.println(sayi+" Sayisi pozitiftir");
		}
		else if(sayi<0){
			System.out.println(sayi+" Sayisi negatiftir");
		}
		else {
			System.out.println("Sayi 0'dir");
		}
	}
}