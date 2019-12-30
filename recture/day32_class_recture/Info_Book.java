package com.lec.java.crawl03;

public class Info_Book {
//  책이름
	private String bookTitle;
//	책 가격
	private double price;
//	상세페이지 URL
	private String url;
//	썸네일 이미지 URL
	private String imgUrl;
	
	
	// 기본 생성자
	public Info_Book() {}
	
	// 매개변수 생성자


	public Info_Book(String bookTitle, double price, String url, String imgurl) {
		super();
		this.bookTitle = bookTitle;
		this.price = price;
		this.url = url;
		this.imgUrl = imgurl;
	}
	
	
	
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	// getter & setter

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImgurl() {
		return imgUrl;
	}

	public void setImgurl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	
	@Override
		public String toString() {
			return bookTitle + ":" + price + "원, URL : " + url + ", img : " + imgUrl;
		}
	
	
	
	
	
	
	
	
	
}
