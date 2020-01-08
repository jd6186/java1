package project.booksearch;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import org.omg.CORBA.DATA_CONVERSION;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	// 검색어 입력, 검색시작 버튼
	private JTextField tfSearch;
	private JButton btnSearch;
	
	// 검색 날짜, 검색어 표시
	private JLabel lblDate;
	
	// 검색목록
	private JScrollPane scrollPane1, scrollPane2, scrollPane3;

	
	// 크롤링 관련 변수
	private Crawler cr = null;
	private SearchResult searchResult = null;
	private boolean isCrawlDone = false;
	
	
	// 이미지 아이콘 사이즈
	private static final int ICON_WIDTH = 80;
	private static final int ICON_HEIGHT = 110;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 메뉴바 
		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		
		// TODO : 크롤링 데이터 저장하기
		
		mnFile.add(mntmSave);
		JMenuItem mnuOpen = new JMenuItem("Open");
		
		// TODO : 크롤링 데이터 불러오기
		
		mnFile.add(mnuOpen);		
		setJMenuBar(menuBar);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(24, 10, 379, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSearchLabel = new JLabel("검색어");
		lblSearchLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchLabel.setFont(new Font("굴림체", Font.BOLD, 16));
		lblSearchLabel.setBounds(12, 10, 74, 41);
		panel.add(lblSearchLabel);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(98, 10, 116, 42);		
		tfSearch.setText("자바");
		tfSearch.setColumns(10);
		panel.add(tfSearch);
		
		// TODO : 검색어 입력후 ENTER 눌러도 크롤링
		tfSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crawlStores(tfSearch.getText().trim()); // trim은 좌우 공백은 제거해주는 기능이다.
				
			}
		});
		
		
		
		btnSearch = new JButton("검색");
		btnSearch.setBounds(226, 16, 74, 31);
		panel.add(btnSearch);
		
		// TODO : [검색] 버튼 누르면 크롤링
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crawlStores(tfSearch.getText().trim()); // trim은 좌우 공백은 제거해주는 기능이다.
				
			}
		});
		
		
		
		
		
		
		
		lblDate = new JLabel("");
		lblDate.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDate.setOpaque(true);
		lblDate.setBackground(Color.LIGHT_GRAY);
		lblDate.setBounds(24, 82, 311, 26);
		contentPane.add(lblDate);
		
		
		JLabel lblStore1 = new JLabel("YES24");
		lblStore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore1.setOpaque(true);
		lblStore1.setBackground(Color.YELLOW);
		lblStore1.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore1.setBounds(23, 119, 107, 31);
		contentPane.add(lblStore1);

		scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(24, 170, 309, 450);
		contentPane.add(scrollPane1);
		
		JLabel lblStore2 = new JLabel("Aladdin");
		lblStore2.setOpaque(true);
		lblStore2.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore2.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore2.setBackground(Color.YELLOW);
		lblStore2.setBounds(347, 119, 107, 31);
		contentPane.add(lblStore2);
		
		scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(350, 170, 309, 450);
		contentPane.add(scrollPane2);
		
		JLabel lblStore3 = new JLabel("Interpark");
		lblStore3.setOpaque(true);
		lblStore3.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore3.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore3.setBackground(Color.YELLOW);
		lblStore3.setBounds(666, 119, 107, 31);
		contentPane.add(lblStore3);
		
		scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(677, 170, 309, 450);
		contentPane.add(scrollPane3);
		
		initialize();
		
	} // end MainWindow()
	
	
	// 초기화 수행하는 메소드
	private void initialize() {
		cr = Crawler.getInstance();
		
		
		
	}
	
	
	// 3개 bookstore 크롤링하는 메소드만들기
	private void crawlStores(String search) {
		
		// 크롤링 시작 일시
		Date now = new Date();
		
		
		
		// 크롤링 시작일시 + 검색어 --> 화면에 표시
		lblDate.setText(search + " : " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(now));
		
		
		// 3개 북스토어 크롤링 시작 : 각각은 개별적인 쓰레드로 진행
		
		isCrawlDone = false; // 밑에 3개 쓰레드가 다 끝나야 끝나게 만든다.
		searchResult = new SearchResult(search, now);
		
		
		
		
		
		
		// Yes24
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				searchResult.setStoreYes24(cr.crawlStore(search, C.YES24, new OnCompleteListener() {
					
					@Override
					public void complete(InfoStore infoStore) {
						// 이건 yes24 크롤링 완료 후 수행코드 
						// 화면이 그려져야 된다.!!
						// TODO
						
					}
				}));
				
				
			}
		});
		th1.start();
		
		
		
		
		
		
		
		
		// Aladin
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				searchResult.setStoreAladdin(cr.crawlStore(search, C.YES24, new OnCompleteListener() {
					
					@Override
					public void complete(InfoStore infoStore) {
						// 화면이 그려져야 된다.!!
						// TODO
						
					}
				}));
				
				
			}
		});
		th2.start();
		
		
		
		
		
		
		// Interpark
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				searchResult.setStoreInterpark(cr.crawlStore(search, C.YES24, new OnCompleteListener() {
					
					@Override
					public void complete(InfoStore infoStore) {
						// 화면이 그려져야 된다.!!
						// TODO
						
					}
				}));
				
				
			}
		});
		th3.start();
		
		
		
		
		
		
		
		// 위 3개 북스토어 크롤링 진행완료 후 
		
		try {
			th1.join();
			th2.join();
			th3.join();
			
			isCrawlDone = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	// InfoStore를 통해서 JList를 만든다.  >> 책정보는 infobook에 있으니 이걸 담아줘야된당
	private JList<ListEntry> buildList(InfoStore infoStore) {
		JList<ListEntry> list = null;
		
		return list;
	}
	
	// 파일 저장
	private void saveData() {
		
	}
	
	
	// 파일 읽기
	
	private void loadData() {
		
	}
	
	
	
	
} // end class



// JList의 각 아이템에 보여질 데이터 객체들
class ListEntry {
	// 썸네일 이미지 실제로 담기
	private ImageIcon thumbnail;
	
	// 책제목
	private String bookTitle;
	
	// 상세페이지 url
	private String url;
	
	// 책가격
	private double price;
	
	public ListEntry(ImageIcon thumbnail, String bookTitle, String url, double price) {
		super();
		this.thumbnail = thumbnail;
		this.bookTitle = bookTitle;
		this.url = url;
		this.price = price;
	}

	public ImageIcon getThumbnail() {
		return thumbnail;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getUrl() {
		return url;
	}


	public double getPrice() {
		return price;
	}

	
	@Override
	public String toString() {
		return bookTitle + " " + (int)price + "원";
	}
} // end ListEntry




// ListCellRenderer 객체
// 각 List 아이템들을 어떻게 보여줄지 그려주는 것. 그냥 랜더링하는거야 예쁘게 보이게
class ListEntryCellRenderer extends JLabel implements ListCellRenderer<ListEntry>{
	
	// getListCellRendererComponent는 각각의 list 아이템들이 화면에 그려질 때 호출되는 메소드
	// (컴포넌트를 켜는 순간 호출되는거지? 그런 것들이야 엄청 많은 경우가 있어 사이즈가 작아졌다가 커졌다가 할 때도 그런거야)
	@Override
	public Component getListCellRendererComponent(JList<? extends ListEntry> list, // JList객체
			ListEntry value,  // 데이터
			int index, // 리스트에서 몇번째 항목인지?
			boolean isSelected,  // 선택 여부
			boolean cellHasFocus) { // 입력상태 여부
		
		
		// 리스트 아이템의 텍스트와 아이콘 설정
		setText(value.getBookTitle() + " " + value.getPrice() + "원");
		// set~~~~ 들은 현재 JLable의 기능 중 하나다.
		setIcon(value.getThumbnail());
		
		setEnabled(list.isEnabled());
		setFont(list.getFont());
		setOpaque(true);
		
		
		return null;
	}
	
	
}



