package br.com.generation.main;

import br.com.generation.funcioario.Professor;

public class Main {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		
		prof1.setNome("Juliano");
		prof1.setIdade(23);
		prof1.setEndereço("Rua: das olivas, 250");
		prof1.setDisciplina("Java - Puro");
		prof1.setSalario(2000.00);
		
		System.out.println(prof1.getNome());
		System.out.println(prof1.getIdade());
		System.out.println(prof1.getSalario());
		System.out.println(prof1.getEndereço());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());

	}

}
