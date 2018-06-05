package exemplo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
	public static void main(String[] args) {
		/*
		 * O framework Collection vem do pacote java.util
		 * */
		Queue<String> lista = new LinkedList<String>();
		
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
		
		System.out.println("Saída da lista usando a interface Queue");
		lista.forEach(System.out::println);	}
}
