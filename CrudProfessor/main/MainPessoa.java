package main;

import java.util.ArrayList;

import Entidades.Aluno;
import Entidades.Pessoa;
import Entidades.Professor;
import acoes.AlunoAcoes;
import acoes.DisciplinaAcoes;
import acoes.ProfessorAcoes;

public class MainPessoa {
	
	
	
	
	public static void main(String[] args) {
		
		 AlunoAcoes alac=new AlunoAcoes();
		 ProfessorAcoes profAc=new ProfessorAcoes();
		 DisciplinaAcoes discAc=new DisciplinaAcoes(alac, profAc);
		 
		 alac.matricular("Fulano", 22, "masculino", "323423", 3233, "SISTEMA");
		 alac.imprimir();
		 alac.alterar("Fulano3w333", 22, "masculino", "323423", 3233, "SISTEMA");
		 alac.imprimir();
		 alac.excluir("323423", 0);
		 alac.imprimir();

		
		
		
	}

}