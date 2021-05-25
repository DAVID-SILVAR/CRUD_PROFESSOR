package Interface;

public interface AlunoInterface {
	
	public void matricular(String nome, int idade, String sexo, String cpf, int matricula, String curso) ;
	public void alterar(String nome, int idade, String sexo, String cpf, int matricula, String curso) ;
	public void excluir(String cpf, int matricula);

}
