package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		// (32 °F − 32) × 5/9 = 0 °C
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite temperatura em °F: ");
		double f = entrada.nextDouble();
		
		int ajuste = 32;
		double multiplicador = 5.0/9.0;
		double c = (f - ajuste) * multiplicador; 
		System.out.println(c);
		
		System.out.printf("Temperatura em °C: %.2f", c);
		
		entrada.close();
	}
}	
