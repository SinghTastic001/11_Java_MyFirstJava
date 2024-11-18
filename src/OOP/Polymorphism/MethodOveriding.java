package OOP.Polymorphism;

class Bank{
	
	void getBank() {
		System.out.println("Bank");
	}
}
class Bob extends Bank{
	
	void getBank() {
		
//		System.out.println("BOB");
		super.getBank();
	}
}

public class MethodOveriding {
	
	public static void main(String[] args) {
		
		Bob b = new Bob();
		b.getBank();
		b.getBank();
		
	}

}
