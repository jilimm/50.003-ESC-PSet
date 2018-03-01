public interface Visitor{
	float visit(Professor prof);
	float visit(Student student);
	float visit(AdminStuff adminStaff);
	String visitPosition(Professor prof);
	String visitPosition(Student student);
	String visitPosition(AdminStuff adminStaff);
	String visitName(Professor prof);
	String visitName(Student student);
	String visitName(AdminStuff adminStaff);
}