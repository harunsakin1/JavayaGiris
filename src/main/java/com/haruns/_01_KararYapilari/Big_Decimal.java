package com.haruns._01_KararYapilari;

import java.math.BigDecimal;
import java.util.Scanner;

public class Big_Decimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sayi Giriniz : ");
		BigDecimal sayi=sc.nextBigDecimal();
		System.out.println("Sayi Giriniz : ");
		BigDecimal sayi2=sc.nextBigDecimal();
		BigDecimal sonucBigDecimal=sayi.add(sayi2).add(sayi2).add(sayi2).add(sayi).add(sayi).add(sayi);
		System.out.println(sonucBigDecimal);
		BigDecimal sonucBigDecimal2=sayi.multiply(sayi).multiply(sayi);
		System.out.println(sonucBigDecimal2);
		BigDecimal sonucBigDecimal3=sayi.subtract(sayi).subtract(sayi);
		System.out.println(sonucBigDecimal3);
		BigDecimal sonucBigDecimal4=sayi.divide(sayi).divide(sayi);
		System.out.println(sonucBigDecimal4);
	}
	
}