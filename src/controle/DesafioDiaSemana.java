package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// digitar 1-7 equivalente ao dia da semana 
		// EX:1-domingo 2-segunda
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.nextLine();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
		}else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("dia invalido");
		}
		
		
		entrada.close();
	}
}
