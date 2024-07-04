package com.haruns._01_KararYapilari;

import java.util.Scanner;

public class Soru_003 {
	public static void main(String[] args) {
		int not;
		Scanner sc = new Scanner(System.in);
		System.out.print("Not girisi yapiniz : ");
		not = sc.nextInt();
		sc.close();
		if (not>100 || not<0){
			System.out.println("Gecerli bir not araligi giriniz.");
		}
		else if (not >= 90 && not <= 100) {
			System.out.println("Notunuz : AA");
		}
		else if (not >= 80) {
			System.out.println("Notunuz : BA");
		}
		else if (not >= 70) {
			System.out.println("Notunuz : BB");
		}
		else if (not >= 60) {
			System.out.println("Notunuz : CB");
		}
		else if (not >= 50) {
			System.out.println("Notunuz : CC");
		}
		else if (not >= 40) {
			System.out.println("Notunuz : DC");
		}
		else if (not >= 30) {
			System.out.println("Notunuz : DD");
		}
		else if (not >= 0) {
			System.out.println("Notunuz : FF");
		}
	}
}