package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "senhora"); // substitui
		s = s.toUpperCase(); // deixa maiúsculo
		s = s.concat("!!!"); // concatena
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
				
		// Tipos primitivos não tem operador "."
		
	}
}
