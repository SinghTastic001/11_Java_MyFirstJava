package OOP.keywords.ThisKeyword;
//student class object use inside use this

//this with variable;
class Student{
	
	private String name="Hardik";
	private String surname;
	private String email;
	private String school = "JDT";
	
	public Student() {
		System.out.println("student");
	}
	public Student(String name,String surname,String email) {
		this();
//		uper is constructor call inside same clas 1.define inside constructor 2.first define
		this.name = name;
		this.surname=surname;
		this.email=email;
	}
	
	String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	this with methods
	
	public void studentDetails() {
		System.out.println(this.getName()+" "+this.getSurname()+" "+this.getSchool()+" "+this.getEmail());
	}
}
public class ThisWithVariable {
	
	public static void main(String[] args) {
		Student s = new Student("Shubhi","Singh","s@gmail.com");
		System.out.println(s.getName());
		s.studentDetails();
		
	}

}
