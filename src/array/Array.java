package array;

public class Array {

	public static void main(String[] args) {
	    
		String [] aMake = {"BMW","AUDI","SKODA","SUZUKI","HONDA"};
		
		int alength = aMake.length;  //variable to store length of array
		System.out.println("Length of Array is " +alength );
		
		String iBMW = aMake[0]; //First Element of array
		System.out.println("First Element of String is "+iBMW);
		
		String iHonda = aMake[alength-1]; //Last Element of Arrary
		System.out.println("Last Element of Array is "+ iHonda);
		
		for(int i=0 ;i<=alength -1;i++){
		System.out.println("Value Stored at position "+i+" in aMake array is ==> " +aMake[i]);
					
		}
		
		
	}

}
