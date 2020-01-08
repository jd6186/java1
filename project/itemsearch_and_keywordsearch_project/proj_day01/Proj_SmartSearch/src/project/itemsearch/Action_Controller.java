package project.itemsearch;

// 이 객체가 존재하는 이유
// 1. 스토어들을 크롤링하는 기능을 가지게 하기 위해
// 2. 데이터를 세이브하는 기능을 가지게 하기 위해
// 3. 데이터를 로드하는 기능을 가지게 하기 위해
// 4. 크롤링이 종료되고 난 후의 기능을 가지게 하기 위해
// 대신 각 기능별 정리는 각각의 객체에서 진행한다. 여기서는 이 앱이 어떤 기능을 가지는지만 정의해줌

public interface Action_Controller {
	
	// 맴버변수 = 없음
	
	// 생성자 = 없음 
	
	// 메소드 = 각 데이터를 긁어오는 기능들
	
	// Url 크롤링 --> InfoStore 생성
	public abstract InfoStore crawlStore(String search, String itemStore, OnCompleteListener onCompleteListener);
	
	// SearchResult --> File 저장
	public abstract void savaData(String path, SearchResult result);
	
	// File --> SearchResult 읽어오기
	public abstract SearchResult loadData(String path);
	
}


// 크롤링 완료되면 수행하는 리스너
interface OnCompleteListener {
	public abstract void complete(InfoStore infoStore);
}




