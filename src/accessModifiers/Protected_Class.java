package accessModifiers;

public class Protected_Class {

	protected int a,b;
	
	public static void main(String[] args) {
		
		Protected_Class obj1 = new Protected_Class();
		obj1.a = 10;
		obj1.b = 20;
		
		obj1.sum(5,10);
		
	}
	
	protected void sum(int x, int y){
		
		int c = x + y;
		System.out.println("The sum of two no is " +c);
					
		
	}
	


}
