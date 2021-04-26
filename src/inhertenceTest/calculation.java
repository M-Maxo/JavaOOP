package inhertenceTest;

public class calculation extends numbers{
	
	public void substraction (int x , int y) {
		total = x/y;
		System.out.println(total);
	}

	public static void main(String[] args) {
		calculation operation = new calculation ();
		operation.multiplication(2, 2);
		operation.sum(5, 3);
		operation.substraction(10, 2);
	}

}
