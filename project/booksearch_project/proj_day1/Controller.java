package booksearch;


//필요한 동작들에 대한 설계 --> 추상메소드

public interface Controller {

	// url 크롤링 --> InfoStore 생성
	public abstract InfoStore crawlStore(String search, String bookStore, OnCompleteListener onCompleteListener);
	
	// SearchResult --> FILE 저장
	public abstract void saveData(String path, SearchResult result);
	
	// FILE --> SearchResult 읽어오기
	public abstract SearchResult loadData(String path);
	
}

//크롤링 완료되면 수행하는 리스너
interface OnCompleteListener {
	public abstract void complete(InfoStore infoStore);
}




