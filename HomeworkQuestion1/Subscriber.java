import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Represents each Observer that is monitoring changes in the subject

public class Subscriber implements Observer {
	

	private String gameOutcome;
	private static int observerIDTracker = 0;
	private int observerID;
	private int[][] tttBoard;
	private Subject game;
	
	public Subscriber(Subject game){
		
		// Store the reference to the pricingScheme object so
		// I can make calls to its methods
		this.game = game;
		tttBoard = new int [3][3];
		
		// Assign an observer ID and increment the static counter
		this.observerID = ++observerIDTracker;
		// Message notifies user of new observer
		System.out.println("New Player " + this.observerID);
		
		// Add the observer to the Subjects ArrayList
		game.register(this);
	}

	public void leave(){
		game.unregister(this);
	}
	
	// Called to update all observers
	
	public void update(int code, int[][] newBoard, String outcome) {
		if (code==0){
			this.tttBoard = newBoard;
			printTheUpdates();
		}
		else {
			this.gameOutcome=outcome;
			gameEnd();
		}
		
	}
	
	public void printTheUpdates(){
		System.out.println("Player "+observerID+"'s feed:");
		for (int i=0; i<3; i++){
			String row="|";
			for (int j=0; j<3; j++){
				row+=tttBoard[i][j]+"|";
			}
			System.out.println(row);
			System.out.println("-------");
		}
		System.out.println("\n");
	}

	public void gameEnd(){
		System.out.println("Player "+observerID+"'s feed:");
		if(gameOutcome!=null){
			System.out.println("GAME OVER!!!");
			System.out.println(gameOutcome);
		}
	}

	public int getID(){
		return this.observerID;
	}

	public void makeMove(int row, int column){
		if (row>3 | column>3){
			System.out.println("please enter correct input");
		}else if (tttBoard[row-1][column-1]!=0){
			System.out.println("you cannot make a move here");
		}else{
			game.playerMove(this, row, column);
		}
	}
	
}
