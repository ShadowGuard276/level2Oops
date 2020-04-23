package inheritance;

public class studentRunner {

	public static void main(String[] args) {
		
		Student student =new Student();
		student.setName("grape");
		student.setPhoneNumber("4532566");
		student.setCollegename("NRI");
		student.setYear(12);
		System.out.println(student);
		
		
		Person person = new Person();
		
		String value = person.toString();
		person.setName("fruit");
		person.setPhoneNumber("123*456*7897");
		person.setEmail("fruit@spammail.com");
		
		System.out.println(value);
		System.out.println(person);
		
	}

}
