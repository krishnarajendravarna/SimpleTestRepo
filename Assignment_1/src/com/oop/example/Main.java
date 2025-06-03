package com.oop.example;

class Book {
	private String title;
	private String author;
	private boolean avail;
	private int bookNo;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvail() {
		return avail;
	}

	public void setAvail(boolean avail) {
		this.avail = avail;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

}

class Member {
	private String name;
	private String id;
	private String barrowedBook;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBarrowedBook() {
		return barrowedBook;
	}

	public void setBarrowedBook(String barrowedBook) {
		this.barrowedBook = barrowedBook;
	}
	
	public void barrow(Book book) {
		if(book.isAvail()) {
			this.barrowedBook = book.getTitle();
			book.setAvail(false);
			System.out.println(getName()+"barrowed "+book.getTitle());
		}else {
			System.out.println("Book is not available");
		}
	}
}

class Library{
	
}
