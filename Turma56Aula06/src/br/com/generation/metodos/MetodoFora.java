package br.com.generation.metodos;

public class MetodoFora {

	public static String metodo06(int i, int f) throws InterruptedException {
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			
			numeroString += c + " | ";
			Thread.sleep(500);
		}
		
		return numeroString;
		
	}
}
