package acoes;

import java.util.ArrayList;

import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Professor;
import Interface.DisciplinaInterface;

public class DisciplinaAcoes implements DisciplinaInterface {

	private ArrayList<Disciplina> disciplinasRepositorio;
	private AlunoAcoes alunoAcoes;
	private ProfessorAcoes professorAcoes;

	public DisciplinaAcoes(AlunoAcoes alunoAcoes, ProfessorAcoes professorAcoes) {
		this.disciplinasRepositorio = new ArrayList<Disciplina>();
		this.alunoAcoes = alunoAcoes;
		this.professorAcoes = professorAcoes;
	}

	@Override
	public void cadastrar(String nome, int codigo, ArrayList<Aluno> alunos, Professor professor, int ano, int semestre,
			String curso) {

		if (buscarPorCodigo(codigo) == null) {
			this.disciplinasRepositorio.add(new Disciplina(nome, curso, codigo, null, null, ano, semestre));
		}

	}

	@Override
	public Disciplina buscarPorCodigo(int codigo) {
		for (Disciplina disciplina : disciplinasRepositorio) {
			if (disciplina.getCodigo() == codigo)
				return disciplina;
		}
		return null;
	}

	@Override
	public ArrayList<Disciplina> buscarPorCpfProfessor(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(int codigo) {
		// TODO Auto-generated method stub

	}

	public void matricularAlunoDisciplina(String cpf, int matricula, int codigoDisciplina) {

		Aluno aluno = alunoAcoes.buscarPorCpfOuMatricula(cpf, matricula);
		if (aluno != null) {
			Disciplina diciplina = buscarPorCodigo(codigoDisciplina);
			if (diciplina != null)
				diciplina.getAlunos().add(aluno);

		}

	}

	public void matricularProfessorDisciplina(String cpf, int codigoDisciplina) {

		/*
		 * Professor professor=alunoAcoes.buscarPorCpfOuMatricula(cpf, matricula); if(
		 * professor!=null) { Disciplina diciplina=buscarPorCodigo(codigoDisciplina);
		 * if(diciplina!=null) diciplina.setProfessor(professor);
		 * 
		 * }
		 */

	}

	@Override
	public void alterar(String nome, int codigo, ArrayList<Aluno> alunos, Professor professor, int ano, int semestre,
			String curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public Disciplina buscarPorCurso(String curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Disciplina> buscarPorCpfMatriculaAluno(String cpf, int matricula, String curso) {
		ArrayList<Disciplina> disciplinasEncontrada = new ArrayList<Disciplina>();
		for (Disciplina disciplina : disciplinasRepositorio) {
			if (curso.equals(disciplina.getCurso())) {
				for (Aluno aluno : disciplina.getAlunos()) {
					if (aluno.getCpf().equals(cpf) || aluno.getMatricula() == matricula)
						disciplinasEncontrada.add(disciplina);

				}
			}

		}
		return disciplinasEncontrada;
	}

}

