package array;

public class PassingArray {

	public static void main(String[] args) {
		
		String [] aMake = {"BMW","AUDI","SKODA","SUZUKI","HONDA"};
		Print_Array(aMake);
		

	}
	
	public static void Print_Array(String [] array) {
		
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println("Printing all the values of an Array ==> " + array[i]);
		}
		
	}

}
