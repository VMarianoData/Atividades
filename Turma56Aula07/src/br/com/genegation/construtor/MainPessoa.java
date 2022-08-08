package br.com.genegation.construtor;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite a sua idade: ");
		int idade =sc.nextInt();
		
		Pessoa p1 = new Pessoa(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
	}

}
