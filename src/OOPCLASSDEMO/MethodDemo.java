package OOPCLASSDEMO;


class User{
	
	String name;
	String email;
	String phone;
}

public class MethodDemo {
	
	void Method1() {
		
		System.out.println("this is my method 1 of methoddemo class");
	}
	
	void sum(int a, int b) {
		
		System.out.println("Sum is a of b "+(a+b));
	}
	
	int getSum(int a, int b) {
		
		return a+b;
	}
	
	User getResult(){
		
		User user = new User();
		user.name = "Shubhi";
		user.email = "s@gmail.com";
		user.phone = "+987665432";
		
		return user;
	}
	
	void logUser(User u) {
		
		System.out.println("User Details");
		System.out.println(u.name);
		System.out.println(u.email);
		System.out.println(u.phone);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		MethodDemo m1 = new MethodDemo();
		m1.Method1();
		
		m1.sum(10,10);
		
		int res = m1.getSum(11,11);
		
		System.out.println(res);
		
		User user = m1.getResult();
		System.out.println(user.name);
		
		
		User us = new User();
		
		us.name = "Sakshi";
		us.email = "sk@gmail.com";
		us.phone="+24546789";
		
		m1.logUser(us);
		
		
		
	}

}
