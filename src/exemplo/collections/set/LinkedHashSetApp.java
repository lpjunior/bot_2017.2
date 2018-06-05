package exemplo.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {

	public static void main(String[] args) {
		LinkedHashSet<String> lista = new LinkedHashSet<String>();

		/*
		 * A classe de implementação LinkedHashSet define a ordem de armazenamento
		 * identica de como foi inserido.
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
