package Interface;


import java.util.ArrayList;

import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Professor;

public interface DisciplinaInterface {
	public void cadastrar(String nome, int codigo, ArrayList<Aluno> alunos, Professor professor, int ano, int semestre,String curso);
	public void alterar(String nome, int codigo, ArrayList<Aluno> alunos, Professor professor, int ano, int semestre,String curso);
	public Disciplina buscarPorCodigo(int codigo);
	public Disciplina buscarPorCurso(String curso);
	public ArrayList<Disciplina> buscarPorCpfProfessor(String cpf);
	public ArrayList<Disciplina> buscarPorCpfMatriculaAluno(String cpf,int matricula,String curso);
	public void imprimir();
	public void excluir(int codigo);
	
	
	

}
