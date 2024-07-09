package com.haruns._06_Diziler;

import java.util.Scanner;

public class Question_003 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dizinin eleman sayisini giriniz : ");
		int elemanSayisi=sc.nextInt();
		int[] dizi=new int[elemanSayisi];
		for (int i = 0; i <dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz :");
			dizi[i]=sc.nextInt();
		}
		int max = dizi[0];
		int min=dizi[0];
		int maxIndex=0;
		int minIndex=0;
		for (int i = 0; i <dizi.length ; i++) {
			if (dizi[i]>max){
				max=dizi[i];
				maxIndex=i;
			}
			if (dizi[i]<min){
				min=dizi[i];
				minIndex=i;
			}
		}
		System.out.println("Max : "+max+" MaxIndex : "+maxIndex);
		System.out.println("Min : "+min+" MinIndex : "+minIndex);
	}
}