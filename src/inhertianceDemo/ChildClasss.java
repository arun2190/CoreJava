package inhertianceDemo;

public class ChildClasss extends BaseClass {

	public static void main(String[] args) {
		
		// CASE1: Child Class Reference and Child Class Object This will allow access to all the methods of base class and child class
		
		ChildClasss obj1 = new ChildClasss();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	}
	
	public void mul()
	{
		System.out.println("Hi I'm in Child Class, Mul is 10000");
						
	}
	
	public void div()
	{
		System.out.println("Hi I'm in Child Class, Mul is 4");
						
	}


}
