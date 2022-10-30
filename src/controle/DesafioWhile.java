package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// calcular a media das notas de alunos de uma turma
		// deve digitar uma nota valida
		// usar variavel total para somar as notas
		// usar variavel para mostrar a quantidade de notas validas digitadas
		
		Scanner entrada = new Scanner(System.in);
		int sair = 0;
		double nota;
		int qtdNotas = 0;
		double media = 0.0;
		while(sair != -1) {
			qtdNotas ++;
			System.out.println("Digite a nota do aluno " + qtdNotas + ": ");
			nota = entrada.nextDouble();
			
			if(nota > 10 || nota < 0) {
				System.out.println("Nota invalida");
				System.out.println("Digite a nota do aluno: ");
				nota = entrada.nextDouble();
			}else {
				media += nota;
			}	
			System.out.println("Digite -1 para sair do programa, Digite qualquer tecla para continuar.");
			sair = entrada.nextInt();
		}
		media = media / qtdNotas;
		
		System.out.printf("Notas digitadas: %s \nMédia da turma: %.2f", qtdNotas, media);
		entrada.close();
	}
}
