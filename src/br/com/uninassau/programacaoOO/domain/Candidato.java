package br.com.uninassau.programacaoOO.domain;

public class Candidato extends Pessoa implements Comparable<Candidato> {

	// Attributes
	private int numeroPartido;
	private String nomePartido;
	private int votosRecebidos;

	// O atributo votosRecebidos não terá um setter,
	// pois esse atributo só poderá ser modificado
	// a partir do método receberVoto().

	// Constructor
	public Candidato(String nome, int idade, char sexo, int numeroPartido, String nomePartido) {
		super(nome, idade, sexo);
		this.numeroPartido = numeroPartido;
		this.nomePartido = nomePartido;
		this.votosRecebidos = 0;
	}

	// Methods
	public int getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(int numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	public int getVotosrecebidos() {
		return votosRecebidos;
	}

	public void receberVoto() {
		this.votosRecebidos++;
	}

	@Override
	public String toString() {
		return "Nome do Candidato: " + this.getNome() + "\n" +
				"Número do Partido: " + this.getNumeroPartido() + "\n"
				+ "Nome do Partido: " + this.getNomePartido() + "\n";
	}

	public int compareTo(Candidato outroCandidato) {
		if (this.votosRecebidos > outroCandidato.getVotosrecebidos()) {
			return -1;
		}
		if (this.votosRecebidos < outroCandidato.getVotosrecebidos()) {
			return 1;
		}
		return 0;
	}

}
