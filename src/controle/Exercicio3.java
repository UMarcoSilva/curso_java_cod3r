package controle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/* Criar um programa que receba duas notas parciais,
		calcular a média final. Se a nota do aluno for 
		maior ou igual a 7.0 imprime no console "Aprovado", 
		se a nota for menor que 7.0 e maior do que 4.0 
		imprime no console "Recuperação", 
		caso contrário imprime no console "Reprovado".
		*/
		
		Scanner entrada = new Scanner(System.in);

		double nota1;
		double nota2;
		double media;
		String aprovado = "Aprovado";
		String recuperacao = "Recuperacao";
		String reprovado = "Reprovado";
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println(aprovado);
		} else if (media < 7.0 && media > 4.0){
			System.out.println(recuperacao);
		} else {
			System.out.println(reprovado);
		}

		entrada.close();
		
	}
}
