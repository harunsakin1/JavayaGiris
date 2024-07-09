package com.haruns._03_StringSinifi;
/*
* String immutable bir siniftir. Bir degisiklik sonrasi yeni nesne olusur.
* StringBuilder ise mutable bir siniftir. Yapilan degisiklikler ilgili nesnede yapilir. Yeni nesne olusmaz.
* StringBuffer da mutable bir siniftir. Multithread uygulamalarda kullanilabilir.
* */
public class StringBuilderSinifi {
	public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder(); // Bos bir StringBuilder nesnesi urettik.
		sb1.append("Java15");
		System.out.println(sb1);
		System.out.println(sb1.replace(4,6,"25")); // 4 ve 5. index'teki degerleri degistirdi 15-->25
		System.out.println(sb1.insert(6," StringBuilder ogreniyorum"));
		System.out.println(sb1);
		System.out.println(sb1.delete(2,5));
	}
}