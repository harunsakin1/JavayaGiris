package com.haruns._07_Metotlar;

public class FinalParametreliMetod {
	public int hiz = 0;
	
	public static void main(String[] args) {
		FinalParametreliMetod obj = new FinalParametreliMetod();
		System.out.println(obj.hiz);
		obj.hizArttir(50);
		System.out.println(obj.hiz);
	}
	
	/**
	 * @param yeniHiz final olarak atandigi icin bu parametrenin degeri degistirilemez.
	 */
	public void hizArttir(final int yeniHiz) {
		hiz = yeniHiz;
	}
}