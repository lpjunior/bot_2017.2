package app;

import entidade.Aritmetica;

public class TestAritmetica {
	public static void main(String[] args) {
		Aritmetica aritmetica = new Aritmetica();
		
		System.out.println("A soma dos valores é: " + aritmetica.soma(1,2));

		System.out.println("A soma dos números das chamadas de vocês é: " + aritmetica.soma(1, 13, 12, 6, 4, 10, 9, 11, 8));
	
	System.out.println("A subtracao dos valores é: " + aritmetica.subtracao(1,2));
	
	System.out.println("A subtracao dos valores é: " + aritmetica.subtracao(1, 13, 12, 6, 4, 10, 9, 11, 8));
	
	
	System.out.println("A multiplicacao dos valores é: " + aritmetica.multiplicacao(2,4));
	
	System.out.println("A divisão dos valores é: " + aritmetica.divisao(4,2));
	}
}
