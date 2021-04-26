package overridingTest;

public class TestDog {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog b = new Dog();
		
		
		a.move();
		b.move();
		b.eat();
		

	}

}
