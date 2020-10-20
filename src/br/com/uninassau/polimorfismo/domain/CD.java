package br.com.uninassau.polimorfismo.domain;

public class CD extends Produto {
	
	// Attributes
	private String cantor;
	private String produtor;

	// Constructor
	public CD(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}
	
	// Methods
	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	
	@Override
	public void setPreco_a_vista() {
		super.preco_a_vista = (this.getPreco() - this.getDesconto_a_vista());
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Cantor: " + this.cantor + "\n" +
				"Produtor: " + this.produtor + "\n";
	}

}
