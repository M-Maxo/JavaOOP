package firstPackage;

public class SecondClass {

	public static void main(String[] args) {
		
		FirstClass first = new FirstClass();
		System.out.println(" From Second Class");
		first.maxo(); 
		FirstClass.main(args);

	}

}
