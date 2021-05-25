package Entidades;

public class Aluno  extends Pessoa{

	private int Matricula;
	private String Curso; 
 

	public Aluno(String nome, int idade, String sexo, String cpf, int matricula, String curso) {
		super(nome, idade, sexo, cpf);
		Matricula = matricula;
		Curso = curso;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		this.Matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		this.Curso = curso;
	}
	
	
}

