package br.com.uninassau.polimorfismo.domain;

public class DVD extends Produto {
	
	// Attributes
	private String diretor;
	private String duracao;
	
	// Constructor
	public DVD(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}
	
	// Methods
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public void setPreco_a_vista() {
		super.preco_a_vista = (this.getPreco() - this.getDesconto_a_vista());
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Diretor: " + this.diretor + "\n" +
				"Duração: " + this.duracao + "\n";
	}


}
