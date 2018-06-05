package exemplo.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		/*
		 * O framework Collection vem do pacote java.util
		 * */
		List<String> lista = new ArrayList<String>();
		
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
		
		System.out.println("Saída da lista usando a interface List");
		lista.forEach(System.out::println);
	}
}
