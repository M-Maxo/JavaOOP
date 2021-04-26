package tryCatchException;

public class TryCatch {

	public static void main(String[] args) {

		TryCatch ex = new TryCatch();
		ex.testArray();
	}

	public void testArray() {

		try {
			int arr[] = {1 , 2 , 3 , 4};
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you entered is " + e);
		}
		System.out.println("Please enter valid index less than 5..!");
	}

}
