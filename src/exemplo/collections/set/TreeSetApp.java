package exemplo.collections.set;

import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		TreeSet<String> lista = new TreeSet<String>();

		/*
		 * A classe de implementa��o TreeSet define a ordena��o do elementos da lista
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

		System.out.println("Sa�da da lista usando a interface Set\n" + lista);
	}

}
