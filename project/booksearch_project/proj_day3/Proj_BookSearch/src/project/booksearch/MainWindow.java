package project.booksearch;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;


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
		
		// 크롤링 데이터 저장하기
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveData(); // 데이터 저장하기
			}
		});
		mnFile.add(mntmSave);
		
		
		// 크롤링 데이터 불러오기
		JMenuItem mnuOpen = new JMenuItem("Open");
		mnuOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadData(); // 데이터 불러오기
			}
		});
		mnFile.add(mnuOpen);		

		// 메뉴바에 해당 메뉴 추가하기
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
		
		// 검색어 입력후 ENTER 눌러도 크롤링
		tfSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				crawlStores(tfSearch.getText().trim()); // trim은 좌우 공백은 제거해주는 기능이다.
				
			}
		});
		
		
		
		btnSearch = new JButton("검색");
		btnSearch.setBounds(226, 16, 74, 31);
		panel.add(btnSearch);
		
		// [검색] 버튼 누르면 크롤링
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
					
					// yes24 크롤링 완료후 수행코드
					@Override
					public void complete(InfoStore infoStore) {
						
						// TODO : JList 업데이트
						scrollPane1.setViewportView(buildList(infoStore));
						
					}
				}));
				
			}
		});
		th1.start();
		
		
		// Aladin
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				searchResult.setStoreAladdin(cr.crawlStore(search, C.ALADDIN, new OnCompleteListener() {
					
					@Override
					public void complete(InfoStore infoStore) {
						// 화면이 그려져야 된다.!!
						// TODO infoStore --> JList<>를 만들어야한다. 이걸 위해 buildList()를 만들었다.	
						// 위에서 만든 JList<>를 JScrollPane에 넣어야 한다.
						scrollPane2.setViewportView(buildList(infoStore));
						
					}
				}));
				
				
			}
		});
		th2.start();
		
		
		
		
		
		
		
		// Interpark
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				searchResult.setStoreInterpark(cr.crawlStore(search, C.INTERPARK, new OnCompleteListener() {
					
					@Override
					public void complete(InfoStore infoStore) {
						// 화면이 그려져야 된다.!!
						scrollPane3.setViewportView(buildList(infoStore));
						
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
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	// InfoStore를 통해서 JList를 만든다.  >> 책정보는 infobook에 있으니 이걸 담아줘야된당  >>>>> 여기에 완성된 값들은 결국 ScrollPane에 들어가서 그 값을 보여주게 된다.
	private JList<ListEntry> buildList(InfoStore infoStore) {
		// 요 밑에 3개가 존나 중요해
		DefaultListModel<ListEntry> dlm = new DefaultListModel<ListEntry>();
		JList<ListEntry> list = new JList<ListEntry>(dlm); // 리스트가 가지고 있는 데이터는 DefaultListModel에 들어가 있어서 JList안에 저걸 넣어줘야 된다.
		list.setCellRenderer(new ListEntryCellRenderer()); // 화면에 어떻게 그려질지 쓰는 것
		
		
		
		// TODO
		// 크롤링 결과에서 북 리스트 추출
		try {
			for(InfoBook e : infoStore.getList()) {
			
			// 썸네일 로딩
			// TODO
				ImageIcon icon;
				icon = resizeImage(new ImageIcon(ImageIO.read(new URL(e.getImgUrl())))); // 
				
				
				ListEntry listEntry = new ListEntry(icon, e.getBookTitle(), e.getUrl(), e.getPrice());
				dlm.addElement(listEntry); // 리스트 모델에 추가~
				
			}
			
			// 더블 클릭시 브라우저 오픈(리스트 위에서 마우스가 클릭되면 브라우저가 오픈 되야 되므로 여기서 지정해준다.)
			list.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// 더블 클릭이면
					JList<ListEntry> l = (JList<ListEntry>)e.getSource();
					if(e.getClickCount() == 2){
						// 리스트상의 몇번째 인덱스 인지
						int index = l.locationToIndex(e.getPoint());
						// 모델에서 index 번째 데이터 ListEntry 로 불러와서 url 추출
//						list.getModel()은 listmodel이 추출된다. 이게 뭐냐? DefaultListModel<ListEntry> 이거가 저거다.
						String url = list.getModel().getElementAt(index).getUrl();
						
						// 이제 기본브라우저로 해당 북 상세페이지 url 오픈
						// java.awt.Desktop 사용     // 이게 뭐냐면 컴퓨터 내에 기본브라우저를 사용해서 저 url을 열어주겠다는 뜻이야
						// 우선 기본브라우저 존재여부 체크한 뒤 실행 (데스크 탑이 실행되야되고 그 다음에 그안에 기본 브라우져가 있냐 물어보는거야) >>> 이건 GUI 환경에서만 가능한 것이야~
						// 이거까지 해주면 이제 리스트 누르면 책 URL로 바로 이어준다 기본 브라우저로 바로뜬당
						if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
							
							try {  // URI는 url과 비슷한 것이야
								Desktop.getDesktop().browse(new URI(url));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} // end try-catch 
							
						} // end if - Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE
						
					} // end if - e.getClickCount() == 2
				} // end method
			});
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
			
			// ListEntry 작성 후 ListModel에 추가
		
		
		return list;
	}
	
	
	// ImageIcon 크기 변경하기 그래서 받는 것도 이미지 아이콘이고 내보내는 타입도 이미지 아이콘이야 큰걸 가져와서 작은걸로 또는 작은걸 큰걸로 바꿀 때 많이 써
	private ImageIcon resizeImage(ImageIcon imageIcon) {
		Image img = imageIcon.getImage(); // ImageIcon을 Image로 변환!!!
		img = img.getScaledInstance(ICON_WIDTH, ICON_HEIGHT, Image.SCALE_SMOOTH); // 내가 원하는 사이즈로 변경 및 이미지 겹치는 부분은? 여기서는 부드럽게 뭉쳐주세요를 선택한 것임 (색이 겹치는 부분들을 조금 뭉게서 하는거야)
		return new ImageIcon(img); //이미지를 다시 이미지 아이콘으로 바꿔서 리턴!!!
	}
	
	
	
	
	
	
	// 파일 저장
	private void saveData() {
		JFileChooser chooser;
		if(isCrawlDone == true) {
			// 기본 저장이름을 설정하기
			String defaultFileName = new SimpleDateFormat("yyyyMMddHHmmss").format(searchResult.getDate()) + "_" + searchResult.getSearch() + ".crawl";
			// 예를 들면 20200107193324_트럼프.crawl
			
			// 대화 상자 생성
			// current working directory 기준으로 대화상자 생성
			chooser = new JFileChooser(new File(System.getProperty("user.dir")));
			
			// 대화상자 타이틀 (저장 누르면 딱 저 이름의 창이 하나 뜨게 만드는 거야)
			chooser.setDialogTitle("결과 저장하기"); 
			
			// 디폴트 파일명 제시 >> 저장 누르면 이름이 딱 저걸로 떠
			chooser.setSelectedFile(new File(new File(System.getProperty("user.dir")), defaultFileName));
			
			// 파일 필터 객체 생성 >>>> 이게 저장할 때 파일 유형을 만들어주는거야
			FileNameExtensionFilter filter = new FileNameExtensionFilter("크롤링 데이터(*.crawl)", "crawl");
			chooser.setFileFilter(filter);
			
			// 파일 저장 대화상자 보이기
			int ref = chooser.showSaveDialog(null);
			
			if(ref != JFileChooser.APPROVE_OPTION) { // 파일 선택하지 않은 경우
				JOptionPane.showMessageDialog(null, "파일 선택하지 않았음", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filepath = chooser.getSelectedFile().getPath(); // 선택파일 경로
			if(!filepath.endsWith(".crawl")) { // 파일 실항하지 않으면 
				filepath += ".crawl";
			}
			
			cr.saveData(filepath, searchResult);
			
			// 팝업창 띄우기 > JOptionPane 
			JOptionPane.showMessageDialog(null, "저장 완료", "완료", JOptionPane.PLAIN_MESSAGE);
			
			
		} else {
			// 팝업창 띄우기
			JOptionPane.showMessageDialog(null, "아직 크롤링 완료 안됨", "경고", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	// 파일 읽기
	
	private void loadData() {
		JFileChooser chooser; // 파일 대화상자
		chooser = new JFileChooser(new File(System.getProperty("user.dir")));
		chooser.setDialogTitle("불러오기");
		
		
		// 파일 필터 객체 생성 >>>> 이게 저장할 때 파일 유형을 만들어주는거야
		FileNameExtensionFilter filter = new FileNameExtensionFilter("크롤링 데이터(*.crawl)", "crawl");
		chooser.setFileFilter(filter);
					
		// 파일 저장 대화상자 보이기
		int ref = chooser.showOpenDialog(null);
		// 고객이 선택을 했는지 안했는지에 따라 다른 정수값을 리턴하는 객체가 이 바로 위에 객체다.
		
		if(ref != JFileChooser.APPROVE_OPTION) { //파일을 선택하지 않았다면 이렇게 되게 만든다.
			JOptionPane.showMessageDialog(null, "파일 선택하지 않았음", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String filePath = chooser.getSelectedFile().getPath(); // 대화상자에서 선택한 파일 경로가 나옴.
		searchResult = cr.loadData(filePath);
		JOptionPane.showMessageDialog(null, "불러오기 완료", "완료", JOptionPane.PLAIN_MESSAGE);
		
		
		// 읽어들인 데이터로 화면 업데이트 하기
		String search = searchResult.getSearch();
		Date now = searchResult.getDate();
		tfSearch.setText(search);
		lblDate.setText(search + " : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now));
		
		// 각 스토어 별로 끌고 들어오기
		scrollPane1.setViewportView(buildList(searchResult.getStoreYes24()));
		scrollPane2.setViewportView(buildList(searchResult.getStoreAladdin()));
		scrollPane3.setViewportView(buildList(searchResult.getStoreInterpark()));
		
		
		
		// 불러올 때 이미지를 imageUrl로 저장했으면 그걸 불로오는데 시간이 조금 걸린다.
		
		
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
	// <? extends ListEntry> = ListEntry를 상속받는 모든 객체를 사용할 수 있는 제네릭타입을 선언해주는 것!
	@Override
	public Component getListCellRendererComponent(JList<? extends ListEntry> list, // JList객체
			ListEntry value,  // 데이터
			int index, // 리스트에서 몇번째 항목인지?
			boolean isSelected,  // 선택 여부
			boolean cellHasFocus) { // 입력상태 여부
		
		
		
		// 아이템이 선택된 경우와 그렇지 않은 경우 스타일 지정(선택된 것만 하이라이트색 지정한 것! >>>> 렌더러에 있는 기본 기능중 하나다.)
		if(isSelected) {
			// 리스트에 있는 기본적인 배경색과 전경색을 설정한 것
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		
		
		
		// 리스트 아이템의 텍스트와 아이콘 설정
		// 줄바꿈 하려면 <html> 태그를 사용해야 된다.
		setText("<html>" + value.getBookTitle() + "<br>" + (int)value.getPrice() + "원</html>");
		
		// set~~~~ 들은 현재 JLable의 기능 중 하나다.
		setIcon(value.getThumbnail());
		
		setEnabled(list.isEnabled());
		setFont(list.getFont());
		setOpaque(true);
		
		
		return this; // 이거 null로 되어있으면 아무것도 안뜬다.
	}
	
	
}



