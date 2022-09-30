package Quation3;


public class Book {

	private String name;
	private double price;
	private int copies;
	private Author atr;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, double price, int copies, Author atr) {
		super();
		this.name = name;
		this.price = price;
		this.copies = copies;
		this.atr = atr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public Author getAtr() {
		return atr;
	}

	public void setAtr(Author atr) {
		this.atr = atr;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", copies=" + copies + ", atr=" + atr + "]";
	}

}
