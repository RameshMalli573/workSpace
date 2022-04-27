package Sample;

public class Book {
	private int price;
	private String author;
	private String title;

	
	public int getPrice() {
		return this.price;
	}



	public void setPrice(int price) {
		if(price <= 0) throw new IllegalArgumentException("Price Should Be greater Than Zero");
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
