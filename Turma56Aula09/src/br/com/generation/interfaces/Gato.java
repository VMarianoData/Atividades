package br.com.generation.interfaces;

public class Gato extends Animal2 implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Gato miando...");
		
	}

	@Override
	public void dormir() {
		System.out.println("Gato dormindo....");
		
	}

}
