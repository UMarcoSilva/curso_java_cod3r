package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (v ou F)
		// Trabalho na quinta (V ou F)
		
		// se 2 darem certo tv 50" se 1 da certo 32"
		// se 1 dar certo tomar sorvete no shopping
		// se nenhum dar certo ficar saudavel
		
		boolean trabalho1 =  false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		
		boolean sorvete = trabalho1 || trabalho2;
		boolean saudavel = !sorvete;
		
		System.out.println("Comprou tv 50' ? " + tv50);
		System.out.println("Comprou tv 32' ? " + tv32);
		System.out.println("Tomou sorvete com familia? " + sorvete );
		System.out.println("Ficou saudavel? " + saudavel);	
	}
}
