package controle;

public class Break {
	public static void main(String[] args) {
		// Continue é utilizado para quebrar uma ação no código
		// O break interrompe bloco
		
		for (int i = 0; i < args.length; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.err.println("Fim!");
	}
}
