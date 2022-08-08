package br.com.generation.vetores;

public class Vetor01 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		vetor[2] = 357;
		
		int numero = 157;
		
		vetor[4] = numero;
		
		vetor[7] = 456;
		
		int valor = vetor[7];
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Posição: " + " | "  + vetor[i]);
		}

	}

}
