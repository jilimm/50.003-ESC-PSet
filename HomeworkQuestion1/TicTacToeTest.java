public class TicTacToeTest {
	public static void main(String[] args){
		TicTacToe testGame = new TicTacToe();

		Subscriber player1 = new Subscriber(testGame); 
		Subscriber player2 = new Subscriber(testGame); 
		
		player1.makeMove(1,2);
		player2.makeMove(3,3);
		player1.makeMove(1,3);
		player2.makeMove(2,2);
		player1.makeMove(2,1);
		player2.makeMove(1,1);

		testGame.announceOutcome("player2 wins!");

		player1.leave();
	}
}