package hust.soict.hedspi.aims.order;
import java.util.ArrayList;
import java.util.Scanner;


import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<>();
	private static int nbOrders = 0;
	//private static int luckynumber = 0;
	private MyDate dateOrdered; 
	
	private Order() {
		dateOrdered = new MyDate();
	}
	
	public static Order getInstanceOrder() {
		if(nbOrders < MAX_LIMITTED_ORDERS) {
			++nbOrders;
			Order newOrder = new Order();
			return newOrder;
		} else {
			System.out.println("The numbers of orders is almost max.");
			return null;
		}
			
	}
	public void addMedia(Scanner scanner) {
		
		if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Order is full!!");
		}else {
			int choise = 0;
			do {
			System.out.println("1. Add a Disc.");
			System.out.println("2. Add a Book.");
			System.out.print("Enter Your choise: ");
			choise = scanner.nextInt();
			if(choise <1 || choise > 2) {
				System.out.println("Invalid Input. Try again!");
			}
			}while(choise < 1 || choise >2);
			switch (choise) {
			case 1:
				DigitalVideoDisc newdDisc = DigitalVideoDisc.getDisc(scanner);
				itemsOrdered.add(newdDisc);
				break;
			case 2:
				Book newBook = Book.getBook(scanner);
				itemsOrdered.add(newBook);
				break;
			}
		}
		
	}
	public void removeMedia(int id) {
		if(itemsOrdered.size() ==0 ) {
			System.out.println("Order is Empty");
		}else if (itemsOrdered.size() > id) {
			itemsOrdered.remove(id);
		}else {
			System.out.println("Invalid id");
		}
	}
	public float totalCost() {
		float sum = 0;
		for(Media f: itemsOrdered) {
			sum += f.getCost();
		}
	return sum;
}
	public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.print("Date: ");
        dateOrdered.print();
        System.out.print("\nOrdered Items:\n");
        
        for(int i = 0; i < itemsOrdered.size(); i++) {
            System.out.printf("%d: ",i+1); //Count from 1
            itemsOrdered.get(i).print();
        }
        
        System.out.printf("Total cost: %.2f\n", totalCost());
        System.out.println("***************************************************");
    }
}