package ClassTest;

class Car {
	
	//Class Member Variables & Fields
		String sModel;
	    int iGear;
	    int iHighestSpeed;
	    String sColor;
	    int iMake;
	    boolean bLeftHandDrive;
	    String sTransmission;
	    int iTyres;
	    int iDoors;
	    
	    
	    public void DisplayCharacterstics(){
	    	System.out.println("Model of the Car: " +  sModel);
	    	System.out.println("Number of gears in the Car: " +  iGear);
	    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
	    	System.out.println("Color of the Car: " +  sColor);
	    	System.out.println("Make of the Car: " +  iMake);
	    	System.out.println("Transmission of the Car: " +  sTransmission);
	 
	    }
	 	
}

public class ClassTestExercise {

	public static void main(String[] args) {
		//Use the Car keyword to declare Car Class variable
				Car Toyota = new Car();;
		 
				Toyota.bLeftHandDrive = true;
				Toyota.iDoors = 4;
				Toyota.iGear = 5;
				Toyota.iHighestSpeed = 200;
				Toyota.iMake = 2014;
				Toyota.iTyres = 4;
				Toyota.sColor = "Black";
				Toyota.sTransmission = "Manual";
				Toyota.sModel = "Camry";
	
				//Using Car class method
				Toyota.DisplayCharacterstics();
				
	   }
	
	}
