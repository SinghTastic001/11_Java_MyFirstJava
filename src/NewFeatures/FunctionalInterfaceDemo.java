package NewFeatures;

public class FunctionalInterfaceDemo implements Demo {
	
	public static void main(String[] args) {
		
		Demo fd = new FunctionalInterfaceDemo();
		System.out.println(fd.sum(2, 2));
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	

}
