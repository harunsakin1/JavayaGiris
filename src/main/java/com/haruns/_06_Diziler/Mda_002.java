package com.haruns._06_Diziler;

public class Mda_002 {
	public static void main(String[] args) {
		int[][]sayilar={
				{1,2,3,4},
				{5,6,7,100},
				{0,10,11,12}
		};
		double ortalama=0;
		for (int i = 0; i < sayilar.length; i++) {
			double toplam=0;
			for (int j = 0; j <sayilar[i].length ; j++) {
				toplam+=sayilar[i][j];
			}
			ortalama=toplam/sayilar[0].length;
			System.out.println(i+". satirdaki sayilarin toplami : "+toplam+" ortalamasi : "+ortalama);
			
			int ortalamadanBuyukElemanlar=0;
			for (int j = 0; j <sayilar[i].length ; j++){
				if (sayilar[i][j]>ortalama){
					ortalamadanBuyukElemanlar++;
				}
			}
			System.out.println(i+" . satirda ortalama uzerindeki eleman sayisi : "+ortalamadanBuyukElemanlar);
		}
	}
}