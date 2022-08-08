package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollection {

	public static void main(String[] args) {
		
		String aula1 = "EBloco I - Java Puro";
		String aula2 = "ABloco II - SpringBoot";
		String aula3 = "BBloco III -FrontEnd";
		String aula4 = "CBloco Iv - Java Mobile";
		String aula5 = "DBloco V - .NET";
		
		ArrayList<String> listaAulas = new ArrayList<>();
		listaAulas.add(aula1);
		listaAulas.add(aula2);
		listaAulas.add(aula3);
		listaAulas.add(aula4);
		listaAulas.add(aula5);
		
		/*System.out.println(listaAulas);
		listaAulas.remove(2);
		
		System.out.println(listaAulas);
		
		for(String i: listaAulas) {
			System.out.println(i);
		}

		String aula = listaAulas.get(1);
		
		System.out.println(aula);
		
		for(int i = 0; i < listaAulas.size(); i++) {
			System.out.println((i + 1) + " | " + listaAulas.get(i));
		}
		
		System.out.println("Tamanho da lista: " + listaAulas.size());*/
		
		Collections.sort(listaAulas);// organiza a lista em ordem crescente 
		System.out.println(listaAulas);
		
		Collections.shuffle(listaAulas);// embaralha a lista
		System.out.println(listaAulas);
	} 

}
