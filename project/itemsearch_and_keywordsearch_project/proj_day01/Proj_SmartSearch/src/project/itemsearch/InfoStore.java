package project.itemsearch;

import java.io.Serializable;
import java.util.ArrayList;

// Serializable이 필요한 것들 = 검색버튼을 눌렀을 때 한번에 동작을 해야만 하는 것들 이것은 그 중 사이트 데이터를 가져오는 놈이다.

// 다른 객체들이 이 객체만 받으면 사이트 이름, 아이템데이터, 총 목차 개수를 한번에 받을 수 있게 해준다.
// 1단계. 맴버변수 정의하기.
// 2단계. 기본생성자, 매개변수생성자, 게터세터 제작
// 3단계. 다 담았으면 toString()으로 이 객체를 불러올 때 사이트별로 검색결과에 따른  아이템 데이터 리스트 및 리스트 개수가 리턴되게 만들기

public class InfoStore implements Serializable{

	private static final long serialVersionUID = 3823220449143521169L;
	
	
	

	
	// 사이트 이름, 검색결과 서적 리스트 담을 ArrayList<>를 맴버변수로 제작하기.
	private String storeName = ""; // 서점명
	private ArrayList<InfoItem> list; // 검색결과 서적 리스트
	
	
	
	
	
	
	// 생성자
	
	public InfoStore() {}



	public InfoStore(String storeName, ArrayList<InfoItem> list) {
		super();
		this.storeName = storeName;
		this.list = list;
	}


	
	
	// 게터세터

	public String getStoreName() {
		return storeName;
	}



	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}



	public ArrayList<InfoItem> getList() {
		return list;
	}



	public void setList(ArrayList<InfoItem> list) {
		this.list = list;
	}
	
	
	
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		String result = storeName + "[" + list.size() + "개 검색]\n";
		
		for(InfoItem e : list) {
			result += e.toString() + "\n";
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
