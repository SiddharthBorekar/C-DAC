//Create a Book class with: String isbn, String title, String author, int copies. (5 Marks)
//Store at least 6 books in a HashMap<String, Book> keyed by ISBN. (5 Marks)
//Allow the user to search for a book by ISBN and display its details. (5 Marks)
//Allow the user to borrow a book:
//Decrease the copies count if available.
//If no copies are available, add the user to a waiting list (Queue). (5 Marks)
//Display all books in sorted order by title using a TreeSet. (5 Marks)
//Display the list of users waiting for each book (if any). (5 Marks)
package assign_7;

import java.util.HashMap;

public class BookMain {
	public static void main(String[] args) {
		HashMap<String,Book> h = new HashMap<>();
		h.put("101", new Book("101","Naruto","Sagar",2));
		h.put("102", new Book("102","Onepice","sidd",3));
		h.put("103", new Book("103","padmavati","om",1));
		h.put("104", new Book("104","patner","aditya",2));
		h.put("105", new Book("105","ramlila","aman",1));
		h.put("106", new Book("106","Animal","sawyam",3));
		System.out.println(h);
	}
}
