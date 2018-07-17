package inhertianceDemo;

public class ChildClass3 extends BaseClass {

	public static void main(String[] args) {
		
	// We cannot create base class object with reference to the child class as child cannot contain parent.	

	//	ChildClass2 obj1 = new BaseClass();
	//	obj1.add();
	//	obj1.sub();
		
		System.out.println("Invalid scenario");
	
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
