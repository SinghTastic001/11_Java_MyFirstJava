package OOP.Polymorphism;

class Bank1{
	
	int a;
	int b;
	void getBank() {
		System.out.println("Bank");
	}
	
	void gethello() {
		System.out.println("hello");
	}
}

class Axis1 extends Bank1{
	
	void getBank() {
		System.out.println("Axis");
	}
	
	void getAxis() {
		System.out.println("This is an Axis");
	}
}

public class DynamicBinding {
	
	public static void main(String[] args) {
//		Dynamic binding or upcasting
//		Bank1 b = new Axis();
//		b.getBank();
		
		Axis1 axis = new Axis1();
		axis.gethello();
		axis.getBank();
	}

}
