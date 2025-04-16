package other;

public class Book {
	private String isbn;
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	protected void printInfo() {
		System.out.println(isbn);
	}
}




package ex27;
import other.Book;

public class StoryBook extends Book {}




package ex27;
public class Main {
	public static void main(String[] args) {
		StoryBook story = new StoryBook();
		story.setIsbn("xxx-x-xxxxxx-xx-x");
		story.prinyInfo();
	}
}