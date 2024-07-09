package com.haruns._06_Diziler;

public class DizilerTeorik {
	public static void main(String[] args) {
	int intDizi[];
	intDizi=new int[5];
	intDizi[0]=50;
	intDizi[1]=60;
	intDizi[2]=70;
	intDizi[3]=80;
	intDizi[4]=90;
	String ogrenciler[]=new String[]{"Harun SAKIN","aaaaa","bbbbb"};
		for (int i = 0; i <= intDizi.length-1 ; i++) {
			System.out.println(intDizi[i]);
		}
		System.out.println("------------- FOREACH ILE --------------");
		for (int item :intDizi){
			System.out.println(item);
		}
	}
}