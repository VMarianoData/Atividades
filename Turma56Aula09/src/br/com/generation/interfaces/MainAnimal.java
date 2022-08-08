package br.com.generation.interfaces;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.setNome("Dog");
		meuCachorro.setIdade(5);
		
		System.out.println(meuCachorro.getNome());
		System.out.println(meuCachorro.getIdade());
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
	}

}
