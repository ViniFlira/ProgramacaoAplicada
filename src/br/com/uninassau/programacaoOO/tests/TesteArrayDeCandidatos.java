package br.com.uninassau.programacaoOO.tests;

import java.util.ArrayList;

import br.com.uninassau.programacaoOO.domain.Candidato;

public class TesteArrayDeCandidatos {

	public static void main(String[] args) {

		// Variáveis
		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

		// Criando os Candidatos
		Candidato c1 = new Candidato("Ciro Gomes", 62, 'M', 12, "PDT");
		candidatos.add(c1);
		Candidato c2 = new Candidato("João Amoedo", 57, 'M', 25, "NOVO");
		candidatos.add(c2);
		Candidato c3 = new Candidato("Fernando Hadda", 57, 'M', 13, "PT");
		candidatos.add(c3);
		Candidato c4 = new Candidato("Marina Silva", 62, 'F', 18, "REDE");
		candidatos.add(c4);
		Candidato c5 = new Candidato("Meireles", 77, 'M', 25, "PSDB");
		candidatos.add(c5);

		// Percorrendo o ArrayList mostrando as informações completas dos candidatos.
		for (Candidato candidato : candidatos) {
			System.out.println(candidato + "Numero de Votos do Candidato: "
										+ candidato.getVotosrecebidos());
			System.out.println("------------------x------------------");
		}
	}

}
