package br.com.uninassau.programacaoOO.tests;

import java.util.Scanner;

import br.com.uninassau.programacaoOO.domain.Candidato;

public class TesteVoto {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int voto;

		Candidato c1 = new Candidato("Ciro Gomes", 62, 'M', 12, "PDT");

		System.out.printf("Informe o nº do seu Candidato: ");
		voto = ler.nextInt();

		if (voto == c1.getNumeroPartido()) {
			c1.receberVoto();
			System.out.println(c1);
			System.out.println("O seu voto foi: " + voto);
			System.out.println("Numero de Votos do Candidato: " + c1.getVotosrecebidos());

		} else {
			System.out.println("O seu voto foi: " + voto);
			System.out.println("Nenhum Candidato Registrado com Esse Número!");
		}

	}

}
