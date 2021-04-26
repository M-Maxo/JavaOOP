package polymorphism;

public class OverLoadingDemo extends OverLoading {

	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		
		obj.demo();
		obj.demo("Mahmoud");
		int x = obj.demo(23);
		System.out.println(x);

	}

}
