package treeset;

public class Book{
	private int bookId;
	private String bookName;
	private double bookPrice;
	public Book(int bookId, String bookName, double bookPrice) {
//		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	 public String display()
	    {
		 return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	    }
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
//	@Override
//	public int compareTo(Book book) {
//		// this : book 1, book : book 2
//		
//		int diff=this.bookId-book.bookId;  // 10, 14, 15  == 0 
//		return diff;
//	}
//	
//	@Override
//	public boolean equals( Object obj) {
//		System.out.println("Called");
//		Book book=(Book)obj;
//		if(this.bookId==book.bookId) 
//			return true;
//		else
//			return false;
//	}
	
}