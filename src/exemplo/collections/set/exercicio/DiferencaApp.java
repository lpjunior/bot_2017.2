package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class DiferencaApp {
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
		
		// Verificar a diferença entre o conjuntoA e o conjuntoB
		conjuntoB.removeAll(conjuntoA); 
		
		System.out.println(conjuntoB);
		
		// remoção de somente um elemento da lista
		conjuntoB.remove("ameixa");
		System.out.println(conjuntoB);
	}
}
