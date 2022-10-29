package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String saida = "";
		while (!saida.equalsIgnoreCase("sair") ) {
			System.out.println("Bom dia");
			System.out.println("Boa tarde");
			System.out.println("Boa noite");
			
			System.out.println("Deseja encerrar o programa? Digite 2 para sim e 1 para não");
			saida = entrada.nextLine();
		}
		
		System.out.println("Programa encerrado");
		entrada.close();
	}
}
