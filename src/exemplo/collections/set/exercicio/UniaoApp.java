package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class UniaoApp {
	public static void main(String[] args) {

		HashSet<String> conjuntoA = new HashSet<String>();
		HashSet<String> conjuntoB = new HashSet<String>();
		
		conjuntoA.add("maçã");
		conjuntoA.add("pera");
		conjuntoA.add("uva");
		
		conjuntoB.add("goiaba");
		conjuntoB.add("melão");
		conjuntoB.add("melancia");
		conjuntoB.add("tomate");
		conjuntoB.add("ameixa");
		
		// união do conjuntoA com o conjuntoB
		conjuntoA.addAll(conjuntoB);
		System.out.println(conjuntoA);
	}
}
