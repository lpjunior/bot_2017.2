package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class IntersecaoApp {
	public static void main(String[] args) {

		HashSet<String> conjuntoA = new HashSet<String>();
		HashSet<String> conjuntoB = new HashSet<String>();
		
		conjuntoA.add("maçã");
		conjuntoA.add("pera");
		conjuntoA.add("uva");
		
		conjuntoB.add("maçã");
		conjuntoB.add("pera");
		conjuntoB.add("uva");
		conjuntoB.add("goiaba");
		conjuntoB.add("melão");
		conjuntoB.add("melancia");
		conjuntoB.add("tomate");
		conjuntoB.add("ameixa");
		
		// Transforma o conjuntoB em uma interseção do conjuntoA com o conjuntoB
		conjuntoB.retainAll(conjuntoA);
		System.out.println(conjuntoB);
	}
}
