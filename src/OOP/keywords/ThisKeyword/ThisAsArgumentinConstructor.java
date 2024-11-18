package OOP.keywords.ThisKeyword;

class Bank{
	Bank(Axis axis){
		System.out.println(axis.name+" "+axis.noOfEmployees);
	}
}

class Axis{
	
	int noOfEmployees=100;
	String name ="Axis";
	
	void getAxisDetails() {
		Bank bank = new Bank(this);
	}
}

public class ThisAsArgumentinConstructor {
	
	public static void main(String[] args) {
		Axis axis = new Axis();
		axis.getAxisDetails();
	}

}
