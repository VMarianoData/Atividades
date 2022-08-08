package be.com.generation.teste.software;

import java.util.Scanner;

public class TestaMetodoUnitario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		System.out.println("DIgite os valores: ");
		double resultado = calc.somar(sc.nextDouble(), sc.nextDouble());
		
		if(resultado ==  resultadoEsperado) {
			System.out.println("Ok");
		} else {
			System.out.println("Falhou!");
		}

		sc.close();
	}

}
