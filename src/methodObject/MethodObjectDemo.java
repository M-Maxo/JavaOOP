package methodObject;

     // Class Name
public class MethodObjectDemo {
		 // Variables
		int students ; 
		int weeks ; 
		int days ; 
		
	 // Method
	public static void main(String[] args) {
		   
		// Object
		MethodObjectDemo Eng101 = new MethodObjectDemo(); 
		int totalDays;
		Eng101.students = 10;
		Eng101.weeks = 4;
		Eng101.days = 3;
		totalDays = Eng101.weeks * Eng101.days;
		System.out.println("The English Course 101 is a total of " + totalDays + " Days");
	}

}
