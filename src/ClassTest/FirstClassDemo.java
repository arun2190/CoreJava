package ClassTest;

public class FirstClassDemo {

	int x=90;
	int y=100;
	
		
	public static void main(String[] args) {
		
	FirstClassDemo obj1 = new FirstClassDemo();
	
	System.out.println("Program Started");
	obj1.sum();
	System.out.println("value of x is "+obj1.x);
	System.out.println("value of x is "+obj1.y);
	System.out.println("Program Ended");	
	
	FirstClassDemo obj2 = new FirstClassDemo();
	obj2.sum();
	System.out.println("value of x is "+obj2.x);
	System.out.println("value of x is "+obj2.y);
	
	}
 
public void sum(){
	  int a = 90;
	  int b = 100;
	  int c= b+a;
	  System.out.println("Sum of a and b is "+c);
  }
	
	
}
