package project.itemsearch;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

// 궁극적으로 데이터 저장을 하게 될 객체
// 시리얼라이저블 한 객체네에 맴버변수가 단 한가지라도 시리얼라이져블 안되어 있으면 에러뜬다. 조심하자.

// 이 객체에서 정의 할 내용들 = 검색어, 검색일자, 각 스토어 크롤링 결과 받아오기
// 마지막에 toString 오버라이딩 받아서 객체명이 호출 될 때 표현할 데이터들 정리(위에 만든 맴버변수들이 소환되면 되겠지?)

public class SearchResult implements Serializable{

	
	private static final long serialVersionUID = -8000717931230240341L;
	
	// 맴버변수
	private String search; // 검색어
	private Date date; // 검색일시 
	private InfoStore storeNaverShoping;
	private InfoStore storeCoupang;
	private InfoStore storeInterpark;
	private InfoStore store11st;
	private InfoStore storeGmarket;
	
	
	
	
	
	// 생성자
	
	public SearchResult() {}

	public SearchResult(String search, Date date, InfoStore storeNaverShoping, InfoStore storeCoupang,
			InfoStore storeInterpark, InfoStore store11st, InfoStore storeGmarket) {
		super();
		this.search = search;
		this.date = date;
		this.storeNaverShoping = storeNaverShoping;
		this.storeCoupang = storeCoupang;
		this.storeInterpark = storeInterpark;
		this.store11st = store11st;
		this.storeGmarket = storeGmarket;
	}


	
	
	
	
	// 메소드

	public String getSearch() {return search;}

	public void setSearch(String search) {this.search = search;}

	public Date getDate() {return date;}

	public void setDate(Date date) {this.date = date;}

	public InfoStore getStoreNaverShoping() {return storeNaverShoping;}
	public void setStoreNaverShoping(InfoStore storeNaverShoping) {this.storeNaverShoping = storeNaverShoping;}

	public InfoStore getStoreCoupang() {return storeCoupang;}
	public void setStoreCoupang(InfoStore storeCoupang) {this.storeCoupang = storeCoupang;}

	public InfoStore getStoreInterpark() {return storeInterpark;}
	public void setStoreInterpark(InfoStore storeInterpark) {this.storeInterpark = storeInterpark;}

	public InfoStore getStore11st() {return store11st;}
	public void setStore11st(InfoStore store11st) {this.store11st = store11st;}

	public InfoStore getStoreGmarket() {return storeGmarket;}
	public void setStoreGmarket(InfoStore storeGmarket) {this.storeGmarket = storeGmarket;}
	
	
	@Override
	public String toString() {
		return search + "@" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date) + "\n" +
				storeNaverShoping + "\n" +
				storeCoupang + "\n" +
				storeInterpark + "\n" +
				store11st + "\n" +
				storeGmarket
				;
	}
	
}
