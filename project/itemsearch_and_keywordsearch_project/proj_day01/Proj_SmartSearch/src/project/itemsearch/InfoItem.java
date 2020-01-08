package project.itemsearch;

import java.io.Serializable;

// 책 한권에 대한 정보를 리턴해주는 것(나중에 1권씩 infoStore 속 list에 들어갈 예정)
// 1단계. 맴버변수 지정(상품명, 가격, 상세페이지 url, 썸네일 url)
// 2단계. 기본 생성자, 매개변수 생성자, 게터세터 생성
// 3단계. toString을 오버라이딩 받아서 각 맴버변수들이 이게 무엇인지 설명과 함께 리턴되게 만든다.

// 기존 수업에 사용한 객체와 다르게 여기에 추가해야될 기능 = 상품별 테그와 전환률이 높은 테그들을 추출해야되며 각 테그별 광고료 또한 측정해서 구매전환률과 광고료에 따른 효율적인 테그를 찾게 도와줘야된다.

public class InfoItem implements Serializable{
	
	private static final long serialVersionUID = -7074290633607999258L;
	
	// 맴버변수 지정
	private String itemTitle;
	private double itemPrice;
	private String itemUrl;
	private String itemImgUrl;
	private String itemHashTag;
	private String hashTagPrice;
	private String hashTagPurchaseConversionRate;
	
	
	
	
	// 생성자 지정

	public InfoItem() {}

	
	// 매개변수 생성자 지정
	

	public InfoItem(String itemTitle, double itemPrice, String itemUrl, String itemImgUrl, String itemHashTag,
			String hashTagPrice, String hashTagPurchaseConversionRate) {
		super();
		this.itemTitle = itemTitle;
		this.itemPrice = itemPrice;
		this.itemUrl = itemUrl;
		this.itemImgUrl = itemImgUrl;
		this.itemHashTag = itemHashTag;
		this.hashTagPrice = hashTagPrice;
		this.hashTagPurchaseConversionRate = hashTagPurchaseConversionRate;
	}

	
	// 게터세터생성

	public String getItemTitle() {
		return itemTitle;
	}


	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemUrl() {
		return itemUrl;
	}


	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}


	public String getItemImgUrl() {
		return itemImgUrl;
	}


	public void setItemImgUrl(String itemImgUrl) {
		this.itemImgUrl = itemImgUrl;
	}


	public String getItemHashTag() {
		return itemHashTag;
	}


	public void setItemHashTag(String itemHashTag) {
		this.itemHashTag = itemHashTag;
	}


	public String getHashTagPrice() {
		return hashTagPrice;
	}


	public void setHashTagPrice(String hashTagPrice) {
		this.hashTagPrice = hashTagPrice;
	}


	public String getHashTagPurchaseConversionRate() {
		return hashTagPurchaseConversionRate;
	}


	public void setHashTagPurchaseConversionRate(String hashTagPurchaseConversionRate) {
		this.hashTagPurchaseConversionRate = hashTagPurchaseConversionRate;
	}


	
	
	
	
	
	
	
	
	// toString 오버라이딩
	
	@Override
	public String toString() {
		return itemTitle + ":" + itemPrice + "원, URL : " + itemUrl + ", img : " + itemImgUrl + "해쉬테그 이름들 : " + itemHashTag + ", 해쉬태그 가격 : " + hashTagPrice + "원, 해쉬태그 구매전환률 : " + hashTagPurchaseConversionRate;
	}


	
}
