package onlineBookRelease;

import java.util.ArrayList;

public class Book {

	private int bookId;
	private String nameOfBook;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(int bookId, String nameOfBook, String author) {
		this.bookId= bookId;
		this.nameOfBook= nameOfBook;
		this.author=author;
		
	}

	public void addReview(Review review) {
		this.reviews.add(review);
		
	}
	public String toString() {
		return String.format("id -%d, name -%s,aurthor -%s, reviews -[%s]", bookId ,nameOfBook, author,reviews);
		
				}
}
