package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;

public class ConjuntoComportado {
	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		// TreeSet - respeita ordem de iserção

		listaAprovados.add("Marco");
		listaAprovados.add("Ana");
		listaAprovados.add("Juliane");
		listaAprovados.add("Lucas");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		// TreeSet - respeita ordem de iserção

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		//nums.get(1)/ // Não é possivel acessar pelo índice

		for (int n : nums) {
			System.out.println(n);
		}

	}
}
