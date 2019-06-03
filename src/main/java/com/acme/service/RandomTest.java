package com.acme.service;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(rnd.nextInt(5));
		}

	}

}
