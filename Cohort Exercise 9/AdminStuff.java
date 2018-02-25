public class AdminStuff implements Employee{
	private float efficiency;
	private String position = "AdminStuff";
	private String name;
	
	public AdminStuff (String name, float efficiency) {
		this.name = name;
		this.efficiency = efficiency;
	}

	public float getEfficiency() {
		return efficiency;
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