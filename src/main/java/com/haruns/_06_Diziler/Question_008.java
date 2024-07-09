package com.haruns._06_Diziler;

import java.util.Arrays;

public class Question_008 {
	public static void main(String[] args) {
//		int dizi[] = new int[]{20, 19, 20, 40, 3, 40, 5, 3, 7, 3};
//		int dizi2[] = new int[dizi.length];
//		for (int i = 0; i < dizi.length; i++) {
//			for (int j = i + 1; j < dizi.length; j++) {
//				if (dizi[i] == dizi[j]) {
//					dizi[j] = 0;
//				}
//			}
//		}
//		for (int item : dizi) {
//			System.out.println(item);
//		}
		int[] dizi = new int[]{20, 19, 20, 40, 3, 40, 5, 3, 7, 3};
		int[] dizi2;
		boolean esitMi=false;
		int dizi2Uzunluk = dizi.length;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i]==dizi[j]){
					dizi2Uzunluk--;
					break;
				}
			}
		}
		System.out.println(dizi2Uzunluk);
		dizi2=new int[dizi2Uzunluk];
		int diziIndex2=0;
		for (int i = 0; i < dizi.length; i++) {
			esitMi=false;
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i]==dizi[j]){
					System.out.println(dizi[i]);
					esitMi=true;
					break;
				}
			}
			if (!esitMi){
				dizi2[diziIndex2]=dizi[i];
				diziIndex2++;
			}
		}
		System.out.println(Arrays.toString(dizi2));
	}
}