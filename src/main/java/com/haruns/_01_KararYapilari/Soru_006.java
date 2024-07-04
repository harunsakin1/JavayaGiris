package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_006 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Not girisi yapiniz :");
		int not=sc.nextInt();
		sc.close();
		String sonuc=(not>=50)?"Gecer":"Kaldi";
		System.out.println(sonuc);
		
	}
}