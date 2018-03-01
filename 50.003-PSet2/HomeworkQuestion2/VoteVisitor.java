public class VoteVisitor implements Visitor{

	public Character visit(Electorate electorate){
		return electorate.getVote();
	}
	public int visitVoterID(Electorate electorate){
		return electorate.getVoterID();
	}
	
}

