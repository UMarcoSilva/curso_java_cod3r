package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar valor numérico para controlar o laço
		
		String v = "#";
		
		for(String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(v);
			v += "#";
		}
		
		
		
	}
}
