package exemplo.collections;

import java.util.Deque;
import java.util.LinkedList;

public class ExemploDequeue {
	public static void main(String[] args) {
		/*
		 * O framework Collection vem do pacote java.util
		 * */
		Deque<String> lista = new LinkedList<String>();
		
		lista.add("Rose");
		lista.add("AtraNuno");
		lista.add("Julia");
		lista.add("Luiz");
		lista.add("Lucas");
		lista.add("Luis");
		lista.add("Felipe");
		lista.add("Daniel");
		lista.add("Mariana");
		lista.add("Jonathan");
		lista.add("Rose");
		
		System.out.println("Saída da lista usando a interface Deque");
		lista.forEach(System.out::println);	}
}
