package Abstraction;


abstract class Student{
	
	abstract String getName();
	abstract String getSurname();
	
	String getSchool() {
		return "IT";
	}
}

class Student1 extends Student{
	
	String getName() {
		return "Shubhi";
	
	}
	
	String getSurname() {
		return "SIngh";
	}
}
public class AbstractionDemo {
	
	public static void main(String[] args) {
		
//		Student s = new Student1();
//		
//		System.out.println(s.getSchool());
//		System.out.println(s.getName());
		
		Student1 k = new Student1();
		System.out.println(k.getSchool());
		System.out.println(k.getName());
		
	}

}
