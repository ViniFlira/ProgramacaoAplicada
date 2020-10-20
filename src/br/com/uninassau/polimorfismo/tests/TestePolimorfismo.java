package br.com.uninassau.polimorfismo.tests;

import br.com.uninassau.polimorfismo.domain.CD;
import br.com.uninassau.polimorfismo.domain.DVD;
import br.com.uninassau.polimorfismo.domain.Livro;

public class TestePolimorfismo {

	public static void main(String[] args) {

		CD cd1 = new CD(111, "Amarelo", 25.0);
		cd1.setDesconto_a_vista(10);
		cd1.setCantor("Emicida");
		cd1.setProdutor("Laboratório Fantasma");
		System.out.println(cd1.toString());

		CD cd2 = new CD(222, "Acabou Chorare", 30.0);
		cd2.setDesconto_a_vista(20);
		cd2.setCantor("Novos Bahianos");
		cd2.setProdutor("Sony");
		System.out.println(cd2.toString());

		DVD dvd1 = new DVD(321, "1917", 99.9);
		dvd1.setDesconto_a_vista(25);
		dvd1.setDiretor("Sam Mendes");
		dvd1.setDuracao("1h59m");
		System.out.println(dvd1.toString());

		DVD dvd2 = new DVD(456, "Inception", 50.0);
		dvd2.setDesconto_a_vista(50);
		dvd2.setDiretor("Christopher Nolan");
		dvd2.setDuracao("2h42m");
		System.out.println(dvd1.toString());

		Livro l1 = new Livro(987, "Código Limpo", 80.0);
		l1.setDesconto_a_vista(10);
		l1.setAutor("Robert C. Martin");
		l1.setEditora("Alta Books Editora");
		System.out.println(l1.toString());
		
		Livro l2 = new Livro(531, "Mindset", 75.0);
		l2.setDesconto_a_vista(30);
		l2.setAutor("Carol S. Dweck");
		l2.setEditora("Objetiva");
		System.out.println(l2.toString());

	}

}
