package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		// (0 °C × 9/5) + 32 = °F
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite temperatura em °F: ");
		double c = entrada.nextDouble();
		
		int ajuste = 32;
		double multiplicador = 9.0/5.0;
		
		double f = (c  * multiplicador) + ajuste; 
		
		System.out.printf("Temperatura em °C: %.2f", f);
		
		entrada.close();
	}
}
