package br.com.generation.aula02;

import java.util.Scanner;

public class EntradaSaidaDeDados {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int a, b, soma;

		System.out.println("Escreva o valor de A: ");
		a = sc.nextInt();

		System.out.println("Escreva o valor de B: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("Resultado da soma: " + soma);
		
		sc.close();
	}

}
