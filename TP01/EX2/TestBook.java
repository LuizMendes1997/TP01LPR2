package TP01.EX2;

import java.util.List;

public class TestBook {
	public static void main(String[] args) {
	Author[] authors = new Author[2];
	authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
	authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
	
	Book testeBook = new Book("Java for Dummy", 19.99, 99, authors);
	System.out.println(testeBook); 
	
	List<String> authorNames = testeBook.getAuhtorNames();
    System.out.println(authorNames);
}}
