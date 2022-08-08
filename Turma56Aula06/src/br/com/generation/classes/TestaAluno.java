package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno al1 = new Aluno();
		
		al1.setNome("Ingrid");
		al1.setIdade(22);
		al1.setCurso("Java - Puro");
		
		System.out.println(al1.getNome());
		System.out.println(al1.getIdade());
		System.out.println(al1.getCurso());
		
	}

}
