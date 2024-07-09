package com.haruns._05_RandomSinifi;

import java.util.Random;

public class RandomSinifi {
	public static void main(String[] args) {
		Random rand = new Random();
		int s1 = rand.nextInt(1, 7);
		int s2 = rand.nextInt(1, 5);
		double s3 = rand.nextDouble(2, 5);
		
		
		System.out.println(s1);
	}
}