import java.util.ArrayList;
import java.util.Random;

public class MontyHall {

	static Random rand = new Random();
	
	public static void main(String[] args) {
		long wins = 0;
		long losses = 0;
		
		//2 to the 63 minus 1 divided by 1 billion
		long runs = Long.MAX_VALUE;
		
		long progressLoopsPerOut = runs/1000;
		
		for(long run = 0; run < runs; run++) {
			if(run % progressLoopsPerOut == 0) {
				System.out.println("Percent: " + (100.0d*((double)run/(double)runs)));
			}
			Doors doors = new Doors();
			doors.removeDoor();
			doors.swapSelection();
			if(doors.isWin()) { wins++; }
			else { losses++; }
		}
		
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
	}

}

class Doors {
	
	ArrayList<Integer> doors = new ArrayList<Integer>();
	Random rand = new Random();
	int correctDoor;
	int selectedDoor;
	
	public Doors() {
		doors.add(0); doors.add(1); doors.add(2);
		correctDoor = rand.nextInt(3);
		selectedDoor = rand.nextInt(3);
	}
	
	public void removeDoor() {
		if(correctDoor == selectedDoor) {
			boolean removeDoor = rand.nextBoolean();
			for (int i = 0; i < 3; i++) {
				if(i != selectedDoor) {
					if(removeDoor) {
						doors.remove(i);
						break;
					} else {
						removeDoor = true;
					}
				}
			}
		} else {
			for(int i = 0; i < 3; i++) {
				if(i != selectedDoor && i != correctDoor) {
					doors.remove(i);
					break;
				}
			}
		}
	}
	
	public void swapSelection() {
		if(selectedDoor == doors.get(0)) {
			selectedDoor = doors.get(1);
		} else {
			selectedDoor = doors.get(0);
		}
	}
	
	public boolean isWin() {
		if(selectedDoor == correctDoor) {
			return true;
		}
		return false;
	}
	
}