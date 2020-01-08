package project.itemsearch;

import java.io.IOException;
import java.net.ResponseCache;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.swing.text.Document;

import org.jsoup.Connection.Response;
import org.jsoup.select.Elements;

// 우선 컨트롤러를 인스턴스 받아서 사용할거야 왜? 컨트롤러에 이 어플의 모든 기능이 있으니까
// 애초에 크롤러가 가져와야될 정보를 멤버 변수에 담으면 된다. 
// 그럼 SearchReart의 결과값을 통해 싱글톤 디자인을 만들어서 문제를 해결하면 되
// 싱글톤 디자인 안에서는 이 크롤러 자체를 인스턴스 시키게 만들어야 되고 당연히 이크롤러가 인스턴스 될 때 생성자 안에 각종 기능을 넣어야겠지?
// 그럼 생성자 안에 넣어야될 기능은? 그냥 인스턴스만 시키는 기능만 넣어줘 그 외에는 없어 왠줄 알아 그냥 여기에 만들어 놓은 메소드들 쓰려고 부르는 거야 
// 그럼 이건 뭘 할 수 있는 객체니? 다른 interface객체를 여기에 인스턴스를 우선 받아 받고 거기에 있는 메소드를 오버라이딩 받아서 그 메소드들에 기능을 추가로 넣어주는 역할을 할 수 있어
// 이짓을 왜 하나고? 단계별로 분할하기 위해서지 깔끔하게 유지보수 하기 위해
// 그럼 다른 객체에서 가져올 정보는? 1. 사이트 정보, 2. 데이터 세이브, 3. 데이터 로드 이렇게 받아줘 
// 그리고 자체 메소드를 만들어줘 크롤러면 크롤링을 해야겠지? 


public class Data_Crawler implements Action_Controller{
	
	// 멤버변수
	private SearchResult result;
	
	
	
	
	// 생성자 = 기본적인 instance는 null값이지만 instance가  null일 경우 Data_Crawler()를 인스턴스 시켜주는 메소드를 만듦으로서 null값을 활용하게 만든다.
	private static Data_Crawler instance = null;
	
	
	
	
	
	// 메소드 = 싱글톤으로 인스턴스 시켜주는 메소드, InfoStore 정보가져오는 메소드, SaveData, LoadData, 각 사이트 크롤링 메소드
	
	// 싱글톤 디자인을 넣어주어서 인스턴스가 되게 만들어준다.
	private Data_Crawler getInstance() {
		if(instance == null) {
			instance = new Data_Crawler();
		}
		return instance;
	}





	@Override
	public InfoStore crawlStore(String search, String itemStore, OnCompleteListener onCompleteListener) {
		InfoStore infoStore = null; // null 값이어야 인스턴스가 되기 때문에 이렇게 한다.
		try {
			switch(itemStore) {
			case SiteName.NAVERSHOPING :
				infoStore = new crawlNaverShoping();
				break;
				
			case SiteName.COUPANG :
				infoStore = new crawlCoupang();
				break;
				
			case SiteName.INTERPARK :
				infoStore = new crawlInterpark();
				break;
				
			case SiteName.STORE11ST :
				infoStore = new crawl11st();
				break;
				
			case SiteName.GMARKET :
				infoStore = new crawlGmarket();
				break;
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return infoStore;
	}





	@Override
	public void savaData(String path, SearchResult result) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public SearchResult loadData(String path) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
///////////////////////////////////////////여기부터 각사이트 크롤링////////////////////////////////////////////////////// 
	
	
	private InfoStore crawlNaverShoping(String search) throws IOException {
		InfoStore infoStore = new InfoStore();
		infoStore.setStoreName("NaverShoping");
		ArrayList<InfoItem> list = new ArrayList<InfoItem>();
			
		String url;
		Document doc;
		Response res;
		Elements elements;
		
		url = "https://search.shopping.naver.com/search/all.nhn?query=%EC%95%84%EC%9D%B4%ED%8F%B0&cat_id=&frm=NVSHATC" + URLEncoder.encode(search, "utf-8");
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	
}
