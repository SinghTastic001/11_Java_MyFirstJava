package OOPCLASSDEMO;

class OutClassDemo{
	
	int a = 10;
	String name = "Shubhi";
	
	void getData() {
		
		System.out.println("this is feel easy now..");
		System.out.println(a);
		System.out.println(name);
	}
}

public class OPPSecondDemo {
	
	void getData1() {
		
		System.out.println("This is a method of public class.....understand this is a mehtod of public class");
	}
	
	public static void main(String[] args) {
		
		OutClassDemo u1 = new OutClassDemo();
		OPPSecondDemo c1 = new OPPSecondDemo();
		
		u1.getData();
		c1.getData1();
		
		
	}

}
