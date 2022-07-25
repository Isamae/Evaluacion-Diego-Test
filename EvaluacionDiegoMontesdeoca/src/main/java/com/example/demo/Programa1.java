package com.example.demo;

public class Programa1 {
	public void run() {
		
		for (int i = 1; i < 101; i++) {
			if (i%5 == 0 && i%3 == 0) {
				 System.out.println("SOMOS BA");
			}
			else if(i%5 == 0) {
				System.out.println("BA");
			}
			else if(i%3 == 0) {
				System.out.println("SOMOS");
			}
			else {
				System.out.println("Num:"+i);
			}
		
		}
	}

}
