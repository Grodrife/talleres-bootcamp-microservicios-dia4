package com.nttdata.progfuncional.webflux;

public class Subscriber {

	public static void print(Integer n) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Subscriber 1: " + n);
	}
}
