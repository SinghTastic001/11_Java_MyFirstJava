package OOPCLASSDEMO;

class SecondClass{
	
	int v1 = 20;
	
	void getData() {
		
		System.out.println("Hello My first Class Opp little bit complicated u r.....");
	}
}

public class FirstOppClass {
	
	public static void main(String[] args) {
		
		SecondClass s1 = new SecondClass();
		s1.getData();
		System.out.println(s1.v1);
		
		
	}

}
