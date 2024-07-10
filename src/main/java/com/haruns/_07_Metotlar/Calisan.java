package com.haruns._07_Metotlar;

public class Calisan {
	public String ad;
	public String soyAd;
	private Integer yas;
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		if (yas < 100 && yas > 10) {
			this.yas = yas;
		}
		else {
			System.out.println("Yas 10-100 arasi olmalidir.");
		}
	}
}

class Deneme {
	public static void main(String[] args) {
		Calisan calisan1 = new Calisan();
		calisan1.ad="Harun";
		calisan1.soyAd="SAKIN";
		calisan1.setYas(24);
		System.out.println(calisan1.ad+" " +calisan1.soyAd+" "+calisan1.getYas());
	}
	
	
}