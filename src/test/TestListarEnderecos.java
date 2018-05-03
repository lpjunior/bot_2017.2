package test;

import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestListarEnderecos {
	public static void main(String[] args) {

		EnderecoDAOImp dao = new EnderecoDAOImp();

		// foreach padr�o
		/*
		 * for (Endereco end : dao.listar()) { 
		 *	 System.out.println(end);
		 * }
		 */

		// foreach usando o express�o lambda (imprimir tudo)
	 /*dao.listar().forEach(endereco->System.out.println(endereco));*/

		// foreach usando o express�o lambda (imprimir somente o endere�o de id 2)
	dao.listar().forEach(endereco -> {
		if (new Integer(2).equals(endereco.getId())) {
			System.out.println(endereco);
		}
	});

		// foreach usando o m�todo por refer�ncia
		// dao.listar().forEach(System.out::println);

		/**
		 * @method dao.listar() - retorna a lista de endere�os
		 * @method forEach - m�todo respons�vel por implementar o loop foreach a partir
		 *         da lista(internamente)
		 * @param (System.out)
		 *            - parametro de inicializa��o(origem) do m�todo referencia que quer
		 *            trabalhar
		 * @param (::)
		 *            - caracter para representar passagem de referencia
		 * @param (println)
		 *            - m�todo utilizado na referencia
		 **/
	}
}
