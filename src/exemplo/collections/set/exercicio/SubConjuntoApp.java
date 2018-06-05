package exemplo.collections.set.exercicio;

import java.util.HashSet;

public class SubConjuntoApp {
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
		
		// Verificar se o conjuntoA � subconjunto(est� contido) do conjuntoB
		boolean flag = conjuntoB.containsAll(conjuntoA); 
		// o m�todo retorna true caso o conjuntoA esteja dentro do conjuntoB 
		
		if(flag)
			System.out.println("O cojunto A est� contido em B");
		
		// Se caso quisesse verificar somente um elemento dentro do conjunto, poderiamos fazer da seguinte forma:
		
		String fruta = "pera";
		flag = conjuntoA.contains(fruta);
		
		if(flag)
			System.out.println("A " + fruta + " existe no conjunto A");
		else
			System.out.println("A " + fruta + " n�o existe no conjunto A");
	}
}
