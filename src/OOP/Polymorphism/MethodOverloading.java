package OOP.Polymorphism;

class Demo {
	
	Demo(){
		System.out.println("Demo");
	}
	
	Demo(int c){
		System.out.println("Demo");
	}
	
	void getData() {
		System.out.println("Data");
	}
	
	void getData(int a) {
		System.out.println("Data: "+a);
	}
	
	void getData(float b) {
		System.out.println("Data "+b);
	}
	
	void getData(int a, long b) {
		System.out.println("data "+(a+b));
	}
	
	void getData( long b,int a) {
		System.out.println("data "+(a+b));
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.getData();
		d.getData(3);
		d.getData(8.0f);
		d.getData(2L,2);
		d.getData(3,4L);
	}

}
