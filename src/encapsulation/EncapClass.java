package encapsulation;

public class EncapClass {
	
	private String name;
	private String id;
	private int age;
	
	public void setName(String newName) {
		name =newName;
	}
	public void setId(String newId) {
		id = newId;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
}
