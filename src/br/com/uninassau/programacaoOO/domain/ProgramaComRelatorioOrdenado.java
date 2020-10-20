package br.com.uninassau.programacaoOO.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProgramaComRelatorioOrdenado {

	public static void main(String[] args) throws IOException {

		// Variáveis
		ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
		int brancosNulos = 0;

		// Prepação para receber o input do usuário.
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int seletor, candidatoIdade, candidatoNumero, voto;
		String candidatoNome, candidatoPartidoNome;
		char candidatoSexo;

		// Variável de checagem de voto válido.
		boolean votoValido = false;

		// Laço de repetição do ProgramaPrincipal.
		while (true) {
			System.out.println("\nBem-vindo a votação !\n");
			System.out.println("Selecione a opção desejada: \n" + " 1 - Adicionar Candidato \n" + " 2 - Votar \n"
					+ " 3 - Consultar Candidatos \n" + " 0 - Sair");
			seletor = ler.nextInt();
			ler.nextLine();

			if (seletor == 1) {
				// Candidato("nome", idade, sexo, numeroPartido, nomePartido)
				System.out.printf("Qual o nome do Candidato: ");
				candidatoNome = (String) ler.nextLine();
				System.out.printf("Qual a idade do Candidato: ");
				candidatoIdade = ler.nextInt();
				ler.nextLine();
				System.out.printf("Qual o sexo do Candidato (M/F): ");
				candidatoSexo = (char) System.in.read();
				ler.nextLine();
				System.out.printf("Qual o número do Candidato: ");
				candidatoNumero = ler.nextInt();
				ler.nextLine();
				System.out.printf("Qual o partido do Candidato: ");
				candidatoPartidoNome = ler.next();
				ler.nextLine();

				// Criando o Candidato.
				Candidato c1 = new Candidato(candidatoNome, candidatoIdade, candidatoSexo, candidatoNumero,
						candidatoPartidoNome);
				candidatos.add(c1);

				// Feedback ao usuário.
				System.out.println("\nCandidato Cadastrado com Sucesso!\n");
				System.out.println("\nPressione ENTER para prosseguir.\n");
				ler.nextLine();

			}
			if (seletor == 2) {
				if (!candidatos.isEmpty()) {
					// Input da votação.
					System.out.printf("Informe o nº do seu Candidato: ");
					voto = ler.nextInt();
					ler.nextLine();
					System.out.println("\n");

					votoValido = false;
					// Percorrendo o ArrayList para computar o voto.
					for (Candidato candidato : candidatos) {
						if (voto == candidato.getNumeroPartido()) {
							candidato.receberVoto();
							votoValido = true;
							break;
						}
					}
					if (!votoValido) {
						brancosNulos++;
					}

				} else {
					System.out.println("\nNenhum Candidato Registrado!\n");
				}
			}
			if (seletor == 3) {
				if (candidatos.isEmpty()) {
					System.out.println("\nNenhum Candidato Registrado!\n");
				} else {
					Collections.sort(candidatos);
					for (Candidato candidato : candidatos) {
						System.out.println(candidato + "Numero de Votos do Candidato: " + candidato.getVotosrecebidos());
						System.out.println("----------------x----------------");
					}
					System.out.println("Brancos e Nulos: " + brancosNulos);
				}
			}
			if (seletor == 0) {
				System.out.println("Saindo...");
				break;
			}
			if (seletor != 1 && seletor != 2 && seletor != 3 && seletor != 0) {
				System.out.println("------------------x------------------");
				System.out.println("Seleção Inválida, tente novamente.");
				System.out.println("------------------x------------------");
			}
		}
	}
}
