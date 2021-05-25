package Entidades;

public class Professor extends Pessoa {

	private String Especialidade;
	private float Salario;
	
	

	public Professor(String nome, int idade, String sexo, String cpf, String especialidade, float salario) {
		super(nome, idade, sexo, cpf);
		Especialidade = especialidade;
		Salario = salario;
	}

	public String getEspecialidade() {
		return Especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.Especialidade = especialidade;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		this.Salario = salario;
	}
	
	
}

