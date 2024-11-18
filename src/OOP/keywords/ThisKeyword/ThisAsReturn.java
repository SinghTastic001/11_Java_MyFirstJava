package OOP.keywords.ThisKeyword;

class Employee{
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	Employee getEmployee() {
//		this as return statement 
		return this;
	}
}

public class ThisAsReturn {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Shubhi");
		Employee employee = e.getEmployee();
		System.out.println(employee.id+" "+employee.name);
	}
}
