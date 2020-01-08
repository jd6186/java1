package booksearch;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	// 검색어 입력, 검색시작 버튼
	private JTextField tfSearch;
	private JButton btnSearch;
	
	// 검색 날짜, 검색어 표시
	private JLabel lblDate;
	
	// 검색목록
	private JScrollPane scrollPane1, scrollPane2, scrollPane3;

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
		
		
		btnSearch = new JButton("검색");
		btnSearch.setBounds(226, 16, 74, 31);
		panel.add(btnSearch);
		
		// TODO : [검색] 버튼 누르면 크롤링
		
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
		
	}
}







