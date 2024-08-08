package com.demo.aggregation;

import java.util.Arrays;

public class Library {

	private String name;
	private String address;
	private  books[] books; // here the example of aggregation
	
	public Library() {
		super();
	}

	public Library(String name, String address, com.demo.aggregation.books[] books) {
		super();
		this.name = name;
		this.address = address;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public books[] getBooks() {
		return books;
	}

	public void setBooks(books[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", books=" + Arrays.toString(books) + "]";
	}
	
	
}
