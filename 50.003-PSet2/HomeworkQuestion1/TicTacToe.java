import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

//Uses the Subject interface to update all Observers

public class TicTacToe implements Subject {
	
	// maintains the list of all subscribers to the pricing scheme
	// However, not really aware of what type of subscribers they are (e.g. University/Corporate/Individual)

	private int[][] game;
	private ArrayList<Observer> observers;
	private String outcome;
	
	public TicTacToe(){
		// Creates an ArrayList to hold all observers
		game = new int [3][3];
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer newObserver) {
		
		// Adds a new observer to the ArrayList
		if (!observers.contains(newObserver)){
			observers.add(newObserver);
		}
	}

	public void unregister(Observer deleteObserver) {
		
		// Get the index of the observer to delete
		int observerIndex = observers.indexOf(deleteObserver);
		
		// Print out message (Have to increment index to match)
		
		System.out.println("Player " + (observerIndex+1) + " has left");
		
		// Removes observer from the ArrayList
		observers.remove(observerIndex);
	}

	public void notifyObserver(int outcome, int[][] game, String newOut) {
		// Cycle through all observers and notifies them of
		// price changes
		for (Observer observer: observers){
			observer.update(outcome, game, newOut);
		}
	}

	public void announceOutcome(String results){
		this.outcome = results;
		notifyObserver(1, game, results);
	}

	public void playerMove(Observer o, int row, int column){
		game[row-1][column-1]=o.getID();
		notifyObserver(0, game, outcome);
	}
}