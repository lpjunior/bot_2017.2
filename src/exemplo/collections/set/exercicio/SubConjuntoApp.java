package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class SubConjuntoApp {
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
		
		// Verificar se o conjuntoA é subconjunto(está contido) do conjuntoB
		boolean flag = conjuntoB.containsAll(conjuntoA); 
		// o método retorna true caso o conjuntoA esteja dentro do conjuntoB 
		
		if(flag)
			System.out.println("O cojunto A está contido em B");
		
		// Se caso quisesse verificar somente um elemento dentro do conjunto, poderiamos fazer da seguinte forma:
		
		String fruta = "pera";
		flag = conjuntoA.contains(fruta);
		
		if(flag)
			System.out.println("A " + fruta + " existe no conjunto A");
		else
			System.out.println("A " + fruta + " não existe no conjunto A");
	}
}
