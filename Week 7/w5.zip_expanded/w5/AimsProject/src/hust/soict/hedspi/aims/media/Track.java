package hust.soict.hedspi.aims.media;
import java.util.Scanner;

public class Track {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public Track(String title) {
		this.title = title;
	}
	public Track(int length) {
		this.length = length;
	}
	public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
	public int getLength() {
		return length;
	}
	public Track() {
		// TODO Auto-generated constructor stub
	}
	 public static Track getTrack() {
	        Track newTrack;
	        Scanner keyboard = new Scanner(System.in);
	                
	        String titleTemp, temp;
	        int lenTemp = 0;
	        System.out.println("Enter the track's title: ");
	        titleTemp = keyboard.nextLine();
	        System.out.println("Enter the track's length: ");
	        temp = keyboard.nextLine();
	        try {
	            if(!temp.isEmpty())
	                lenTemp = Integer.parseInt(temp);
	            if(lenTemp < 0) lenTemp = 0; //not accept negative value.
	        } catch (NumberFormatException e) {
	            System.err.println("Error occurs.");
	        }
	        
	        newTrack = new Track(titleTemp, lenTemp); //no need to close scanner now cuz may get error.
	        return newTrack;
	    }
	 public void play() {
	        System.out.println("Playing DVD: " + this.getTitle());
	        System.out.println("DVD length: " + this.getLength());
	    }
	    
	    

}
