package OOP;



class A{
	
	void getA() {
		System.out.println("A");
	}
	
}

class B extends A{
	
	void getB() {
		System.out.println("B");
	}
}

class C extends B{
	
	void getC() {
		System.out.println("C");
	}
	
}
public class MultileveDemoIn {
	
	public static void main(String[] args) {
		B ob = new B();
		
		ob.getA();
		ob.getB();
	}

}
