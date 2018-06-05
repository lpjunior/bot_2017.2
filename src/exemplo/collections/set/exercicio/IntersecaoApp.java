package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class IntersecaoApp {
	public static void main(String[] args) {

		HashSet<String> conjuntoA = new HashSet<String>();
		HashSet<String> conjuntoB = new HashSet<String>();
		
		conjuntoA.add("ma��");
		conjuntoA.add("pera");
		conjuntoA.add("uva");
		
		conjuntoB.add("ma��");
		conjuntoB.add("pera");
		conjuntoB.add("uva");
		conjuntoB.add("goiaba");
		conjuntoB.add("mel�o");
		conjuntoB.add("melancia");
		conjuntoB.add("tomate");
		conjuntoB.add("ameixa");
		
		// Transforma o conjuntoB em uma interse��o do conjuntoA com o conjuntoB
		conjuntoB.retainAll(conjuntoA);
		System.out.println(conjuntoB);
	}
}
