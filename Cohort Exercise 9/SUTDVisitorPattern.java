import java.util.ArrayList;


public class SUTDVisitorPattern{
	public static void main(String[] args){
		SUTD oneSUTD = new SUTD ();
		ArrayList<Employee> employeeList = oneSUTD.getEmployee();

		Visitor visitor = new SUTDVisitor();
		for (Employee employee : employeeList){
			System.out.println(employee.acceptPosition(visitor)+" "+employee.acceptName(visitor)+"	"+employee.accept(visitor));
		}
	}
}

class SUTD {
	private ArrayList<Employee> employee; 
	
	public SUTD () {
		employee = new ArrayList<Employee>(); 
		employee.add(new Professor("Sun Jun", 0));
		employee.add(new AdminStuff("Stacey", 5));
		employee.add(new Student("Allan", 3));		
	}
	
	public ArrayList<Employee> getEmployee () {
		return employee;
	}
}





