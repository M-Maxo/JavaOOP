package interfaceTest;

public class TestInterface implements IAnimal{
	
	public void eat() {
		
		System.out.println("Animals can eeeeaaaatttt");
		
	}
	
	public void run() {
		System.out.println("Animals can RunNNNNNN");
		
	}
	
	public void sleep() {
		System.out.println("Animals can SleeepPPPPP");
		
	}

	public static void main(String[] args) {
		
		TestInterface intFace = new TestInterface();
		
		intFace.eat();
		intFace.run();
		intFace.sleep();
		

	}

}
