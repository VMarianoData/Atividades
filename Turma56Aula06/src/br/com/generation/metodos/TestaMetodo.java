package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodo {
	
	static int numero03, numero04, subtracao;

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores: ");
		int numero07 = sc.nextInt();
		int numero08 = sc.nextInt();
		
		metodo01();
		metodo02();
		metodo03();
		metodo04();
		metodo05(2, 8);
		System.out.println(MetodoFora.metodo06(numero07, numero08));
		
		sc.close();

	}
	
	public static void metodo01() {
		System.out.println("Olá eu sou o método 01...");
		
	}
	
	public static void metodo02() {
		int  soma, numero01 = 10, numero02 = 20;
		
		soma = numero01 + numero02;
		
		System.out.println("Soma no método 02: " + soma);
	}
	
	public static void metodo03() {
		subtracao = numero03 - numero04;
	}
	
	public static void metodo04() {
		System.out.println("Método 04, mostrando resultado do método 03: " + subtracao);
		
	}
	
	public static void metodo05(int numero5, int numero6) {
		int multiplicacao = numero5 * numero6;
		System.out.println("Mutiplicação no método05: " + multiplicacao);
		
	}
	

}
