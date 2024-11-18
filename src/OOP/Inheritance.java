package OOP;

class Bank{
	
	int noOfEmployees;
	String Address;
	String Branch;
	
	void logBankDetails(int a) {
		System.out.println("Bank class parent "+a);
	}
	
	
}

class Icici extends Bank{
	
	void getIcici() {
		
		System.out.println("Icici");
	}
	
	
}
// Single Inheritance


public class Inheritance {
	
	public static void main(String[] args) {
		Icici icibank = new Icici();
		icibank.logBankDetails(2);
		
		Bank bank1 = new Bank();
		bank1.logBankDetails(5);
	}
	

}
