public class Professor implements Employee {
	private String name;
	private float no_of_publications;
	private String position = "Professor";
	
	public Professor (String name, float no_of_publications) {
		this.name = name;
		this.no_of_publications = no_of_publications;
	}
	
	public float getNoOfPublications() {
		return no_of_publications;
	}

	public String getPosition() {
		return position;
	}

	public float accept(Visitor visitor){
		return visitor.visit(this);
	}

	public String acceptPosition(Visitor visitor){
		return visitor.visitPosition(this);
	}

	public String acceptName(Visitor visitor){
		return visitor.visitName(this);
	}

	public String getName() {
		return name;
	}
}