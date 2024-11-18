package NewFeatures;

public class AutoboxingBoxing {
	
	public static void main(String[] args) {
		
		int a = 10;
		
//		Auto Boxing
		Integer data = new Integer(a);
		System.out.println(data);
		
		
//		Boxing
		int data2 = data;
		
		System.out.println(data2);

	}
}
