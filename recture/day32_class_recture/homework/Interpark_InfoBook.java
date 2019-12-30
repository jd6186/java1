package com.lec.java.crawl03;

public class Interpark_InfoBook {

	private String bookName;
	private double bookCost;
	private String homepageUrl;
	private String imgUrl;
	
	
	public Interpark_InfoBook() {}
	
	public Interpark_InfoBook(String bookName, double bookCost, String homepageUrl, String imgUrl) {
		super();
		this.bookName = bookName;
		this.bookCost = bookCost;
		this.homepageUrl = homepageUrl;
		this.imgUrl = imgUrl;
	}
	
	
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookCost() {
		return bookCost;
	}
	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	public String getHomepageUrl() {
		return homepageUrl;
	}
	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	
	
	@Override
	public String toString() {
		return "책이름 : " + bookName + "\n 책 가격 : " + bookCost + "\n 홈페이지 URL : " +  homepageUrl + "\n 이미지 URL : " +  imgUrl;
	}
	
	
	
}
