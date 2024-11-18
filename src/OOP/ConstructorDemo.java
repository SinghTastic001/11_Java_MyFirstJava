package OOP;

public class ConstructorDemo {
	
	ConstructorDemo (int a){
		System.out.println("this is a constructo  "+a);
	}
//	this is a paramaterise constructor;
//	constuctor name  should be class name and it don't have type return
	
//  method name has different name with type return;
	
	
	public ConstructorDemo(int a, char b) {
		
		System.out.println("the number is "+a);
		System.out.println("char is "+b);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo d = new ConstructorDemo(2,'a');
	}

}
