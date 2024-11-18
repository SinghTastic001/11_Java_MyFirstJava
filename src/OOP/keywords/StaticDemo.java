package OOP.keywords;

class Demo{
	
	static int a = 20;
	
	static void getDemo() {
		System.out.println("This is a static");
	}
	
	static {
		System.out.println("This is a staic block");
		
	}
}

public class StaticDemo {
	
	public static void main(String[] args) {
		
//		Demo d = new Demo();
//		d.a = 50;
//		
//		Demo d1 = new Demo();
//		System.out.println(d1.a);
		
		
		Demo.a = 30;
		System.out.println(Demo.a);
		Demo.getDemo();
		
	}

}
