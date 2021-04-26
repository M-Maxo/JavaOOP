package controlStructure;

public class IfBranch {

	public static void main(String[] args) {
		int extraCustomer = 2 ; 

		if (extraCustomer >= 3) {
			System.out.println("Customer receives a discount");
		}else if(extraCustomer <=3) 
		{
			System.out.println("No Discount !");
		}
		else 
		{
			System.out.println("Error : Not a valid customer count");
		}

	}

}
