package avaliacaoSelenium;

public class Diretor {

	private String nome;
	private String nascimento;

	public Diretor(String nome, String nascimento) {

		this.nome = nome;
		this.nascimento = nascimento;

	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public void setNascimento(String nascimento) {

		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}
	
	public String toString() {
		return nome+  nascimento;
		
		
		
	}

}
