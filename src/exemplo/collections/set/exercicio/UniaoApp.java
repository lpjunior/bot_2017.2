package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class UniaoApp {
	public static void main(String[] args) {

		HashSet<String> conjuntoA = new HashSet<String>();
		HashSet<String> conjuntoB = new HashSet<String>();
		
		conjuntoA.add("ma��");
		conjuntoA.add("pera");
		conjuntoA.add("uva");
		
		conjuntoB.add("goiaba");
		conjuntoB.add("mel�o");
		conjuntoB.add("melancia");
		conjuntoB.add("tomate");
		conjuntoB.add("ameixa");
		
		// uni�o do conjuntoA com o conjuntoB
		conjuntoA.addAll(conjuntoB);
		System.out.println(conjuntoA);
	}
}
