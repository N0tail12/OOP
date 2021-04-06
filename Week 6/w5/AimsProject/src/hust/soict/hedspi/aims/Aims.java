package hust.soict.hedspi.aims;



import java.util.Scanner;



import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void showmenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: 0-1-2-3-4: ");
	}
	public static void main(String[] args) {
		int choise = 0;
		int flag = 0;
		Order[] orderList = new Order[Order.MAX_LIMITTED_ORDERS];
		Scanner keyboard = new Scanner(System.in);
		int id = 0;
		do {
			showmenu();			
			do {
			choise = keyboard.nextInt();
			if(choise >4 || choise < 0) {
				System.out.println("Input is not avaiable. Please enter it again.");
			}
			}while(choise >4 || choise < 0);
			switch (choise) {
			case 1:
				orderList[flag++] = Order.getInstanceOrder();
				System.out.println("Order Created!");
				break;
			case 2:
				if(flag == 0) {
					System.out.println("You haven't create an Order yet. Please Try again");
				}
				else {
					orderList[flag-1].addMedia(keyboard);
					System.out.println("Add Successfully!");
				}
				break;
			case 3:
				if(flag == 0) {
					System.out.println("You haven't create an Order yet. Please Try again");
				}else {
				System.out.println("Enter the Id you want to delete");
				id = keyboard.nextInt();
				orderList[flag-1].removeMedia(id-1);
				}
				break;
			case 4:
				if(flag == 0) {
					System.out.println("You haven't create an Order yet. Please Try again");
				}else 
				orderList[flag-1].printOrder();
				break;
			default:
				break;
			}
			
		} while (choise <=4 && choise > 0);
	}
}
