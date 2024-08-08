package com.demo.aggregation;

public class books {

	private String name;
	private String ISBN;
	private String auther;
	
	public books() {
		super();
	}

	public books(String name, String iSBN, String auther) {
		super();
		this.name = name;
		ISBN = iSBN;
		this.auther = auther;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "books [name=" + name + ", ISBN=" + ISBN + ", auther=" + auther + "]";
	}
	
	
}
