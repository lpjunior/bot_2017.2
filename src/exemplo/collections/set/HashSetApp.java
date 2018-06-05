package exemplo.collections.set;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<String>();

		/*
		 * A interface Set trabalha com o conceito de conjuntos.
		 * Implementando os conceitos matemáticos union, intersect, difference.
		 * 
		 */
		lista.add("Rose");
		lista.add("Rodolfo");
		lista.add("Julia");
		lista.add("Luiz");
		lista.add("Lucas");
		lista.add("Luis");
		lista.add("Felipe");
		lista.add("Daniel");
		lista.add("Mariana");
		lista.add("Jonathan");
		lista.add("Rose");
		lista.add("Nuno");

		System.out.println("Saída da lista usando a interface Set\n" + lista);
	}

}
