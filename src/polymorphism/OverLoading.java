package polymorphism;

public class OverLoading {
	
	public void demo () {
		System.out.println("Demo Overloading for test");
	}
	
	public void demo(String name) {
		System.out.println("The name is: " + name);
	}
	
	public int demo(int num) {
		return num*10;
	}

}
