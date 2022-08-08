package br.com.generation.matrizes;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[][] notasAlunos = new double[2][2];
		double soma = 0.0, var = 0.0;
		
		
		for( int l = 0; l < notasAlunos.length; l++ ) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				
				System.out.printf("Nota na posição [%d][%d]: ", l,c);
				notasAlunos[l][c] = sc.nextDouble();		
				soma += notasAlunos[l][c];
				var++;
				
				}
		}
		
		
		for( int l = 0; l < notasAlunos.length; l++ ) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");				
			}
			
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Média geral dos alunos; " + (soma/var));
		sc.close();
	}

}
