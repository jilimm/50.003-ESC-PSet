public class SUTDVisitor implements Visitor{

	public float visit(Professor prof){
		return prof.getNoOfPublications();
	}
	public float visit(Student student){
		return student.getGPA();
	}
	public float visit(AdminStuff adminStaff){
		return adminStaff.getEfficiency();
	}

	public String visitPosition(Professor prof){
		return prof.getPosition();
	}
	public String visitPosition(Student student){
		return student.getPosition();

	}
	public String visitPosition(AdminStuff adminStaff){
		return adminStaff.getPosition();
	}

	public String visitName(Professor prof){
		return prof.getName();
	}
	public String visitName(Student student){
		return student.getName();

	}
	public String visitName(AdminStuff adminStaff){
		return adminStaff.getName();
	}
}

