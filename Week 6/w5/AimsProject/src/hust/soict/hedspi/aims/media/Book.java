package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.hedspi.aims.media.Media;

public class Book extends Media	 {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Add Successfull!");
		}
		else {
			System.out.println("The author already exits.");
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Remove Successful!");
		}else {
			System.out.println("The author are not exits");
		}	
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title,category);
	}
	public Book(String title, String category, ArrayList<String> authors){
			super(title, category);
			this.authors = authors;
	}
	public static Book getBook(Scanner scanner) {
		Book newbBook = new Book();
		System.out.println("Enter title: ");
		newbBook.setTitle(scanner.next());
		System.out.println("Enter Category: ");
		newbBook.setCategory(scanner.next());
		System.out.println("Enter Price: ");
		newbBook.setCost(scanner.nextFloat());
		return newbBook;
	}
}
