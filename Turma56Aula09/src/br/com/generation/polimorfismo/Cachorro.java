package br.com.generation.polimorfismo;

public class Cachorro extends Animal {
	
	Cachorro(String nome){
		System.out.println("Nome do cachorro: " + nome);
	}
	
	public void comer() {
		System.out.println("Cachorro comendo....");
	}

}
