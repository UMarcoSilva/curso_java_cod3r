package controle;

public class Continue {
	public static void main(String[] args) {
		// Continue é utilizado para quebrar uma ação no código
		// O break interrompe bloco
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
		for (int i = 0; i <= 10; i++) {
			if(i == 5) continue;
			System.out.println(i);
		}
	}
}
