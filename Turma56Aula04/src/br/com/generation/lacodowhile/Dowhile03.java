package br.com.generation.lacodowhile;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		do {
			
			System.out.println("Digite o 1° número: ");
			int numero1 = sc.nextInt();
					
			System.out.println("Digite o 2° número: ");
			int numero2 = sc.nextInt();
			
			if(numero2 == 0 || numero1 == 0) {
				continue; // Vai continuar mesmo que o erro aconteça
				//break;// bloqueia a instrução do while
			}
			
			
			System.out.println((i+1) + "° resultado: " + numero1 + "/" + numero2 + " é: " + (numero1/numero2) + "\n");
					
			i++;
					
		}while(i <= 10);
		
		System.out.println("FIm do sistema. ");

		sc.close();
	}

}
