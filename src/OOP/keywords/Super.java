package OOP.keywords;


class BankDetails{
	int bankEmployee = 10;
	
	String getBank() {
		return "Bank";
	}
	
	BankDetails(){
		System.out.println("Bank Constructor");
	}
}

class BobDetails extends BankDetails {
	
	int bankEmployee = 20;
	
	BobDetails(){
//		super as a consntructor, first statement and inside constructor use
		super();
//		System.out.println("Bob Constructor");
	}
	
	void getBobDetails() {
		System.out.println("current: "+bankEmployee);
		System.out.println("Super: "+super.bankEmployee);
		
		System.out.println("current: "+getBank());
		
		System.out.println("Super: "+ super.getBank());
	}
	
	String getBank() {
		return "BOB";
	}
}
public class Super {
	
	public static void main(String[] args) {
		BobDetails bob = new BobDetails();
		bob.getBobDetails();
	}

}
