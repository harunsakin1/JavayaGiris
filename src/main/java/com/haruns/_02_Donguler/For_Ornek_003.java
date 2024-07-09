package com.haruns._02_Donguler;

import java.util.Scanner;

public class For_Ornek_003 {
	public static void main(String[] args) {
		int faktoriyel=1;
		for (int i = 1; i <=10 ; i++) {
			faktoriyel*=i;
			System.out.println(i+"! = "+faktoriyel);
		}
	}
}