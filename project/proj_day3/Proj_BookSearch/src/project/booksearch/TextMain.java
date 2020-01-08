package project.booksearch;

import java.util.Date;


// 이 클래스는 앞에 프로그램들이 정상작동 하는지 확인하는 클래스임

public class TextMain {

	Crawler cr = null;
	SearchResult result = null;
	public static void main(String[] args) {
		TextMain app = new TextMain();
		app.init();
		app.run();
	}
	
	
	
	public void init() {
		cr = Crawler.getInstance();
	}
	
	public void run() {
		String search = "파이썬"; // 테스트용 검색어
		result = new SearchResult();
		result.setSearch(search);
		result.setDate(new Date());
		
		InfoStore store;
		store = cr.crawlStore(search, C.YES24, null);
		result.setStoreYes24(store);
		store = cr.crawlStore(search, C.ALADDIN, null);
		result.setStoreAladdin(store);
		store = cr.crawlStore(search, C.INTERPARK, null);
		result.setStoreInterpark(store);
		
//		System.out.println(result);

		
		
		
		// 크롤링 결과 파일 저장하기
		cr.saveData("data/text.data", result);

		
		result = null;
		// null로 만들어 주는 이유는 crawler에서 load는 result가 null일 경우 데이터를 로드한다고 선언해놨기 때문에 여기서 result값을 null로 바꿔준 것이다.
		
		
		// 정상적으로 저장되는지 확인하려면 result가 널일 때 파일을 다시 읽어와보면 안다. 정상적으로 로드 된다면 저장 또한 정상적으로 되었다는 뜻
		result = cr.loadData("data/text.data");
		
		
		System.out.println(result);
		
	}
	
}
