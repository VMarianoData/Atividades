package br.com.generation.vetores;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamanho do vetor");
		int tamanhoDoVetor = sc.nextInt();
		
		String[] nomes = new String[tamanhoDoVetor];
		double[] notas = new double[tamanhoDoVetor];
		double soma = 0.0, media = 0.0;
		
		System.out.println("DIgite às 4 notas do Aluno: ");
		for(int i = 0; i <= nomes.length && i < notas.length; i++) {
			System.out.print("Digite o nome do aluno: ");
			nomes[i] = sc.next();
			sc.nextLine();
			System.out.print("Digite a nota do aluno: ");
			notas[i] = sc.nextDouble();
			
		}
		
		for(int i = 0; i <= nomes.length && i < notas.length; i++) {
			
			System.out.println("Aluno: " + nomes[i] + " | " + " Nota: " + notas[i]);
			soma += notas[i];
			media = soma / notas.length;
			
		}
		
		System.out.println("Média genal dos Alunos " + media);
		
		sc.close();
		}
		
		
	}


