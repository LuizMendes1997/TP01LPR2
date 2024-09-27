package TP01.EX2;

import java.util.ArrayList;
import java.util.List;


public class Book {
	private String name;
	private  List<Author> authorlist;
	private double price;
	private int qty =0;
	
	
	public Book(String name, double price, int qty, Author...authors ) {
		this.name = name;
		this.authorlist = new ArrayList<>();
		for (Author author : authors) {
            authorlist.add(author);
            author.setBook(this);
        }
		this.price = price;
		this.qty = qty;
	}
	
	public Book(String name, List<Author> authorlist, double price) {
		this.name = name;
		this.authorlist = authorlist;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public List<Author> getAuthors() {
		return authorlist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		
		return "Book[Name= " + name + ", Author= "+ this.authorlist + ", preço= " + price + ", quantidade= "+ qty + "]";
	}
	public List<String> getAuhtorNames() {
		List<String> lista = new ArrayList<>();
		for (Author author : authorlist) {
            lista.add(author.getName());
            author.setBook(this); // Assuming the Author class has a setBook method
        }
		return lista;
	}
	
	
	
	
	
	
}
