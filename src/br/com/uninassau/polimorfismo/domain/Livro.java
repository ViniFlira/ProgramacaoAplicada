package br.com.uninassau.polimorfismo.domain;

public class Livro extends Produto {
	
	// Attributes
	private String autor;
	private String editora;
	
	// Constructor
	public Livro(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}
	
	// Methods
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public void setPreco_a_vista() {
		super.preco_a_vista = (this.getPreco() - this.getDesconto_a_vista());
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"Autor: " + this.autor + "\n" +
				"Editora: " + this.editora + "\n";
	}

}
