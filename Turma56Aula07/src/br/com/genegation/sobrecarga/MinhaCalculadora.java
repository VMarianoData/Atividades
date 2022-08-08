package br.com.genegation.sobrecarga;

public class MinhaCalculadora {

	public int soma(int numero1, int numero2) {
		System.out.println("Inteiros");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
		System.out.println("Fracionario");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2, double numero3) {
		System.out.println("3 Numeros");
		return numero1 + numero2 + numero3;
	}
}
