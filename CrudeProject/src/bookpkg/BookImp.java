package bookpkg;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class BookImp implements BookInterface{

		List<Book>al=new ArrayList<>();
		public boolean addBook(Book b) {
			
			return al.add(b);
		}
		public boolean deleteBook(int bid)
		{
				for(Book b:al){
				 if(bid==b.getBid()){
					al.remove(b);
					return true;
				}}
				return false;
			}
			
	  
		public Book getBook(int bid){
			for(Book e:al)
			{
				if(bid==e.getBid())
				{
					return e;
				}
			}
			return null;
		}
		public List<Book> getAllList()
		{			return al;
		}
		public boolean updateBook(Book b1)
		{
			for(Book b:al)
			{
				if(b1.getBid()==b.getBid())
				{
					b.setBid(b1.getBid());
					b.setBnm(b1.getBnm());
					b.setLibadd(b.getLibadd());
					break;
				}
			}
			return false;
		}
		
		
		
		
		
		
		
}
