package com.haruns._07_Metotlar;

// Static field veya metodlar sinifa baglidir.
// Non-static field veya metodlar nesneye baglidir. Erismek icin nesne olusturmak gerekir.
public class Static {
	int sayi1 = 10; //Non-static field
	static int sayi2 = 20; // Static field
	
	public void selam() { // Non-static method
		System.out.println("Selam");
	}
	
	public static void merhaba() { // Static method
		System.out.println("Merhaba");
	}
}

class DenemeStatic {
	public static void main(String[] args) {
		// Non-static fieldlara erismek icin once siniftan bir nesne uretmek gereklidir.
		Static st = new Static();
		System.out.println(st.sayi1);
		//System.out.println(st.sayi2); Static fieldlara nesne uzerinden de erisilebilir ama dogru bir kullanim
		// degildir.
		st.selam();
		
		// Static fieldlara erismek icin sadece sinif adini yazmak yeterlidir. Nesne olusturmaya gerek yoktur.
		System.out.println(Static.sayi2);
		Static.merhaba();
	}
}