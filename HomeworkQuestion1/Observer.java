//package Week3;

//The Observers update method is called when the Subject changes
import java.util.Arrays;
import java.util.HashMap;

public interface Observer {
	//to update the observer
	public void update(int code, int[][] newBoard, String outcome);

	//so that the observer can make a move
	public void makeMove(int row, int column);
	public int getID();
}
