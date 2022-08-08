package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class LacoCondicional01 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("DIgite a Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("\033[H\033[2J");  //limpa
		System.out.flush();// manda o curso pro topo do console
			
		System.out.println("DIgite a Segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2)/ 2;
		
		System.out.println(media);
			
		}
}
