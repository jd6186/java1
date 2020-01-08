package booksearch;

public class Crawler implements Controller{

	private SearchResult result;   // 검색결과
	
	// 싱글톤 디자인
	private static Crawler instance = null;
	private Crawler() {}
	public static Crawler getInstance() {
		if(instance == null) {
			instance = new Crawler();
		}
		return instance;
	}
	
	
	@Override
	public InfoStore crawlStore(String search, String bookStore, OnCompleteListener onCompleteListener) {
		
		InfoStore infoStore = null;
		
		switch(bookStore) {
		case C.YES24:
			// TODO
			break;
		case C.ALADDIN:
			// TODO
			break;
		case C.INTERPARK:
			// TODO
			break;
		}
		
		// 크롤링 완료후 수행해야할 코드
		if(onCompleteListener != null) onCompleteListener.complete(infoStore);
		
		
		return infoStore;
	}

	@Override
	public void saveData(String path, SearchResult result) {
		
		// TODO
		
	}

	@Override
	public SearchResult loadData(String path) {
		
		// TODO
		
		return null;
	}
	
	//-------------------------------------------
	// yes24 크롤링 메소드
	
	// TODO
	
	
	//-------------------------------------------
	// aladdin 크롤링 메소드
	
	// TODO

	//-------------------------------------------
	// interpark 크롤링 메소드

	// TODO
	
	
	

}



