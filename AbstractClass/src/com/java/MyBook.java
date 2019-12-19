package com.java;

class MyBook extends Book {
	int price;
	/**
	 *   Class Constructor
	 *
	 *   @param title The book's title.
	 *   @param author The book's author.
	 *   @param price The book's price.
	 **/
	
	MyBook(String title, String author, int price){
		super(title, author);
		this.price = price;
	}
	/**
	 *   Method Name: display
	 *
	 *   Print the title, author, and price in the specified format.
	 **/
	
	void display (){
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
	}
}
