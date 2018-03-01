public class Electorate implements Voter{
	private Character vote;
	private String name;
	private int voterID;
	// Static used as a counter
	
	private static int voterIDTracker = 0;
	
	public Electorate (String name, Character vote) {
		this.name = name;
		this.voterID = ++voterIDTracker;
		this.vote = vote;
	}

	public Character getVote() {
		return this.vote;
	}

	public String getName() {
		return name;
	}

	public int getVoterID(){
		return this.voterID;
	}

	public Character accept(Visitor visitor){
		return visitor.visit(this);
	}


	public int acceptVoterID(Visitor visitor){
		return visitor.visitVoterID(this);
	}
}