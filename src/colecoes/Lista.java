package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("ana");
		
		lista.add(u1);
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Jorge"));
		lista.add(new Usuario("Manu"));
		
		//System.out.println(lista.get(3)); // acessar pelo índice
		System.out.println(lista.get(2));

		System.out.println(">>>>>"+lista.remove(1));
		System.out.println(lista.remove(new Usuario("Padro")));
		
		
		System.out.println(lista.contains(new Usuario("Jorge")));
		
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
	}
}
