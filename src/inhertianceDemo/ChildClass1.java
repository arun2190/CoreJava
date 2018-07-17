package inhertianceDemo;

public class ChildClass1 extends BaseClass {

	public static void main(String[] args) {
		
		
		// CASE1: Base Class Reference and Base Class Object This will allow access only to the methods of base class.
		
		BaseClass obj1 = new BaseClass();
		
		obj1.add();
		obj1.sub();
    //	obj1.mul();  // cannot access the child class method from base class object
	//	obj1.div();  // cannot access the child class method from base class object
		

	}
	
	public void mul() 	{
		System.out.println("Hi I'm in Child Class, Mul is 10000");
						
	}
	
	public void div() 	{
		System.out.println("Hi I'm in Child Class, Mul is 4");
						
	}

}
