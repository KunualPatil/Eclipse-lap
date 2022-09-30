package Quation3;

public class BookDetails {
	
	static void display(Book b ) {
		
    	System.out.println("Author Name  :  " + b.getName());
		System.out.println("Book Price  : " + b.getPrice());
		System.out.println("Book copies  : " + b.getCopies());
		System.out.println(" Auther Details  : " + b.getAtr());

		System.out.println(b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book( "once upon time", 600.30,100,new Author("Rabindranath Tagore",6,"Male"));
		
		System.out.println("Author Details are:");

		display(b1);
	}

}
