package inhertianceDemo;

public class ChildClass2 extends BaseClass {

	public static void main(String[] args) {
		
		// Create Child class object with reference to the base class. This will allow access only to the base class methods 
		
		BaseClass obj1 = new ChildClass2();
		
		obj1.add();
		obj1.sub();
	//	obj1.mul(); // child class object with reference to base class cannot access the the child class methods
	//	obj1.div(); // child class object with reference to base class cannot access the the child class methods
		

	}

	public void mul() 	{
		System.out.println("Hi I'm in Child Class, Mul is 10000");
						
	}
	
	public void div() 	{
		System.out.println("Hi I'm in Child Class, Mul is 4");
						
	}
}
