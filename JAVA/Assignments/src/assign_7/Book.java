//Create a Book class with: String isbn, String title, String author, int copies. (5 Marks)
//Store at least 6 books in a HashMap<String, Book> keyed by ISBN. (5 Marks)
//Allow the user to search for a book by ISBN and display its details. (5 Marks)
//Allow the user to borrow a book:
//Decrease the copies count if available.
//If no copies are available, add the user to a waiting list (Queue). (5 Marks)
//Display all books in sorted order by title using a TreeSet. (5 Marks)
//Display the list of users waiting for each book (if any). (5 Marks)

package assign_7;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int copies;
	
	public Book() {}
	
	public Book(String isbn, String title, String author, int copies) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", copies=" + copies + "]";
	}
	
	
	
}
