package br.com.generation.interfaces;

public class Cachorro extends Animal2 implements Animal {

	@Override
	public void somAnimal() {

		System.out.println("Cachorro latindo.....");
		
	}

	@Override
	public void dormir() {
		
		System.out.println("Cachorro dormindo.....");
		
	}
	

}
