package Entidades;

public abstract class Pessoa {

	private String Nome;
	private int Idade;
	private String Sexo;
	private String cpf;
	

	/*public Pessoa(String nome, int idade, String sexo, String cpf) {
		 
		this.Nome = nome;
		this.Idade = idade;
		this.Sexo = sexo;
		this.cpf = cpf;
	}*/

	
	public Pessoa(String nome2, int idade2, String sexo2, String cpf2) {
		this.Nome = nome2;
		this.Idade = idade2;
		this.Sexo = sexo2;
		this.cpf = cpf2;
		
	}





	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		this.Idade = idade;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}

	
}