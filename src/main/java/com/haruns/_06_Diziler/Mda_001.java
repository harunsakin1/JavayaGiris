package com.haruns._06_Diziler;
/*
       Sno     No         Ad       Not
       1       101        Ece      100
       2       102        Su       80
       3       103        Ali      70
       4       104        Can      40
    Bu yapi çok boyutlu dizide tutulabilir mi?
       */
public class Mda_001 {
	public static void main(String[] args) {
	String sinifListesi[][]={
			{"1","101","Ece","100"},
			{"2","102","Su","80"},
			{"3","103","Ali","70"},
			{"4","104","Can","40"}
	};
		for (int i = 0; i <sinifListesi.length ; i++) {
			for (int j = 0; j <sinifListesi[0].length ; j++) {
				System.out.print(sinifListesi[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("0.SATIR");
		System.out.println("-----------------------------");
		for (int i = 0; i <sinifListesi[0].length ; i++) {
			System.out.print(sinifListesi[1][i]+"\t\t");
		}
		System.out.println("\n-----------------------------");
		System.out.println("2.SUTUN");
		System.out.println("-----------------------------");
		for (int i = 0; i <sinifListesi.length ; i++) {
			System.out.println(sinifListesi[i][2]+"\t\t");
		}
		int toplam=0;
		double ort=0;
		for (int i = 0; i <sinifListesi.length ; i++) {
			toplam=toplam+Integer.parseInt(sinifListesi[i][3]);
			
		}
		ort=(double) toplam/sinifListesi.length;
		System.out.println("Toplam : "+toplam);
		System.out.println("Ortalama : "+ort);
		
	}
}