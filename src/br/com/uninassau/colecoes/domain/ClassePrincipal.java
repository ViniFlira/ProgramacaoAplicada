package br.com.uninassau.colecoes.domain;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.uninassau.polimorfismo.domain.CD;
import br.com.uninassau.polimorfismo.domain.DVD;
import br.com.uninassau.polimorfismo.domain.Livro;
import br.com.uninassau.polimorfismo.domain.Produto;

public class ClassePrincipal {

	public static void main(String[] args) throws IOException {

		// Criando as variáveis.
		List<Produto> produtos = new LinkedList<Produto>();

		// Prepação para receber o input do usuário.
		Scanner ler = new Scanner(System.in);
		int seletor, produtoCodigo = 0, produtoDesconto = 0;
		String produtoNome = null, cdCantor, cdProdutor, dvdDiretor, dvdDuracao, livroAutor, livroEditora;
		double produtoPreco = 0;

		// Laço de repetição da ClassePrincipal.
		while (true) {
			try {
				System.out.println("\nBem-vindo ao Gerenciador de Produtos\n");
				System.out.println("Selecione a opção desejada: \n"
									+ " 1 - Adicionar Produto \n"
									+ " 2 - Consultar Produtoss \n"
									+ " 0 - Sair");
				seletor = ler.nextInt();
				ler.nextLine(); // Limpando o buffer do teclado.

				if (seletor == 1) {
					System.out.println("\nQual o tipo de Produto? \n"
										+ " 1 - CD \n"
										+ " 2 - DVD \n"
										+ " 3 - Livro\n"
										+ " 0 - Voltar");
					seletor = ler.nextInt();
					ler.nextLine(); // Limpando o buffer do teclado.

					if (seletor == 1) {
						System.out.println("\nInforme os Dados do CD!\n");
						System.out.println("Nome: ");
						produtoNome = ler.nextLine();
						System.out.println("Código: ");
						produtoCodigo = ler.nextInt();
						System.out.println("Preço: ");
						produtoPreco = ler.nextDouble();
						ler.nextLine(); // Limpando o buffer do teclado.
						System.out.printf("Cantor: ");
						cdCantor = ler.nextLine();
						System.out.printf("Produtor: ");
						cdProdutor = ler.nextLine();

						// Criando o Objeto CD.
						CD cd1 = new CD(produtoCodigo, produtoNome, produtoPreco);
						cd1.setCantor(cdCantor);
						cd1.setProdutor(cdProdutor);
						cd1.setDesconto_a_vista(produtoDesconto);
						produtos.add(cd1);

						// Feedback ao usuário.
						System.out.println("\nCD Cadastrado com Sucesso!\n");
						System.out.println("\nPressione ENTER para prosseguir.\n");
						ler.nextLine(); // Limpando o buffer do teclado.
					}
				}

				if (seletor == 2) {
					System.out.println("\nInforme os Dados do DVD!\n");
					System.out.println("Nome: ");
					produtoNome = ler.nextLine();
					System.out.println("Código: ");
					produtoCodigo = ler.nextInt();
					System.out.println("Preço: ");
					produtoPreco = ler.nextDouble();
					ler.nextLine(); // Limpando o buffer do teclado.
					System.out.printf("Diretor: ");
					dvdDiretor = ler.nextLine();
					System.out.printf("Duração: ");
					dvdDuracao = ler.nextLine();

					// Criando o Objeto DVD.
					DVD dvd1 = new DVD(produtoCodigo, produtoNome, produtoPreco);
					dvd1.setDiretor(dvdDiretor);
					dvd1.setDuracao(dvdDuracao);
					dvd1.setDesconto_a_vista(produtoDesconto);
					produtos.add(dvd1);

					// Feedback ao usuário.
					System.out.println("\nDVD Cadastrado com Sucesso!\n");
					System.out.println("\nPressione ENTER para prosseguir.\n");
					ler.nextLine(); // Limpando o buffer do teclado.
				}

				if (seletor == 3) {
					System.out.println("\nInforme os Dados do Livro!\n");
					System.out.println("Nome: ");
					produtoNome = ler.nextLine();
					System.out.println("Código: ");
					produtoCodigo = ler.nextInt();
					System.out.println("Preço: ");
					produtoPreco = ler.nextDouble();
					ler.nextLine(); // Limpando o buffer do teclado.
					System.out.printf("Autor: ");
					livroAutor = ler.nextLine();
					System.out.printf("Editora: ");
					livroEditora = ler.nextLine();

					// Criando o Objeto Livro.
					Livro l1 = new Livro(produtoCodigo, produtoNome, produtoPreco);
					l1.setAutor(livroAutor);
					l1.setEditora(livroEditora);
					l1.setDesconto_a_vista(produtoDesconto);
					produtos.add(l1);

					// Feedback ao usuário.
					System.out.println("\nLivro Cadastrado com Sucesso!\n");
					System.out.println("\nPressione ENTER para prosseguir.\n");
					ler.nextLine(); // Limpando o buffer do teclado.
				}
				if (seletor == 0) {
					System.out.println("Voltando...");
					ler.nextLine(); // Limpando o buffer do teclado.
				} else if (seletor != 1 && seletor != 2 && seletor != 3 && seletor != 0) {
					System.out.println("-----------------x----------------");
					System.out.println("Seleção Inválida, Tente Novamente.");
					System.out.println("-----------------x----------------");
				}
				if (seletor == 2) {
					if (produtos.isEmpty()) {
						System.out.println("\nNenhum Produto Registrado!\n");
					}
					for (Produto produto : produtos) {
						System.out.println(produto);
					}

				}
				if (seletor == 0) {
					System.out.println("\nSaindo...\n");
					break;
				} else if (seletor != 1 && seletor != 2 && seletor != 3 && seletor != 0) {
					System.out.println("------------------x------------------");
					System.out.println("Seleção Inválida, Tente Novamente.");
					System.out.println("------------------x------------------");
				}
			} catch (InputMismatchException e) {
				System.out.println("Dados incorretos. Erro:" + e);
				ler.nextLine(); // Limpando o buffer do teclado.
			}
		}

	}

}
