package com.haruns._02_Donguler;

public class For_Ornek_006 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " sayisi 15'in kati");
			}
			else if (i % 3 == 0) {
				System.out.println(i + " sayisi 3'un kati");
			}
			else if (i % 5 == 0) {
				System.out.println(i + " sayisi 5'in kati");
			}
			else {
				System.out.println(i);
			}
		}
	}
}