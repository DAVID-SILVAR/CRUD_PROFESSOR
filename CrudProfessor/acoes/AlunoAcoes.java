package acoes;

import java.util.ArrayList;

import Entidades.Aluno;
import Entidades.Disciplina;
import Interface.AlunoInterface;

public class AlunoAcoes implements AlunoInterface {
	private ArrayList<Aluno> alunosRepositorio;

	public AlunoAcoes() {
		this.alunosRepositorio = new ArrayList<Aluno>();
	}

	public void matricular(String nome, int idade, String sexo, String cpf, int matricula, String curso) {

		if (buscarPorCpfOuMatricula(cpf, matricula) == null) {
			this.alunosRepositorio.add(new Aluno(nome, idade, sexo, cpf, matricula, curso));

		}

	}

	public void alterar(String nome, int idade, String sexo, String cpf, int matricula, String curso) {

		Aluno alunoEncontrado = buscarPorCpfOuMatricula(cpf, matricula);
		if (alunoEncontrado != null) {
			if (nome != null && nome != alunoEncontrado.getNome())
				alunoEncontrado.setNome(nome);
			if (idade > 0 && idade != alunoEncontrado.getIdade())
				alunoEncontrado.setIdade(idade);
			if (sexo != null && sexo != alunoEncontrado.getSexo())
				alunoEncontrado.setSexo(sexo);
			if (cpf != null && cpf != alunoEncontrado.getCpf())
				alunoEncontrado.setCpf(cpf);
			if (matricula > 0 && matricula != alunoEncontrado.getMatricula())
				alunoEncontrado.setMatricula(matricula);
			if (curso != null && curso != alunoEncontrado.getCurso())
				alunoEncontrado.setCurso(curso);
		}

	}

	public void excluir(String cpf, int matricula) {
		Aluno alunoEcluir = buscarPorCpfOuMatricula(cpf, matricula);
		if (alunoEcluir != null) {
			this.alunosRepositorio.remove(alunoEcluir);
		}

	}

	public void imprimir() {

		if (alunosRepositorio.size() > 0) {
			for (Aluno aluno : alunosRepositorio) {
				System.out.println("Nome:" + aluno.getNome());
			}
		}else
			System.out.println("REPOSITORIO VAZIO");

	}
	


	public Aluno buscarPorCpfOuMatricula(String cpf, int matricula) {

		for (Aluno aluno : alunosRepositorio) {

			if (cpf != null) {
				if (aluno.getCpf().equals(cpf))
					return aluno;
			}

			else if (matricula > 0) {
				if (aluno.getMatricula() == (matricula))
					return aluno;
			}
		}
		return null;

	}
	public void imprimirAluno(String cpf, int matricula, DisciplinaAcoes acoes) {

		Aluno alunoImprimir = buscarPorCpfOuMatricula(cpf, matricula);
		if (alunoImprimir != null) {
			 System.out.println("NOME:"+alunoImprimir.getNome());
			 System.out.println("CPF:"+alunoImprimir.getCpf());
			 System.out.println("MATRICULA:"+alunoImprimir.getMatricula());
			 System.out.println("CURSO:"+alunoImprimir.getCurso());
			 if(acoes!=null) {
				 for (Disciplina disciplina : acoes.buscarPorCpfMatriculaAluno(cpf, matricula, alunoImprimir.getCurso())) {
					 System.out.println("NOME DISCIPLINA:"+disciplina.getNome());
				}
				 
				 
			 }
			 
			 
		}

	}
}
