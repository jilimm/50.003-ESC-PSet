public class Student implements Employee {
	private float GPA;
	private String name;
	private String position = "Student";

	
	public Student (String name, float GPA) {
		this.name = name;
		this.GPA = GPA;
	}

	public float getGPA() {
		return GPA;
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
