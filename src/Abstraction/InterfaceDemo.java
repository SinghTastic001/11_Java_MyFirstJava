package Abstraction;

interface Bank{
//	int a =10  it is final , static , public keyword 
	void getBank();
}

class Bob implements Bank{

	public void getBank() {
		// TODO Auto-generated method stub
		System.out.println( "Bob");
		
	}	
}

class Axis implements Bank{

	public void getBank() {
		// TODO Auto-generated method stub
		System.out.println("Axis");
		
	}	
}

class Sbi implements Bank{

	public void getBank() {
		// TODO Auto-generated method stub
		System.out.println("Sbi");
		
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		Bank bob = new Bob();
		bob.getBank();
		Bank axis = new Axis();
		axis.getBank();
		Bank sbi = new Sbi();
		sbi.getBank();
	}

}
