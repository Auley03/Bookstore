package org.techquiero.bookstore.test;

import java.util.ArrayList;
import java.util.List;
import org.techquiero.bookstore.model.Book;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner entrance = new Scanner(System.in);
		int option = 0;
		
		List<Book> library = new ArrayList<Book>();
		library.add(new Book(1, "Microservicios", "Christian Posta", 45.98));
		library.add(new Book(2, "Patrones de diseño", "Markus Eisele", 72.80));
		library.add(new Book(3, "Programación Orientada a Objetos", "Richard Warbuton", 36.72));
		library.add(new Book(4, "Aprendiendo Java", "Ben Evans", 66.81));
		library.add(new Book(5, "Aprendiendo Python", "David Mertz", 43.27));
		library.add(new Book(6, "Big Data con Hadoop", "Donald Miner", 39.60));
		library.add(new Book(7, "IOS con Swift", "Tim Nugent", 24.18));
		library.add(new Book(8, "Programación reactiva", "Konrad Malawski", 58.70));
		library.add(new Book(9, "Programación con C", "Joel Falcou", 67.93));
		library.add(new Book(10, "Diseño de sistemas", "Doug Davis", 55.67));
		
		do {
			System.out.println("Welcome to TechQuiero Bookstore");
			System.out.println("Please select an option from 1 to 5:\n");
			System.out.println("1) Show books");
			System.out.println("2) Select books");
			System.out.println("3) Remove books");
			System.out.println("4) Confirm buy");
			System.out.println("5) Exit");
			option = entrance.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("Show books");
				for(Book book : library) {
					System.out.println(book.toString());
				}
				break;	
			case 2: 
				System.out.print("How many books would you like to buy?");
				int booksUser = entrance.nextInt();
				for(Book book : library) {
					System.out.println(book.toString());
				}
				for(int i= 0; i<booksUser; i++) {
					System.out.print("\nPlease enter the id of the book you would like to buy: ");
					library.add(library.get(entrance.nextInt()-1));
				}
			
				break;	
			case 3: 
				
				break;	
			case 4: 
				
				break;
			case 5: 
				
				break;	
			}

		}while(option != 5);
		
	}

}
