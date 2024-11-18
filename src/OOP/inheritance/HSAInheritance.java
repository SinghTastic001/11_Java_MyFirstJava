package OOP.inheritance;

class BankDetails{
	
	String getBankDetails() {
		
		return "This is Bank";
	}
}

class Bob {
	
	// HAS a relationship;
	
	BankDetails b;
	Bob(){
		b = new BankDetails();
	}
	void BobDetails() {
		System.out.println("This is Bob");
		System.out.println(b.getBankDetails());
	}
}

public class HSAInheritance {
	
	public static void main(String[] args) {
		Bob b = new Bob();
		b.BobDetails();
		
	}

}
