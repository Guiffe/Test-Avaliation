package avaliacaoSelenium;

public class Filmes {
 
    private String nome;            
    private String ano;    

    public Filmes(String nome, String ano) {
    	
        this.nome = nome;
        this.ano = ano;
    }
    
public void setNome(String nome) {

	this.nome = nome;
}

public void setAno(String ano) {

	this.ano = ano;
}

public String getNome() {
	return nome;
}

public String getNascimento() {
	return ano;
}

public String toString() {
	return nome+  ano;
	
	
	
}

}


