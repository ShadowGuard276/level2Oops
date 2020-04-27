package inheritance;

public class studentRunner {

	public static void main(String[] args) {
		
	/*	Student student =new Student();
		student.setName("grape");
		student.setPhoneNumber("4532566");
		student.setCollegename("NRI");
		student.setYear(12);
		System.out.println(student);
		*/
		
		Person person = new Person("bem");
		
		String value = person.toString();
		//person.setName("fruit");
		person.setPhoneNumber("123*456*7897");
		person.setEmail("fruit@spammail.com");
		//person.
		//System.out.println(value);
		System.out.println(person);
		Employee employee = new Employee("fruit", "BA");
		//employee.setName("fruit");
		employee.setPhoneNumber("123*456*7897");
		employee.setEmail("fruit@spammail.com");
		employee.setEmployeeGrade('A');
		employee.setEmployerName("Apple");
		//employee.setTitle("bussiness manager");
		System.out.println(employee);
		
		
	}

}
