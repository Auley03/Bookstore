package org.techquiero.bookstore.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> miBooksito = null;
	
	public Library(){
		if(miBooksito == null) {
			miBooksito = new ArrayList<Book>();
		
			miBooksito.add(new Book(1, "Microservicios", "Christian Posta", 45.98));
			miBooksito.add(new Book(2, "Patrones de diseño", "Markus Eisele", 72.80));
			miBooksito.add(new Book(3, "Programación Orientada a Objetos", "Richard Warbuton", 36.72));
			miBooksito.add(new Book(5, "Aprendiendo Python", "David Mertz", 43.27));
			miBooksito.add(new Book(6, "Big Data con Hadoop", "Donald Miner", 39.60));
			miBooksito.add(new Book(7, "IOS con Swift", "Tim Nugent", 24.18));
			miBooksito.add(new Book(8, "Programación reactiva", "Konrad Malawski", 58.70));
			miBooksito.add(new Book(9, "Programación con C", "Joel Falcou", 67.93));
			miBooksito.add(new Book(10, "Diseño de sistemas", "Doug Davis", 55.67));
		
		}
		
	}

	public List<Book> getMiBooksito() {
		return miBooksito;
	}

	public void setMiBooksito(List<Book> miBooksito) {
		this.miBooksito = miBooksito;
	}
	
}
