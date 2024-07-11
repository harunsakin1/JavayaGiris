package com.haruns._07_Metotlar.sorular;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Metodlar obj=new Metodlar();
		//System.out.println("Ortalama : "+obj.ortHesapla(obj.diziOlustur()));
		
	//	System.out.println(obj.tekMi(5));
		
		String metin="Bugun hava cok kotu";
		String[]kelimeler= obj.metindekiKelimeleriBul(metin);
		System.out.println(Arrays.toString(kelimeler));
		
		String kelimeTersi=obj.kelimeTersiBul(kelimeler);
		System.out.println(kelimeTersi);
		
		System.out.println(obj.kelimeTersiBul(obj.metindekiKelimeleriBul(metin)));
		
		System.out.println(obj.asalMi(0));
		int[]dizi={1,55,63,2,3};
		System.out.println(Arrays.toString(obj.enBuyukSayilariBul(dizi,2)));
		
		System.out.println(obj.kucukHarfSay("Harun"));
		System.out.println(obj.buyukHarfSay("Harun"));
		System.out.println(obj.rakamSay("Har16un"));
		System.out.println(obj.harfRakamHaricSay("Har16un.."));
		
		System.out.println("Dizinin 2 ile carpilmis hali -> "+Arrays.toString(obj.diziElemanlariniIkiIleCarp(dizi,2)));
		String[]metinDizisi={"Harun","SAKIN","Bursa"};
		System.out.println(obj.metinBirlestir(metinDizisi,"a"));
	}
}