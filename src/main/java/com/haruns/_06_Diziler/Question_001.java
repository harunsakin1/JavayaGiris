package com.haruns._06_Diziler;

import java.util.Random;

public class Question_001 {
	public static void main(String[] args) {
		Random rnd=new Random();
		int rndDizi[]=new int[10];
		for (int i = 0; i <rndDizi.length ; i++) {
			rndDizi[i]=rnd.nextInt(0,101);
			System.out.println(i+". indexteki eleman : "+rndDizi[i]);
		}
		System.out.println("------FOREACH ILE YAZDIRMA-------");
		for (int item:rndDizi){
			System.out.println(item);
		}
	}
}