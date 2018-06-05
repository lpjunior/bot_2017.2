package exemplo.collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	public static void main(String[] args) {
		/*
		 * O framework Collection vem do pacote java.util
		 * */
		Set<String> lista = new HashSet<String>();
		
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
		
		System.out.println("Saída da lista usando a interface Set");
		lista.forEach(System.out::println);	}
}
