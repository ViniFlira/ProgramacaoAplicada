package br.com.uninassau.polimorfismo.domain;

import java.util.ArrayList;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		CD cd1 = new CD(111, "Amarelo", 25.0);
		cd1.setDesconto_a_vista(10);
		cd1.setCantor("Emicida");
		cd1.setProdutor("Laboratório Fantasma");
		produtos.add(cd1);

		CD cd2 = new CD(222, "Acabou Chorare", 30.0);
		cd2.setDesconto_a_vista(20);
		cd2.setCantor("Novos Bahianos");
		cd2.setProdutor("Sony");
		produtos.add(cd2);

		DVD dvd1 = new DVD(321, "1917", 99.9);
		dvd1.setDesconto_a_vista(25);
		dvd1.setDiretor("Sam Mendes");
		dvd1.setDuracao("1h59m");
		produtos.add(dvd1);

		DVD dvd2 = new DVD(456, "Inception", 50.0);
		dvd2.setDesconto_a_vista(50);
		dvd2.setDiretor("Christopher Nolan");
		dvd2.setDuracao("2h42m");
		produtos.add(dvd2);

		Livro l1 = new Livro(987, "Código Limpo", 80.0);
		l1.setDesconto_a_vista(10);
		l1.setAutor("Robert C. Martin");
		l1.setEditora("Alta Books Editora");
		produtos.add(l1);

		Livro l2 = new Livro(531, "Mindset", 75.0);
		l2.setDesconto_a_vista(30);
		l2.setAutor("Carol S. Dweck");
		l2.setEditora("Objetiva");
		produtos.add(l2);

		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
