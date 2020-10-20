package br.com.uninassau.polimorfismo.domain;

import java.text.DecimalFormat;

public abstract class Produto {

	// Attributes
	private int codigo;
	private String nome;
	private double preco;
	protected double desconto_a_vista;
	protected double preco_a_vista;
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	// Constructor
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;

	}

	// Methods
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto_a_vista() {
		return desconto_a_vista;
	}

	public void setDesconto_a_vista(double desconto_a_vista) {
		this.desconto_a_vista = (desconto_a_vista / 100) * this.getPreco();
		this.setPreco_a_vista();
	}

	public double getPreco_a_vista() {
		return this.preco_a_vista;
	}
	
	public abstract void setPreco_a_vista();
	
	@Override
	public String toString() {
		return "Código do Produto: " + this.codigo + "\n" +
				"Nome: " + this.nome + "\n" +
				"Preço: R$" + this.preco + "\n" +
				"Desconto a Vista: R$" + formatador.format(this.desconto_a_vista) + "\n" +
				"Preço a Vista: R$" + formatador.format(this.preco_a_vista) + "\n" ;
	}

}
