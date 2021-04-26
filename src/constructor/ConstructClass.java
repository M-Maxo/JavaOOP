package constructor;

public class ConstructClass {
	
	public ConstructClass() {
		System.out.println("Hello from first constructor");
	}
	
	public ConstructClass(String name) {
		System.out.println("Hello " + name + " you are in second constructor");
	}
	
	public ConstructClass(int num) {
		System.out.println("Multiple of " + num + " is: " + num*2 + " third construcor");
	}

}
