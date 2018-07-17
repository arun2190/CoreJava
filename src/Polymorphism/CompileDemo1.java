package Polymorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
	
CompileDemo1 obj1 = new CompileDemo1();
obj1.add(10, 20);
obj1.add(10, 20, 10);
obj1.add(10.50,20.10);
	
	}

	public void add(int a,int b){
		int c = a+b;
		System.out.println("Sum of Numbers is "+c);
	}
	public void add(int a,int b, int d){
		int c = a+b + d;
		System.out.println("Sum of Numbers is "+c);
	}
	
	public void add(double a,double b){
		double c = a+b;
		System.out.println("Sum of Numbers is "+c);
	}
}
