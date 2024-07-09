package com.haruns._04_MathSinifi;

public class MathSinifi {
	public static void main(String[] args) {
		// Math sinifi constructor'i private oldugu icin nesne olusturulamaz.
		
		//1.    abs= Mutlak Deger
		int s1=5,s2=-10,s3=20;
		System.out.println(Math.abs(s1));
		System.out.println(Math.abs(s2));
		
		//2.    max , min
		System.out.println(Math.max(s1,s2));
		System.out.println(Math.min(s1,Math.min(s2,s3)));
		
		//3. pow = us alma
		System.out.println(Math.pow(5,3));
		
		//4. sqrt = karekok alma
		System.out.println(Math.sqrt(121));
		
		//6. Yuvarlama islemleri
		//6.1 ceil --> Yukari yuvarlama
		System.out.println(Math.ceil(5.2));
		//6.2 floor --> Asagi yuvarlama
		System.out.println(Math.floor(5.9));
		//6.3 round --> En yakin tamsayiya yuvarlama
		System.out.println(Math.round(5.6));
		
		//7. Random()
		System.out.println(Math.random()); // 0-1 arasinda rastgele sayi uretir.
		
	}
}