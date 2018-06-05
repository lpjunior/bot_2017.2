package app;

import entidade.Cliente;

public class App {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Rose", "rose@gmail.com", "123.456.789-00");
		
		System.out.println(cliente);
	}
}
