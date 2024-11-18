package OOP.Encapsulation;

public class Maindemo {
	
	public static void main(String[] args) {
		
		PublicDemo pb = new PublicDemo();
		
		System.out.println(pb.a);
		pb.getDetails();
		
		
		DefaultDemo dm = new DefaultDemo();
		dm.getdetails();
		System.out.println(dm.a);
		
//		DefaultDemo dm = new DefaultDemo();
		
		ProtectedDemo prod = new ProtectedDemo();
		
		prod.prodetails();
	}

}
