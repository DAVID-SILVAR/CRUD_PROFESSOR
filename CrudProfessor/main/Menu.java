package main;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Aluno;
import Entidades.Professor;
import acoes.AlunoAcoes;
import acoes.DisciplinaAcoes;
import acoes.ProfessorAcoes;

public class Menu {
	// public static
	public static Scanner sc1 = new Scanner(System.in);
	public static AlunoAcoes alac = new AlunoAcoes();
	public static ProfessorAcoes profAc = new ProfessorAcoes();
	public static DisciplinaAcoes discAc = new DisciplinaAcoes(alac, profAc);

	public static void menuAluno() {
		int opcao = -1;

		String nome = null;
		int idade = 0;
		String sexo = null;
		String cpf = null;
		int matricula = 0;
		String curso = null;

		System.out.println("Digite a opção desejada :" + "\n1 - Cadastrar Aluno" + "\n2 - Imprimir Alunos"
				+ "\n3 - Alterar Aluno" + "\n4 - Excluir" + "\n5 - Consultar Aluno" + "\n 0 - voltar");
		opcao = sc1.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do aluno");
			nome = sc1.next();
			System.out.println("Digite a Idade do aluno");
			idade = sc1.nextInt();
			System.out.println("Digite o sexo do aluno");
			sexo = sc1.next();
			System.out.println("Digite o CPF do aluno");
			cpf = sc1.next();
			System.out.println("Digite a Matriculo do aluno");
			matricula = sc1.nextInt();
			System.out.println("Digite o Curso do aluno");
			curso = sc1.next();
			alac.matricular(nome, idade, sexo, cpf, matricula, curso);
			break;
		case 2:
			alac.imprimir();
			break;
		case 3:
			System.out.println("Digite o nome do aluno");
			nome = sc1.next();
			System.out.println("Digite a Idade do aluno");
			idade = sc1.nextInt();
			System.out.println("Digite o sexo do aluno");
			sexo = sc1.next();
			System.out.println("Digite o CPF do aluno");
			cpf = sc1.next();
			System.out.println("Digite a Matriculo do aluno");
			matricula = sc1.nextInt();
			System.out.println("Digite o Curso do aluno");
			curso = sc1.next();
			alac.alterar(nome, idade, sexo, cpf, matricula, curso);
			break;
		case 4:

			System.out.println("Digite o CPF do aluno");
			cpf = sc1.next();
			System.out.println("Digite a Matriculo do aluno");
			matricula = sc1.nextInt();
			alac.excluir(cpf, matricula);
			break;

		case 5:

			System.out.println("Digite o CPF do aluno");
			cpf = sc1.next();
			System.out.println("Digite a Matriculo do aluno");
			matricula = sc1.nextInt();
			alac.imprimirAluno(cpf, matricula, discAc);
			break;

		default:
			break;
		}
		if (opcao != 0)
			menuAluno();

	}

	public static void menuProfessor() {
		int opcao = -1;

		String nome = null;
		int idade = 0;
		String sexo = null;
		String cpf = null;
		int matricula = 0;
		String curso = null;

		System.out.println("Digite a opção desejada :" + "\n1 - Cadastrar Professor" + "\n2 - Imprimir Professores"
				+ "\n3 - Alterar Professor" + "\n4 - Excluir Professor" + "\n5 - Consultar Professor"
				+ "\n 0 - voltar");
		opcao = sc1.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do Professor");
			nome = sc1.next();
			System.out.println("Digite a Idade do Professor");
			idade = sc1.nextInt();
			System.out.println("Digite o sexo do Professor");
			sexo = sc1.next();
			System.out.println("Digite o CPF do Professor");
			cpf = sc1.next();

			System.out.println("Digite o Curso do Professor");
			curso = sc1.next();

			break;
		case 2:

			break;
		case 3:
			System.out.println("Digite o nome do Professor");
			nome = sc1.next();
			System.out.println("Digite a Idade do Professor");
			idade = sc1.nextInt();
			System.out.println("Digite o sexo do Professor");
			sexo = sc1.next();
			System.out.println("Digite o CPF do Professor");
			cpf = sc1.next();

			System.out.println("Digite o Curso do Professor");
			curso = sc1.next();

			break;
		case 4:

			System.out.println("Digite o CPF do Professor");
			cpf = sc1.next();

			break;

		case 5:

			System.out.println("Digite o CPF do Professor");
			cpf = sc1.next();

			break;

		default:
			break;
		}
		if (opcao != 0)
			menuProfessor();

	}

	public static void menuDisciplina() {
		int opcao = -1;

		String nome = null;
		String curso = null;
		int codigo = 0;

		int ano = 0;
		int semestre = 0;

		System.out.println("Digite a opção desejada :" + "\n1 - Cadastrar Disciplina" + "\n2 - Imprimir Disciplinas"
				+ "\n3 - Alterar Disciplina" + "\n4 - Excluir Disciplina" + "\n5 - Consultar Disciplina"
				+ "\n 0 - voltar");
		opcao = sc1.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do Disciplina");
			nome = sc1.next();

			break;
		case 2:

			break;
		case 3:
			System.out.println("Digite o nome do Professor");
			nome = sc1.next();

			break;
		case 4:

			break;

		case 5:

			break;

		default:
			break;
		}
		if (opcao != 0)
			menuDisciplina();

	}

	public static void main(String[] args) {
		int opcao = -1;
		do {
			

			System.out.println("Digite a opção desejada :" + "\n1 - MENU ALUNO" + "\n2 - MENU PROFESSOR"
					+ "\n3 - MENU DISCIPLINA" + "\n 0 - SAIR");
			opcao = sc1.nextInt();
			switch (opcao) {
			case 1:
				menuAluno();
				break;
			case 2:
				menuProfessor();
				break;
			case 3:
				menuDisciplina();
				break;

			default:
				break;
			}
		} while (opcao != 0);

	}

}

