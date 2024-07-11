package com.haruns._07_Metotlar.sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Metodlar {
	/*
	//Soru1: Bir tam say? dizisini parametre olarak alan ve dizideki say?lar?n ortalamas?n? hesaplayarak geri döndüren
	 bir ortalamaHesapla metodunu yaz?n?z.ý
 
	 */
	double ortHesapla(int[] tamSayi) {
		double toplam = 0;
		for (int i = 0; i < tamSayi.length; i++) {
			toplam += tamSayi[i];
		}
		return toplam / tamSayi.length;
	}
	
	int[] diziOlustur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizinini eleman sayisini giriniz : ");
		int elemanSayisi = sc.nextInt();
		int[] tamSayi = new int[elemanSayisi];
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println((i + 1) + ". elemani giriniz :");
			tamSayi[i] = sc.nextInt();
		}
		return tamSayi;
		/*
		//Soru2:Bir tamsay? parametre alan ve
		// say?n?n tek olup olmad???n? kontrol eden
		// tekMi metodunu yaz?n?z.
		 */
	}
	
	boolean tekMi(int sayi) {
		return sayi % 2 == 1;
	}
	
	/*
	// Soru 5. Bir metin parametre alan ve
	// metindeki her kelimeyi tersine çevirerek geri döndüren bir metod yaz?n?z.
	 */
	
	String[] metindekiKelimeleriBul(String metin) {
		return metin.split(" ");
	}
	
	String kelimeTersiBul(String[] kelimeler) {
		// metindekiKelimeleriBul(kelimeler);
		StringBuilder sb = new StringBuilder();
		for (String kelime : kelimeler) {
			sb.append(new StringBuilder(kelime).reverse().append(" "));
		}
		return sb.toString().trim();
		
	}
	
	/*
	// Soru 6. Bir tamsay? parametre alan ve
	// say?n?n asal olup olmad???n? kontrol eden asalMi metodunu yaz?n?z.
	 */
	boolean asalMi(int sayi) {
		if (sayi <= 1 || sayi % 2 == 0 && sayi != 2) {
			return false;
		}
		else if (sayi == 2) {
			return true;
		}
		else {
			for (int i = 3; i <= Math.sqrt(sayi); i += 2) {
				if (sayi % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	/*
	 Soru 8 : Bir tamsayi ve tamsayi dizisi parametre alan ve dizi icindeki sayilardan n kadar buyuk sayiyi yeni bir
	 diziye
		aktaran metod.
	 */
	int[] enBuyukSayilariBul(int[] tamsayi, int n) {
		Arrays.sort(tamsayi);
		int[] enBuyuk = new int[n];
		for (int i = 0; i < n; i++) {
			enBuyuk[i] = tamsayi[tamsayi.length - 1 - i];
		}
		return enBuyuk;
	}
	int kucukHarfSay(String metin){
		int kucukHarfSayac=0;
		for (int i = 0; i <metin.length() ; i++) {
			if (Character.isLowerCase(metin.charAt(i))){
				kucukHarfSayac++;
			}
		}
		return kucukHarfSayac;
	}
	int buyukHarfSay(String metin){
		int buyukHarfSayac=0;
		for (int i = 0; i <metin.length() ; i++) {
			if (Character.isUpperCase(metin.charAt(i))){
				buyukHarfSayac++;
			}
		}
		return buyukHarfSayac;
	}
	int rakamSay(String metin){
		int rakamSayac=0;
		for (int i = 0; i < metin.length(); i++) {
			if (Character.isDigit(metin.charAt(i))){
				rakamSayac++;
			}
		}
		return rakamSayac;
	}
	int harfRakamHaricSay(String metin){
		int harfRakamHaricSayac=0;
		for (int i = 0; i <metin.length() ; i++) {
			if (Character.isLetter(metin.charAt(i))){
				harfRakamHaricSayac++;
			}
		}
		return harfRakamHaricSayac;
	}
	/*
		Soru 7 : Bir tam sayý dizisi ve bir tamsayý parametre alan ve dizideki her sayýyý girilen 2. parametredeki
		deðer ile çarparak yeni bir dizi oluþturan ve geri döndüren bir metod yazýnýz.
	 */
	int[] diziElemanlariniIkiIleCarp(int[] sayilar,int carpan){
		int [] yeniDizi=new int[sayilar.length];
		for (int i = 0; i < sayilar.length; i++) {
			yeniDizi[i]=sayilar[i]*carpan;
		}
		return yeniDizi;
	}
	// SORU 9:
	String metinBirlestir(String[]metin,String ayrac){
		StringBuilder sb=new StringBuilder();
		for (String kelime:metin){
			sb.append(kelime);
			sb.append(ayrac);
		}
		return sb.toString().substring(0,sb.toString().length()-1);
	}
	
}