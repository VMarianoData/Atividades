package br.com.generation.classes;

public class Aluno {
	
	private int idade;
	private String nome;
	private String curso;
	
	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	void estudar() {
		System.out.println("Aluno estudando....");
	}
}
