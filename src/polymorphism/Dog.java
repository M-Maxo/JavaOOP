package polymorphism;

public class Dog extends Animal {
	
	public static void main(String[] args) {
		
		Animal obj = new Dog();
		obj.animal();
	}
	
	@Override
	public void animal() {
		System.out.println("Dog Can Runnn");
	}
	

}
