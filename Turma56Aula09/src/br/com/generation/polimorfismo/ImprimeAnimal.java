package br.com.generation.polimorfismo;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro("Rabujento"));
		t.fazerAnimalComer(new Tigre());

	}

}
