package org.techquiero.bookstore.model;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private double price;
	
	
	public Book(int id, String name, String author, double price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [" + id + ", Name: " + name + ", Author: " + author + ", Price: $" + price + "]";
	}
	
	
	
	
	
	
	
	
	

}
