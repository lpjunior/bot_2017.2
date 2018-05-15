package extra01.ex08;

import java.util.ArrayList;
import java.util.List;

public class Triangulo {
	
	private List<PlanoCartesiano> coordenadas = new ArrayList<PlanoCartesiano>();
	private int determinante;
	
	public Triangulo(int ...vertices) {
		
		coordenadas.add(new PlanoCartesiano(vertices[0], vertices[1]));
		coordenadas.add(new PlanoCartesiano(vertices[2], vertices[3]));
		coordenadas.add(new PlanoCartesiano(vertices[4], vertices[5]));
		
		System.out.println("Coordenadas informadas foram:");
		
		int cont = 1;
		for (PlanoCartesiano pc : coordenadas) {
			System.out.println("Vertice " + cont + " - (" + pc.getPontoX() + ", " + pc.getPontoY() + ")");
			cont++;
		}
	}
	
	private int calcularDeterminar() {
		int pSLado = (coordenadas.get(0).getPontoX() * coordenadas.get(1).getPontoY() * 1);
		System.out.println("pS: " + pSLado);
		int sSLado = (coordenadas.get(0).getPontoY() * 1 * coordenadas.get(2).getPontoX());
		System.out.println("sS: " + sSLado);
		int tSLado = (1 * coordenadas.get(1).getPontoX() * coordenadas.get(2).getPontoY());
		System.out.println("tS: " + tSLado);
		
		int pILado = (coordenadas.get(0).getPontoY() * coordenadas.get(1).getPontoX() * 1);
		System.out.println("pI: " + pILado);
		int sILado = (coordenadas.get(0).getPontoX() * 1 * coordenadas.get(2).getPontoY());
		System.out.println("sI: " + sILado);
		int tILado = (1 * coordenadas.get(1).getPontoY() * coordenadas.get(2).getPontoX());
		System.out.println("tI: " + tILado);
		
		determinante = (pSLado + sSLado + tSLado) - (pILado + sILado + tILado);
		System.out.println("det1: " + (pSLado + sSLado + tSLado));
		System.out.println("det2: " + (pILado + sILado + tILado));
		
		System.out.println("determinante: " + determinante);
		determinante = (int) (((double)1/2) * determinante);
		
		System.out.println("superficie: " + determinante);
		
		return (determinante < 0) ? determinante * (-1) : determinante;
		
	}

	public int getPerimetro() {
		return calcularDeterminar();
	}
}
