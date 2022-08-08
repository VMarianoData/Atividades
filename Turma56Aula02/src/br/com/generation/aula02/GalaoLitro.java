package br.com.generation.aula02;

import java.util.Scanner;

public class GalaoLitro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double galoes, litros, mutipli;
		
		System.out.println("Adicione quantos galões você deseja: ");
		galoes = sc.nextDouble();
		
		litros = 3.600;
		mutipli = galoes * litros;
		
		System.out.println("Você pediu " + galoes + " galões e terá " + mutipli +" litros");
		
		sc.close();
	}

}
