package secondPackage;
import firstPackage.FirstClass;
import firstPackage.SecondClass;
public class ThirdClass {

	public static void main(String[] args) {

		FirstClass obj = new FirstClass();
		obj.maxo();
		
		SecondClass.main(args);
		
	}

}
