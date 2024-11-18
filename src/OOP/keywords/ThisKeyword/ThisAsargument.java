package OOP.keywords.ThisKeyword;

class Bob{
	
	String name;
	String address;
	int noOfemployees;
	
	Bob(Bob b){
		System.out.println(b.name+" "+b.address+" "+b.noOfemployees);
	}
	
	void getBank(Bob b) {
		System.out.println(b.name+" "+b.address+" "+b.noOfemployees);
	}
	
	void details(String name,String address,int noOfemployees) {
		this.name=name;
		this.address=address;
		this.noOfemployees=noOfemployees;
		this.getBank(this);
	}
}

public class ThisAsargument {

}
