package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Random gerador = new Random();
	
		int maximoNumero = 100;
		int numAleatorio = gerador.nextInt(maximoNumero);
		int tentativas;
		int numJogador;
		
		for (tentativas = 10; tentativas > 0; tentativas--) {
			System.out.println("Advinhe um número de 0 à " + maximoNumero);
			System.out.printf("Tentativas restantes: %d \nDigite um número: "
					, tentativas);
			numJogador = entrada.nextInt();
			
			if(numJogador == numAleatorio) {
				System.out.println("Você acertou, Parabéns!!!");
				break;
			} else if (numJogador > numAleatorio){
				System.out.println("Número menor que resposta");
			} else {
				System.out.println("Número maior que resposta");
			} 	
			System.out.println();
			if(tentativas == 1) {
				System.out.println("Chancer acabaram, resposta era: "
				+ numAleatorio);
			}
			entrada.close();			
		}			
	}
	
}
