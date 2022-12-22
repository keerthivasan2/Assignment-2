import java.io.*;
class LibraryBook 
{
	String publisherName,BookName,AuthorName;
	int isbsc;
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		this.BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		this.AuthorName = authorName;
	}
	public int getIsbsc() {
		return isbsc;
	}
	public void setIsbsc(int isbsc) {
		this.isbsc = isbsc;
	}
}
 class Mcgrawhill extends LibraryBook {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
class MainLibraryBook
{
		public static void main(String[]args) {
		Mcgrawhill b1= new Mcgrawhill() ;
		b1.setPublisherName("Anudip");
		b1.setAuthorName("keerthivasan");
		b1.setBookName("java");
		b1.setIsbsc(78);
		System.out.println("AuthorName:"+b1.getAuthorName());
		System.out.println("BookName:"+b1.getBookName());
		System.out.println("Isbs:"+b1.getIsbsc());
		System.out.println("publisherName:"+b1.getPublisherName());
	}
}
	
	


