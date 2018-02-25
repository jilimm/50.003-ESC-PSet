import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);

	public void notifyObserver(int outcome, int[][] game, String newOut);
	public void playerMove(Observer o, int row, int column);
	public void announceOutcome(String outcome);
}
