package customerDetails;

public class customerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line 1","vijayawada","520001");
		
		Customer customer = new Customer("don", homeAddress);
		System.out.println(customer);
		Address workAddress =new Address("line 2","vijayawada","520010");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
