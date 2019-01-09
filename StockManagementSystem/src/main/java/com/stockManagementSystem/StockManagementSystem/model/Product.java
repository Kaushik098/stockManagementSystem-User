package com.stockManagementSystem.StockManagementSystem.model;

public class Product {

	private  String bookId;
	private  String bookName;
	private  String bookDescription;
	private  int bookPrice;
	private  int bookStock;
	
	
	
	public String getBookId() {
		return bookId;
	}



	public void setBookId(String bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getBookDescription() {
		return bookDescription;
	}



	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public int getBookStock() {
		return bookStock;
	}



	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}



	@Override
	public String toString() {
		return "Product [bookId=" + bookId + ", bookName=" + bookName + ", bookDescription=" + bookDescription
				+ ", bookPrice=" + bookPrice + ", bookStock=" + bookStock + "]";
	}
	
}

