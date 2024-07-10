package com.haruns._07_Metotlar;

public class Varargs  {public static void main(String[] args) {
	int sum1 = sum(5, 10);
	int sum2 = sum(5, 10, 15);
	double sum3 = sum(5.25, 3.33, 5.56);
	int sum4 = sum(3, 5, 6, 4, 3, 1, 3, 4 );
	
	System.out.println("sum1 : "+sum1);
	System.out.println("sum2 : "+sum2);
	System.out.println("sum3 : "+sum3);
	System.out.println("sum4 : "+sum4);
	
}
	
	// Disaridan 2 int sayi parametre olarak alan ve toplamlarini int olarak donen bir sum metodu yazin.
	public static int sum(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// Disaridan 3 int sayi parametre olarak alan ve toplamlarini int olarak donen bir sum metodu yazin.
	public static int sum(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
	// Disaridan 3 double sayi parametre olarak alan ve toplamlarini int olarak donen bir sum metodu yazin.
	public static double sum(double sayi1, double sayi2, double sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
	public static int sum(int... sayilar){
		int sum=0;
		for (int sayi:sayilar){
			sum+=sayi;
		}
		return sum;
	}
}