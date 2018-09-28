package lab03.tenClasses;

public class Book 
{
	//Thuộc tính của sách
	private String bookName;
	private String authorName;
	private int publishedYear;
	private int numberOfPages;
	private String publisherName;

	//Hàm khởi tạo sách
	public Book() {}
	
	public Book(String bookName, String authorName, int publishedYear, int numberOfPages, String publisherName) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
		this.numberOfPages = numberOfPages;
		this.publisherName = publisherName;
	}
	
	//Các hàm getter/setter
	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	

	
}
