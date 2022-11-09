package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// offer e add -> adicionam elementos a fila
		// diferenca é comportamento em fila cheia
		// Add -> caso exceda o tamanho da fila retorna false
		// Offer -> caso exceda o tamanho da fila retorna erro
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e elemento -> obter o proximo elemento da fila sem remover
		// diferenca é comportamento em fila vazia
		// Peek -> retorna null
		// Element -> retorna erro
		System.out.println(fila.peek());
		System.out.println(fila.element());

		// Poll e remove -> obter o proximo elemento da fila e remove
		// diferenca é comportamento em fila vazia
		// poll -> retorna false
		// remove-> retorna excecao
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		//fila.contains(...);
	}
}
