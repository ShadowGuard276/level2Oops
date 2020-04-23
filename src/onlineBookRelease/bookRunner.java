package onlineBookRelease;

public class bookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Oops","trump");
		
		book.addReview(new Review(10,"great book", 5));
		book.addReview(new Review(101,"awesom", 3));
		System.out.println(book);
		
	}

}
