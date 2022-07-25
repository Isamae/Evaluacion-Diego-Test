package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaluacionDiegoMontesdeoca1Application  implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(EvaluacionDiegoMontesdeoca1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("PRIMER PROGRAMA");
		Programa1 programa = new Programa1();
		programa.run();
		
		System.out.println("SEGUNDO PROGRAMA");
		Programa2 programa2 = new Programa2();
		Boolean esVerdad = programa2.esAnagrama("ACUERDO ", "ECUADOR");
		
		if (esVerdad) {
			System.out.println("ES ANAGRAMA");
		}
		else {
			System.out.println("NO ANAGRAMA");
		}
		
		System.out.println("TERCER PROGRAMA");
		Programa3 programa3 = new Programa3();
		programa3.run();
	}

}
