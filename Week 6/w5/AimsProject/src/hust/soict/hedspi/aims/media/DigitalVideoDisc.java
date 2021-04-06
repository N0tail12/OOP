package hust.soict.hedspi.aims.media;

import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.BoldAction;


public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public static DigitalVideoDisc getDisc(Scanner scanner) {
		DigitalVideoDisc newDisc = new DigitalVideoDisc();
		System.out.println("Enter title: ");
		newDisc.setTitle(scanner.next());
		System.out.println("Enter Category: ");
		newDisc.setCategory(scanner.next());
		System.out.println("Enter Price: ");
		newDisc.setCost(scanner.nextFloat());
		System.out.println("Enter Director: ");
		newDisc.setDirector(scanner.nextLine());
		System.out.println("Enter length: ");
		newDisc.setLength(scanner.nextInt());
		return newDisc;
	}
}
