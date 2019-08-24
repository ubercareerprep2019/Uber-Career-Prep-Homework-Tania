package for_assignment_1;

import java.util.*;

public class Disk {
	public int rod1[];
	public int rod2[];
	public int rod3[];
	
	public int leftRod;
	public int middleRod;
	public int lastRod; 
	
	public int amountOfDisks;

	Disk(int sizeN) {
		amountOfDisks = sizeN; 
		rod1 = new int[sizeN];
		rod2 = new int[sizeN];
		rod3 = new int[sizeN];
		leftRod = 1;
		middleRod = 2;
		lastRod = 3;
	}//Constructor
	
	public void intializesStartOfGame(int amountOfDisks) {
		this.amountOfDisks = amountOfDisks;
		for(int i=0; i==amountOfDisks; i++) {
			rod1[i] = i;
		}//for
		rod2 = null;
		rod3 = null;
	}//intializes rod1 with the start of game
	
	public void moveDisk(int startingRod, int DestinationRod) {
		if()
	}//moveDisk
	
	public void ArrayList<Disk> diskAtRod(int rodIndex) {
		
	}//diskAtRod
	
	public int numberOfRods() {
		return 3;
	}//numbersOfRods

}
