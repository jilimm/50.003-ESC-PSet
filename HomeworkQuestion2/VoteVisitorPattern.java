import java.util.ArrayList;


public class VoteVisitorPattern{
	public static void main(String[] args){
		Election oneElection = new Election ();
		ArrayList<Electorate> electorateList = oneElection.getElectorate();

		Visitor visitor = new VoteVisitor();
		int votesForA=0;
		int votesForB=0;
		for (Electorate electorate : electorateList){
			System.out.println("Voter "+electorate.acceptVoterID(visitor)+" is now voting...");
			if (electorate.accept(visitor).equals('A')){
				votesForA++;
			}
			else{
				votesForB++;
			}
			
		}

		System.out.println("\n");
		System.out.println("Votes for A : "+votesForA);
		System.out.println("Votes for B : "+votesForB);
		if (votesForA>votesForB){
			System.out.println("A wins!");
		}else{
			System.out.println("A wins!");
		}
		
	}
}

class Election {
	private ArrayList<Electorate> electorateList; 
	
	public Election () {
		electorateList = new ArrayList<Electorate>(); 
		electorateList.add(new Electorate("Electorate 1",'A'));
		electorateList.add(new Electorate("Electorate 2", 'B'));
		electorateList.add(new Electorate("Electorate 3", 'A'));
		electorateList.add(new Electorate("Electorate 4", 'B'));
		electorateList.add(new Electorate("Electorate 5", 'A'));	
	}
	
	public ArrayList<Electorate> getElectorate () {
		return electorateList;
	}
}





