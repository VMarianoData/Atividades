package br.com.generation.alunos;

import br.com.generation.superclass.Pessoa;

public class Aluno extends Pessoa {
	
	private String semestre;
	private String curso;
	
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
