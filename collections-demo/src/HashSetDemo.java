import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		for(int i=1;i<=10;i++) {
			Book book = new Book();
			book.setAuthor("Author" + i);
			book.setPrice(i + 1);
			book.setTitle("title" + i);
			set.add(book);
		}
		
		set.forEach(item -> System.out.println(item.getPrice() + " " + item.getTitle()));
	}
}
