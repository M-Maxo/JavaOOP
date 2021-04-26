package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		boolean x = 100 > 99 , y = 99 > 100 ; 

		// Logical operator "&&" AND
		System.out.println("What is the result of 100 > 99 && 99 > 100 ? " + (x && y)); //lazem el etnen True 34an yerg3 true

		// Logical OR || operator
		System.out.println("What is the result of 100 > 99 || 99 > 100 ? " + (x || y)); //ay wa7da true haitl3ly true

		//Logical operator XOR ^ 
		System.out.println("What is the result of 100 > 99 ^ 99 > 100 ? " + (x ^ y)); //ay wa7da true hairg3ly true

		// Logical operator Not !
		System.out.println("What is the result of not 100 > 99 ? " + (!x)); // law true hatrg3 false

		// Logical operator Not !
		System.out.println("What is the result of not 100 > 99 ? " + (!y)); // law false htrg3 true

	}

}
