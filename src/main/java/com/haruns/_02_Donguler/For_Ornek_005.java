package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_005 {
	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			if (i%3==0){
				System.out.println(i);
			}
			for (int j = 3; j <50 ; j+=3) {
				System.out.println(j);
			}
		}
	}
}