package Entidades;

import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private String curso;
	private int codigo;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	private int ano;
	private int semestre;
	
	 
	public Disciplina(String nome, String curso, int codigo, ArrayList<Aluno> alunos, Professor professor, int ano,
			int semestre) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.codigo = codigo;
		this.alunos = alunos;
		this.professor = professor;
		this.ano = ano;
		this.semestre = semestre;
	}
	public Disciplina() {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}
