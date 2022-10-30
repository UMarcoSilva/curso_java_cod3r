package controle;

public class For3Debugando {
	public static void main(String[] args) {
	// Seleciona com o mouse uma parte do codigo + 
		//ctrl + shift + i , permite ver se é true
	// Seleciona um trecho do codigo + botao direito mouse
		// seleciona "Watch" e coloca uma expressao para ver se é vdd
		// EX: j < 10
	// F8 pula para o proximo break point
	// F6 continua o debug
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
		}
	}
}
