package Sample;
import java.util.ArrayList;
import java.util.List;
public class CreateBooks {

	
	public static void main(String[] args) {
		ArrayList<Book> bookShelf= new ArrayList<Book>();
		String author = new String ("David");
		String subject = new String ("Physics");
		for(int i=0;i<10;i++) {
			Book book = new Book();
			book.setAuthor(author);
			book.setPrice(i + 14);
			book.setTitle(subject);
			bookShelf.add(book);
		}
		List <Integer> list = new ArrayList<>();
		list.add(6);
		list.add(87);
		list.add(54);
		list.add(43);
		list.add(98);
		list.add(34);
		list.add(609);
		list.sort( (Integer s1,Integer s2) -> -1 * (s1 - s2));
		for(Integer book : list) {
			System.out.println(book);
		}
	}
}
