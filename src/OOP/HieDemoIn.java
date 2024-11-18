package OOP;

class BankDetails{
	
	int noOfemployess;
	
	void getDetails() {
		
		System.out.println("bankdetails");
	}
	
}

class Axis extends BankDetails{
	
	int noOfemployess = 100;
	
	void getAxis() {
			
			System.out.println("Axis");
		}
	
}

class Bob extends BankDetails{
	
	int noOfemployess = 200;
	
	void getBob() {
			
			System.out.println("Bob");
		}
	
	
}

class Sbi extends BankDetails{
	
	int noOfemployess = 300;
	
	void getSbi() {
			
			System.out.println("Sbi");
		}
	
	
}

public class HieDemoIn {
	
	public static void main(String[] args) {
		
		Sbi sbank = new Sbi();
		
		sbank.getSbi();
	}

}
