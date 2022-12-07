package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;
	private int bookprice;
	
	public Book(String bookName, String author, int bookprice) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bookprice = bookprice;
	}

	public Book(){}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author + "," + bookprice);
	}
	
	
	
	
	
	
}


  