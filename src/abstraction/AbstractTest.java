package abstraction;

public class AbstractTest extends AbstractClass {

	public static void main(String[] args) {

		AbstractTest obj = new AbstractTest();
		obj.sound();
		obj.move();

	}

	public void sound() {
		System.out.println("Hello Sound Method");
	}

	public void move() {
		System.out.println("Hello Move Method");

	}

}
