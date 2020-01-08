package project.booksearch;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


// 궁극적으로 저장하고자 하는 객체가 이것 
// 시리얼라이저블 한 객체네에 멤버변수 중 하나라도 시리얼라이저블 안되어있으면 저장 안된다. 그래서 반드시 시리얼라이저블 된 것들로 만들어야된다.

public class SearchResult implements Serializable {

	private static final long serialVersionUID = -4588332511583069446L;

	private String search; // 검색어
	private Date date; // 검색일시

	// 3개 북스토어별 크롤링 결과
	private InfoStore storeYes24;
	private InfoStore storeAladdin;
	private InfoStore storeInterpark;

	// 생성자
	public SearchResult() {
		super();
	}

	public SearchResult(String search, Date date) {
		this.search = search;
		this.date = date;
	}

	public SearchResult(String search, Date date, InfoStore storeYes24, InfoStore storeAladdin,
			InfoStore storeInterpark) {
		super();
		this.search = search;
		this.date = date;
		this.storeYes24 = storeYes24;
		this.storeAladdin = storeAladdin;
		this.storeInterpark = storeInterpark;
	}

	// getter & setter
	public String getSearch() {return search;}
	public void setSearch(String search) {this.search = search;}
	public Date getDate() {return date;}
	public void setDate(Date date) {this.date = date;}
	public InfoStore getStoreYes24() {return storeYes24;}
	public void setStoreYes24(InfoStore storeYes24) {this.storeYes24 = storeYes24;}
	public InfoStore getStoreAladdin() {return storeAladdin;}
	public void setStoreAladdin(InfoStore storeAladdin) {this.storeAladdin = storeAladdin;}
	public InfoStore getStoreInterpark() {return storeInterpark;}
	public void setStoreInterpark(InfoStore storeInterpark) {this.storeInterpark = storeInterpark;}

	
	@Override
	public String toString() {
		return  search + " @ " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date) + "\n" + 
				storeYes24 + "\n" + 
				storeInterpark + "\n" + 
				storeAladdin + "\n"
				;
	}
	
	
}