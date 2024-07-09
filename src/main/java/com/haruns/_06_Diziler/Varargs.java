package com.haruns._06_Diziler;

public class Varargs {
	public static void main(String[] args) {
		//variable arguments bir metoda ayni tipte degisken sayida deger gondermek icin kullanilir
		//metod parametresinde dizi kullaniminin alternatifidir.
		// main metod parametre olarak String[] args almaktadir. Yani bir String dizisini parametre olarak alabiliyor.
		// Burada String[] args yerine String... args da kullanilabilir. Bu yonteme varargs denir.
		
		//Ornek metod yazma :
		int toplam=topla(5,10,25);
		System.out.println(toplam);
	}
	public static int topla(int... sayilar ){ // ... ile varargs yontemi kullanilarak ayni tipte degisken sayida
		// deger alabildik.
		int toplam=0;
		for (int item:sayilar){
			toplam+=item;
		}
		return toplam;
	}
}