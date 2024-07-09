package com.haruns._02_Donguler;

import java.util.Random;
import java.util.Scanner;

public class CalismaSorulari {
	public static void main(String[] args) {
		// SORU 1 :
//			Scanner sc=new Scanner(System.in);
//			int k1,k2,k3;
//			System.out.println("1.Kenar uzunlugunu giriniz : ");
//			k1=sc.nextInt();
//			System.out.println("2.Kenar uzunlugunu giriniz : ");
//			k2=sc.nextInt();
//			System.out.println("3.Kenar uzunlugunu giriniz : ");
//			k3=sc.nextInt();
//			if (k1>0&&k2>0&&k3>0){
//				if (k1==k2&&k2==k3&&k1==k3){
//					System.out.println("Eskenar ucgen");
//				}
//				else if (k1==k2||k2==k3||k1==k3){
//					System.out.println("Ikizkenar ucgen");
//				}
//				else {
//					System.out.println("Cesitkenar ucgen");
//				}
//			}
//			else {
//				System.out.println("Kenar uzunlugu 0 veya 0'dan kucuk olamaz");
//			}
		
		// SORU 2 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("1-12 Arasi bir ay giriniz : ");
		int ay=sc.nextInt();
		switch (ay){
			case 1:{
				System.out.println("Ocak");
				break;
			}
			case 2:{
				System.out.println("Subat");
				break;
			}
			case 3:{
				System.out.println("Mart");
				break;
			}
			case 4:{
				System.out.println("Nisan");
				break;
			}
			case 5:{
				System.out.println("Mayis");
				break;
			}
			case 6:{
				System.out.println("Haziran");
				break;
			}
			case 7:{
				System.out.println("Temmuz");
				break;
			}
			case 8:{
				System.out.println("Agustos");
				break;
			}
			case 9:{
				System.out.println("Eylul");
				break;
			}
			case 10:{
				System.out.println("Ekim");
				break;
			}
			case 11:{
				System.out.println("Kasim");
				break;
			}
			case 12:{
				System.out.println("Aralik");
				break;
			}
			default:{
				System.out.println("1 ile 12 arasinda bir sayi giriniz.");
			}
		}*/
		
		// SORU 3 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("1-7 Arasi bir sayi giriniz : ");
		int gun=sc.nextInt();
		String hafta= switch (gun){
		case 1,2,3,4,5->{
			yield "Hafta ici";
		}
		case 6,7->{
			yield "Hafta sonu";
		}
			default -> throw new IllegalStateException("Unexpected value: " + gun);
		};
		System.out.println(hafta);*/
		
		//SORU 4 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi=sc.nextInt();
		for (int i = 0; i <sayi ; i+=2) {
			System.out.println(i);
		}*/
		
		//SORU 5 :
		/*for (int i = 1; i <20 ; i++) {
			System.out.println(i+" sayisinin karesi : "+i*i);
		}*/
		
		// SORU 6 :
		/*Scanner sc=new Scanner(System.in);
		int sayi,toplam=0;
		do {
			System.out.println("Bir sayi giriniz : ");
			sayi=sc.nextInt();
			if (sayi>0){
				toplam+=sayi;
			}
			else {
				break;
			}
		}while (sayi>=0);
		System.out.println("Toplam : "+toplam);*/
		
		// SORU 7 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int sayi=sc.nextInt();
		int basamakToplam=0;
		int geciciSayi;
		geciciSayi=sayi;
		while (0<geciciSayi){
			basamakToplam+=(geciciSayi%10);
			geciciSayi=geciciSayi/10;
		}
		System.out.println(sayi+" sayisinin basamaklari toplami : "+basamakToplam);*/
		
		// SORU 8 :
		/*Scanner scanner = new Scanner(System.in);
		int sayi=1;
		long faktoriyel = 1;
		while (sayi>0) {
			System.out.print("Bir sayi giriniz : ");
			sayi = scanner.nextInt();
			int geciciSayi = sayi;
			if (geciciSayi < 0) {
				System.out.println("Program sonlandiriliyor.");
				break;
			}
			faktoriyel=1;
			while (geciciSayi > 0) {
				faktoriyel *= geciciSayi;
				geciciSayi--;
			}
			System.out.println(sayi + " sayisinin faktoriyeli: " + faktoriyel);
		}*/
		// SORU 9 :
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Bir sayi giriniz : ");
//		int sayi=sc.nextInt();
//		int sayiTers=0;
//		while (sayi>0){
//			sayiTers*=10;
//			sayiTers+=sayi%10;
//			sayi=sayi/10;
//		}
//		System.out.println("Sayinin tersi : "+sayiTers);
		
		//SORU 10 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir cümle giriniz : ");
		String cumle=sc.nextLine();
		for (int i = 0; i <cumle.length() ; i++) {
			if (cumle.charAt(i)==' '){
				System.out.println();
			}
			else {
				System.out.print(cumle.charAt(i));
			}
		}*/
		
		//SORU 11 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir metin giriniz : ");
		String metin=sc.nextLine();
		int sayac=0;
		String sesliHarfler="AEIOUaeiou";
		for (int i = 0; i <metin.length() ; i++) {
			char ch=metin.charAt(i);
			if (sesliHarfler.indexOf(ch)!=-1){
				sayac++;
			}
		}
		System.out.println("Girdiginiz metindeki sesli harf sayisi : "+sayac);*/
		
		//SORU 12 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir taban degeri giriniz : ");
		double taban=sc.nextDouble();
		System.out.println("Bir us degeri giriniz : ");
		double us=sc.nextDouble();
		double kare=Math.pow(taban,us);
		System.out.println((int)taban+" uzeri "+(int)us+" = "+(int)kare);*/
		
		//SORU 13 :
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		double sayi=sc.nextDouble();
		System.out.println(sayi+" sayisinin en yakin tamsayiya yuvarlanmis hali : "+Math.round(sayi));*/
		
		//SORU 14 :
		/*Random rnd=new Random();
		int sayi= rnd.nextInt(1,51);
		if (sayi%2==0){
			System.out.println("Random olarak uretilen "+sayi+" sayisi cifttir");
		}
		else {
			System.out.println("Random olarak uretilen "+sayi+" sayisi tektir");
		}*/
		
		//SORU 15 :
		/*Random rnd = new Random();
		int sayi = rnd.nextInt(1, 100); // Aralik vermemin sebebi, aralik vermeyince cok buyuk sayilar ciktigi icin direkt else bloguna giriyor.
		if (sayi >= 1 && sayi < 10) {
			System.out.println("Random olarak uretilen " + sayi + " sayisi 1 ile 10 arasindadir.");
		}
		else {
			System.out.println("Random olarak uretilen " + sayi + " sayisi 1 ile 10 arasinda degildir.");
		}*/
		
		//SORU 16 :
		/*int sayi1=16,sayi2=4;
		System.out.println(sayi1+" + "+sayi2+" = "+(sayi1+sayi2));
		System.out.println(sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
		System.out.println(sayi1+" * "+sayi2+" = "+(sayi1*sayi2));
		System.out.println(sayi1+" / "+sayi2+" = "+(sayi1/sayi2));*/
		
		//SORU 17 :
		/*char ch='H';
		System.out.println(ch+" ifadesinin int karsiligi ---> "+(int)ch);*/
		
		//SORU 18 :
		/*float sayi=102.369F;
		System.out.println(sayi+" ifadesinin int karsiligi ---> "+(int)sayi);*/
		
		
	}
}