package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir not giriniz : ");
		int not = sc.nextInt();
		String harfNotu;
		if (not > 100 || not < 0) {
			System.out.println("0-100 arasi not girisi yapmalisiniz.");
		}
		else {
			harfNotu = switch (not / 10) {
				case 9, 10 -> "AA";
				case 8 -> "AB";
				case 7 -> "BB";
				case 6 -> "BC";
				case 5 -> "CC";
				case 4 -> "CD";
				case 3 -> "DD";
				default -> "FF";
			};
			System.out.println(harfNotu);
		}
		
		
	}
}