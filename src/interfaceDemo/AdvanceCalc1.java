package interfaceDemo;

public class AdvanceCalc1 implements Calc {

	public static void main(String[] args) {
		
	//	x=20;
		Calc obj1 = new AdvanceCalc1();
	//	Calc obj2 = new Calc; Cannot create object from an interface
		
		obj1.add();
		obj1.sub();
	//	obj1.calculateCos();
	//	obj1.calculateSin();
			
	
	}
	
	public void calculateCos() {
		
		System.out.println("Cos Method");
	}

    public void calculateSin() {
		
		System.out.println("Sin Method");
	}

	@Override
	public void add() {
		System.out.println("Addition Method");
		
		
	}

	@Override
	public void sub() {
		
		System.out.println("Sub Method");
		
	}

}
