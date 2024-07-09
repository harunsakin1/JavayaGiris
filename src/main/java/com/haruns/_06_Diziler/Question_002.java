package com.haruns._06_Diziler;

import java.util.Arrays;
import java.util.Scanner;
/*
* /**
 * 5 elemanli bir int dizisi tanimlayin,
 * kullanicidan alinan degerleri bu diziye aktarin.
 * Ardindan dizinin elemanlarinin sirasini ters çevirip,
 * yazdirin.
 */
public class Question_002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dizi[]=new int[5];
		for (int i = 0; i <dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz :");
			dizi[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(dizi));
		int temp;
		for (int i = 0; i <dizi.length/2 ; i++) {
			temp=dizi[i];
			dizi[i]=dizi[dizi.length-1-i];
			dizi[dizi.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(dizi));
	}
}