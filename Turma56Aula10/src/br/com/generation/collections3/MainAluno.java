package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos deseja add: ");
		int numeroDeAlunos = sc.nextInt();
		
		for(int i = 0; i< numeroDeAlunos; i++);{
			System.out.println("DIgiete a idade do aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("DIgite o nome do aluno: ");
			String nome = sc.nextLine();
			
			alunos.add(new Aluno(idade, nome));
			
		sc.close();
		}
		
		for(Aluno  i : alunos) {
			System.out.println(i);

		}

	}

}
