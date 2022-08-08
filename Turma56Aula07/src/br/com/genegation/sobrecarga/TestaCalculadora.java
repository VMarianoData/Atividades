package br.com.genegation.sobrecarga;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora Calculadora = new MinhaCalculadora();
		
		System.out.printf( "Cachorro de madame %.2f ", Calculadora.soma(10.0, 300));
		
		
	}

}
