public interface Employee{
	public float accept(Visitor visitor);
	public String acceptPosition(Visitor visitor);
	public String acceptName(Visitor visitor);
}