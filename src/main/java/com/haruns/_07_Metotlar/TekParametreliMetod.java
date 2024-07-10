package com.haruns._07_Metotlar;

public class TekParametreliMetod {
	public static void main(String[] args) {
		int sonuc = kareAl(5);
		System.out.println(sonuc);
		int sonuc2 = onKati(10);
		System.out.println(sonuc2);
		baslikYazdir("Tek parametreli metodlar");
	}
	public static int kareAl(int sayi){
		return sayi*sayi;
	}
	public static int onKati(int sayi){
		return sayi*10;
	}
	public static void baslikYazdir(String baslik){
		System.out.println("********************************");
		System.out.println("***********"+baslik+"***********");
		System.out.println("********************************");
		
	}
}