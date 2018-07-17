package StringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name = "Welcome to Selenium";
		
		boolean status = name.startsWith("Selenium");
		System.out.println("Status Value \n "+status);
		
		String name1 = "Selenium";
		
		boolean status1 = name.contains(name1);
		System.out.println("New Status value is\n "+status1);
		
		
		

	}

}
