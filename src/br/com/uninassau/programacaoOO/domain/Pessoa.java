package br.com.uninassau.programacaoOO.domain;

public abstract class Pessoa {

	// Attributes
	private String nome;
	private int idade;
	private char sexo;

	// Methods
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void idadeMaisUm() {
		this.idade++;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// Constructor
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

}
