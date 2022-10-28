package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		// IMC = dividindo o peso (em kg) pela altura ao quadrado (em metros).
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe seu Peso em kg: ");
		double peso = entrada.nextDouble();	
		System.out.println("Informe sua Altura em metros: ");
		double altura = entrada.nextDouble();
				
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC: %.2f", imc);
		
		entrada.close();
	}
}
