package Abstraction;

interface A{
	void getData();
}
interface B{
	void getData();
}

class C implements A,B{

	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Interitance");
	}
	
}

public class MultipleInheritance {
	public static void main(String[] args) {
		A obj = new C();
		obj.getData();
	}
}
