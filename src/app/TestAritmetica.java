package app;

import entidade.Aritmetica;

public class TestAritmetica {
	public static void main(String[] args) {
		Aritmetica aritmetica = new Aritmetica();
		
		System.out.println("A soma dos valores �: " + aritmetica.soma(1,2));

		System.out.println("A soma dos n�meros das chamadas de voc�s �: " + aritmetica.soma(1, 13, 12, 6, 4, 10, 9, 11, 8));
	
	System.out.println("A subtracao dos valores �: " + aritmetica.subtracao(1,2));
	
	System.out.println("A subtracao dos valores �: " + aritmetica.subtracao(1, 13, 12, 6, 4, 10, 9, 11, 8));
	
	
	System.out.println("A multiplicacao dos valores �: " + aritmetica.multiplicacao(2,4));
	
	System.out.println("A divis�o dos valores �: " + aritmetica.divisao(4,2));
	}
}
