package com.hashcoder.corejava.equalsMethod;

public class Book {

	private String name;
	private int isbn;
	
	
	public Book(String name, int isbn) {
		this.name = name;
		this.isbn = isbn;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("Java e-book",909090);
		Book book2 = new Book("Java e-book",909090);
		
		System.out.println("book1 hashocode "+ book1.hashCode());
		System.out.println("Book2 hahcode "+book2.hashCode());
		
		
	
		
		if(book1.equals(book2))
		{
			System.out.println("Books are same");
		}
		else
		{
			System.out.println("Books are not same");
		}
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
