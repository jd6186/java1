package project.itemsearch;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainWindow extends JFrame{
	// 멤버 변수
	
	// 첫번째 패널 안에 들어갈 내용물들(전체 패널, 텍스트필드, 버튼)
	private JPanel contentPane;
	private JTextField tfSearch;
	private JButton btnSearch;
	
	
	// 두번째 패널 안에 들어갈 내용물들(검색어 및 검색날짜)
	private JLabel lblDate;
	
	
	// 세번째 패널 안에 들어갈 내용물들(각 사이트별 스크롤과 해당 내용물들)
	private JScrollPane scrollPane1, scrollPane2, scrollPane3, scrollPane4, scrollPane5;
	
	
	
	// 여기서부턴 패널과 상관 없으
	
	
	// 크롤링 관련 변수들(이 변수들이 있어야 크롤링 할 때 안 귀찮아진다.)
	// 여기로 인스턴스해야되는 두개의 객체 Crawler와 Result를 미리멤버면수로 받아두고 isCrawDone은 지금 크롤링이 종료되었는지 아닌지를 나타내주는 용도로 쓰인다.
	// 크롤링이 종료되면 OnCompleteListener를 활용할 예정이기 때문에 확인 필요
	private Data_Crawler cr = null;
	private SearchResult sr = null;
	private boolean isCrawDone = false;
	
	
	// 스크롤에 뜨는 이미지 아이콘 사이즈 관련 맴버변수를 미리지정해준다. 왜? 어차피 다 동일하게 나와야되니까.
	private static final int ICON_WIDTH = 50;
	private static final int ICON_HEIGHT = 80;
	
	// 생성자
	public MainWindow() {
		
		
		// 기본설정 (x표 누르면 꺼지기, 바운더리 설정, JPanel생성, 패널의 테두리 공백 설정, 컨텐트페인 설정에 위에 만든 패널을 넣어주고, 레이아웃은 널로만들어서 내가 마음대로 조정할 수 있게 설정)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane); // 패널세팅 완료하기
		
		
		// 메뉴바, 메뉴, 메뉴아이템 만들어주기
		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mi = new JMenuItem("Save");
		mnFile.add(mi);
		// TODO 크롤링 데이터 저장해두기
		
		JMenuItem mi1 = new JMenuItem("Open");
		mnFile.add(mi1);
		// TODO 저장했던 데이터 불러오기
		
		setJMenuBar(menuBar); // 메뉴바 세팅 완료하기
		
		
		
		
		
		// 여기서부터 이제 내용물 채워넣기 (세부 패널들, 레이블, 버튼 등등 세세하게 만들어주면 됨)
		// 가져온 데이터를 사이트 별로 분리해야된다. > 패널을 쪼개야됨 전체 제목 및 검색어 입력과 검색 버튼패널, 검색일시 및 검색어 패널, 각 사이트 이름 패널, 데이터가 나오는 패널
		
		
		
//////////////////////////////////////// 여기가 첫번째 패널안에 들어갈 내용물들이다./////////////////////////////////////////////////////////////////
		
		// 패널 세팅하기 (패널 인스턴스, 배경색지정, 바운더리설정, 전체 패널 안에 해당 패널 집어넣기, 스타일 지정해주기)
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(24, 10, 379, 61);
		panel.setLayout(null);
		contentPane.add(panel);
		
		// 레이블 세팅하기(레이블 인스턴스(해당 패널의 제목으로 쓰일거야), 어디에 위치할것인지 지정, 폰트지정, 바운더리설정, 방금 만든 패널안에 소속되게 지정)
		JLabel lblSearchLabel = new JLabel("검색어");
		lblSearchLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchLabel.setFont(new Font("굴림체", Font.BOLD, 16));
		lblSearchLabel.setBounds(12, 10, 74, 41);
		panel.add(lblSearchLabel);
		
		// 텍스트 필드 세팅하기(텍스트필드 인스턴스, 바운더리설정, 열었을 때 적혀있는 글씨설정, 최대 몇글자 입력 가능하게 할지 설정, 패널에 추가시키기, 엔터쳤을 때 어떤 기능을 할지 엑션리스너 설정)
		tfSearch = new JTextField();
		tfSearch.setBounds(98, 10, 116, 42);
		tfSearch.setText("아이폰");
		tfSearch.setColumns(10); // 해당 텍스트 필드에 몇 글자까지 써지게 만들건가
		panel.add(tfSearch);		
		tfSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crawlStores(tfSearch.getText().trim()); // trim은 좌우공백 지우는 것
			}
		});
		
		// 검색 버튼 설정하기(버튼 인스턴스, 바운더리설정, 패널에 추가시키기, 버튼 눌렀을 때 어떤 기능을 할지 엑션리스너 설정)
		btnSearch = new JButton("검색");
		btnSearch.setBounds(226, 16, 74, 31);
		panel.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crawlStores(btnSearch.getText().trim()); // trim은 좌우공백 지우는 것
				}
		});
		
		
		
		
		
		
//////////////////////////////////////// 여기가 두번째 패널안에 들어갈 내용물들이다./////////////////////////////////////////////////////////////////
		
		// Date레이블 설정(레이블 불러오기, 그 바운더리설정 및 보더라인 설정, 불투명도 조정, 백그라운드 색 설정, 전체 패널안에 해당 레이블 넣기)
		lblDate = new JLabel("");
		lblDate.setBorder(new LineBorder(new Color(0, 0, 0), 1, true)); // 라인보더(색깔, 사이즈, 보이는지 안보이는지 설정)
		lblDate.setOpaque(true);
		lblDate.setBackground(Color.CYAN);
		lblDate.setBounds(24, 82, 311, 26);
		contentPane.add(lblDate);
		
		
		
		
		
		
		
		
		
//////////////////////////////////////// 여기가 세번째 패널들안에 들어갈 내용물들이다./////////////////////////////////////////////////////////////////

		
		// 이름이 들어갈 레이블과 그 밑에 들어갈 스크롤패널들을 설정
		// 레이블인스턴스, 레이블 배치, 불투명도, 레이블백그라운드, 레이블 폰트, 레이블 바운더리, 전체 패널안에 추가
		// 스크롤 패널 인스턴스, 스크롤 패널 바운더리설정, 전체 패널에 추가
		JLabel lblStore1 = new JLabel("NaverShoping");
		lblStore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore1.setOpaque(true);
		lblStore1.setBackground(Color.YELLOW);
		lblStore1.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore1.setBounds(23, 119, 107, 31);
		contentPane.add(lblStore1);

		scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(24, 170, 309, 450);
		contentPane.add(scrollPane1);
		
		JLabel lblStore2 = new JLabel("Coupang");
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
		
		JLabel lblStore4 = new JLabel("11st");
		lblStore4.setOpaque(true);
		lblStore4.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore4.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore4.setBackground(Color.YELLOW);
		lblStore4.setBounds(666, 119, 107, 31);
		contentPane.add(lblStore4);
		
		scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(677, 170, 309, 450);
		contentPane.add(scrollPane4);
		
		JLabel lblStore5 = new JLabel("Gmarket");
		lblStore5.setOpaque(true);
		lblStore5.setHorizontalAlignment(SwingConstants.CENTER);
		lblStore5.setFont(new Font("굴림", Font.BOLD, 18));
		lblStore5.setBackground(Color.YELLOW);
		lblStore5.setBounds(347, 119, 107, 31);
		contentPane.add(lblStore5);
		
		scrollPane5 = new JScrollPane();
		scrollPane5.setBounds(350, 170, 309, 450);
		contentPane.add(scrollPane5);
		
		
		
		
		
		
		
//////////////////////////////////////////////////크롤러 인스턴스 시켜서 해당 메인에서 작동하게 만들기///////////////////////////////////////////////
		
		initialize(); // 이건 초기화 수행 메소드임
		

//////////////////////////////////////////////////
		
	}

	
	
	
	
	// 메소드 종류
	/*
	메인
	초기화수행 메소드
	Store 크롤링 메소드 (여기선 총 5개 사이트)	
	Store 정보를 받아서 JList생성 메소드
	파일 저장 메소드
	파일 로드 메소드
	 */	

	public static void main(String[] args) {
	} // end main
	
	
	
	
} // end class



// 만들어야되는 클래스 종류
/*
JList의 각 아이템에 보여질 데이터 객체 (썸네일 이미지, 상품제목, 상세페이지url, 상품가격, 맴버변수를 받는 생성자, 게터세터)
리스트랜더링 객체(아이템들이 화면에 그려질 때 호출되는 메소드 오버라이딩 그리고 매개변수로 (리스트엔트리의 데이터, 리스트에서 몇번째 항목인지, 선택여부, 입력 상태 여부를 매개변수로 받아준다.) 이후 리스트 아이템의 텍스트, 썸네일 아이콘 설정, 사용여부, 폰트, 불투명도를 설정하다.) - 여기서 특이한 개념이 등장한다. 제네릭클래스를 써야하는데 그 안에 ?가 들어간다 이 의미가 무엇인지 알아야된당
*/




