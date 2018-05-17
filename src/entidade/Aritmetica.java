package entidade;

public class Aritmetica {

	/**
	 * @param ...valores (varargs) - � como fosse definido um vetor como parametro
	 **/
	public double soma(double ...valores) {
		double resultado = 0;
		
		for (double v : valores) {
			resultado += v;
		}
		
		return resultado;
	}
	
	public double subtracao(double ...valores) {
		double resultado = valores[0]; // a variavel resultado ser� iniciada com a primeira posi��o do meu array
		// int i = 1, pois o for ir� come�ar a partir da segunda posi��o do array
		for (int i = 1; i < valores.length; i++) {
			resultado -= valores[i];
		}
		
		return resultado;
	}
	
	public double multiplicacao(double ...valores) {
		double resultado = 1;
		
		for (double v : valores) {
			resultado *= v;
		}
		
		return resultado;
	}
	
	public double divisao(double ...valores) {
		double resultado = valores[0];
		
		for (int i = 1; i < valores.length; i++) {
			resultado /= valores[i];
		}
		
		return resultado;
	}
}
