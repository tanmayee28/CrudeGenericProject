package bookpkg;
import java.util.*;
public interface BookInterface {
	public boolean addBook(Book b);
	public Book getBook(int bid);
	public boolean deleteBook(int bid);
	public boolean updateBook(Book b);
	public List<Book> getAllList();

}
