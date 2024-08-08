package com.demo.aggregation;

public class TestAggregation {

	public static void main(String[] args) {
		
	
	books b1 = new books("java", "abc123", "james gosling");
	books b2 = new books("python", "xyz12", "sushant patil");
	books b3 = new books("microsoft", "abc11", "sham mule");
	
	books b4[]= {b1,b2,b3};
	
	Library l1 = new Library();
	l1.setName("abc library");
	l1.setAddress("pimpri chincwad");
	l1.setBooks(b4);
	
	System.out.println(l1);
}}
