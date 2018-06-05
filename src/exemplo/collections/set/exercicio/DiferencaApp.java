package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class DiferencaApp {
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
		
		// Verificar a diferen�a entre o conjuntoA e o conjuntoB
		conjuntoB.removeAll(conjuntoA); 
		
		System.out.println(conjuntoB);
		
		// remo��o de somente um elemento da lista
		conjuntoB.remove("ameixa");
		System.out.println(conjuntoB);
	}
}
