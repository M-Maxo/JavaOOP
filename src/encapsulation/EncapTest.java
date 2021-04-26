package encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		
		EncapClass encap = new EncapClass();
		
		encap.setName("Mahmoud Adel");
		encap.setId("20140382");
		encap.setAge(25);
		
		System.out.println("The name is: " + encap.getName());
		System.out.println(encap.getName() + " has Id: " + encap.getId());
		System.out.println(encap.getName() + " Age is: " +encap.getAge());

	}

}
