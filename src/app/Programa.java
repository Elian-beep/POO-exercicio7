package app;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Post;
import util.Comentario;

/*
 * NOTA: Professor, todos os meus testes com formatação de data hora geraram erros que
 * não pude resolver, eu olhei o código pronto, estudei e entendi o funcionamento, mas
 * não apliquei pois não achei justo entender como funciona e não saber aplicar, por isso
 * meu projeto não possui os detalhes com data.
 * */

public class Programa {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome");
		Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		post1.addComment(c1);
		post1.addComment(c2);

		Comentario c3 = new Comentario("Good night");
		Comentario c4 = new Comentario("May the Force be with you");
		Post post2 = new Post("Good noght guys", "See you tomoroow", 5);
		post2.addComment(c3);
		post2.addComment(c4);

		System.out.println(post1);
		System.out.println(post2);
	}
}
