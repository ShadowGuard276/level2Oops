package inheritance;

public class Person {
	private String name;
	private String Email;
	private String phoneNumber;
	public Person(String name) {
		System.out.println("person Constructor");
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return name +"#" + Email +"#"+phoneNumber;
	}
	
}
