package com.haruns._03_StringSinifi;

public class StringVsStringBuilder {
	public static void main(String[] args) {
//		int islemAdet=100_000;
//		long baslangic=System.currentTimeMillis();
//		String metin="Hello";
//		for (int i = 0; i < islemAdet ; i++) {
//			metin+=i;
//		}
//		long bitis=System.currentTimeMillis();
//		System.out.println("String ile "+islemAdet+" isleminde gecen sure : "+(bitis-baslangic));
		
		int islemAdet=100_000;
		long baslangic=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		for (int i = 0; i < islemAdet ; i++) {
			sb.append(i);
		}
		long bitis=System.currentTimeMillis();
		System.out.println("String ile "+islemAdet+" isleminde gecen sure : "+(bitis-baslangic)+" milisaniyedir.");
	}
}