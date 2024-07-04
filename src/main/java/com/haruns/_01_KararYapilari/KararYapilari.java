package com.haruns._01_KararYapilari;

public class KararYapilari {
	public static void main(String[] args) {
	//		int sicaklik = 10;
//		if (sicaklik > 20) {
//			System.out.println("Klimayi calistir.");
//		}
//		else {
//			System.out.println("Klimayi durdur");
//		}
//		sicaklik = 20;
//		if (sicaklik < 0) {
//			System.out.println("Klimayi cok ac");
//		}
//		else if (sicaklik < 10) {
//			System.out.println("Klimayi az ac");
//		}
//		else if (sicaklik < 20) {
//			System.out.println("Klimayi azicik ac");
//		}
//		else {
//			System.out.println("Klimayi kapat");
//		}
		
		int yas = 30;
		if (yas > 0 && yas < 18) {
			System.out.println("Bu icerige erisim izniniz yok!");
		}
		else if (yas >= 18 && yas <= 30) {
			System.out.println("Icerigi goruntulemek icin yasiniz yeterli.");
		}
		else if (yas > 30) {
			System.out.println("Bu icerik yas grubunuza yonelik degildir !");
		}
		else {
			System.out.println("Hata.. Negatif sayi girisi yaptiniz.");
		}
		
	}
}