package exemplo.collections.set;

import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		TreeSet<String> lista = new TreeSet<String>();

		/*
		 * A classe de implementação TreeSet define a ordenação do elementos da lista
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
