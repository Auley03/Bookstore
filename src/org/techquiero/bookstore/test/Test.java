package org.techquiero.bookstore.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.techquiero.bookstore.model.Book;
import org.techquiero.bookstore.model.Library;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner entrance = new Scanner(System.in);
		int option = 0;

		Library library= new Library(); 

		List<Book> shoppingCart = new ArrayList<Book>();
		
		String ruta = "TotalBill.txt";
		File file = new File(ruta);
		
		BufferedWriter bw = null;
		
		try {
		
		if (!file.exists()) {
            file.createNewFile();
        }

		FileWriter fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
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
				for(Book book : library.getMiBooksito()) {
					System.out.println(book.toString());
				}
				break;	
			case 2: 
				System.out.print("How many books would you like to buy?");
				int booksUser = entrance.nextInt();
				for(Book book : library.getMiBooksito()) {
					System.out.println(book.toString());
				}
				for(int i= 0; i<booksUser; i++) {
					System.out.print("\nPlease enter the id of the book you would like to buy: ");
					int idBook = entrance.nextInt();
					System.out.print("\nDo you confirm that you want this book? Yes / No");
					entrance.nextLine();
					String confirmBook = entrance.nextLine();
					if(confirmBook.equalsIgnoreCase("YES")) {
						shoppingCart.add(library.getMiBooksito().get(idBook-1));
					}
					else if(confirmBook.equalsIgnoreCase("NO")) {

					}
					else {
						System.out.println("Please select a valid option");
					}
				}
				for(Book book: shoppingCart)
					try {
						bw.write(book.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				System.out.println("Working Directory = " + System.getProperty("user.dir") + '/' + ruta);
				break;	
			case 3: 
				String finishRem = "";
				for(Book miBook: shoppingCart){
				System.out.println(miBook.toString());
			}
			do {
				System.out.print("\nPlease enter the id's of the books that you want to remove: ");
				int removeBook = entrance.nextInt();
				shoppingCart.remove(removeBook-1);
				if(!shoppingCart.isEmpty()) {
					System.out.print("\nDo you want to remove antoher book: Yes / No");
					entrance.nextLine();
					finishRem = entrance.nextLine();
				}
				else {
					finishRem = "NO";
				}
			}
			while(finishRem.equalsIgnoreCase("YES"));
				break;	
			case 4: 
				for(Book miBook: shoppingCart){
				System.out.println(miBook.toString());

			}
				break;
			case 5: 
				System.out.print("Enjoy your books!");
				break;	

			default:
				System.out.print("The option is not available");
				break;	
			}

		}	
		while(option != 5);

		entrance.close();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
