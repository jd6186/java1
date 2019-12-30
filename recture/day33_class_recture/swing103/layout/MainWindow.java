package swing103.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/* 레이아웃 (layout)
 	
 	컨테이너마다 LayoutManager 가 존재.
 	: add 되는 컴포넌트의 '위치'와 '크기' 결정하고 '배치'함.
 	
 	컨테이너의 크기가 변하면 내부 컴포넌트들의 위치와 크기를 모두 재조정, 재배치
 	
 	LayoutManager (I)
	 	└─FlowLayout  :  왼쪽에서 오른쪽으로, 위에서 아래로 배치
	 	└─BorderLayout : 
	 	└─GridLayout
	 	└─CardLayout

 	
 	컨테이너의 디폴트 LayoutManager	 // 기본적으로 아무것도 안 넣어도 되어있다!!!
 	AWT , Swing        │    디폴트 LayoutManager   
 	───────────────────┴───────────────────────────
 	Window, JWindow         BorderLayout
 	Frame, JFrame			BorderLayout 	// 아~ JFrame은 BroderLayout이 디폴트 값이구나
 	Dialog, JDialog			BorderLayout
 	Panel, JPanel			FlowLayout
 	Applet, JApplet			FlowLayout
 	
 	
 	컨테이너의 layout manager 설정 --> setLayout()
 	
 	
 */

public class MainWindow {
	public static void main(String[] args) {
		new FlowLayoutFrame();
		
		new NullContainerFrame();
		
		
		
	} // end main()
} // end class

class FlowLayoutFrame extends JFrame{
	public FlowLayoutFrame() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JTextField("mul", 8)); // 사용자로부터 입력받는 것
		c.add(new JLabel("div")); // 그냥 글씨만 들어감 // 버튼같은 것 없이
		c.add(new JButton("계산"));
		
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // FlowLayout(align, hgap, vgap) 
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} // end constructor
	
} // end class

/*
 * LayoutManager 가 없는 컨테이너] 응용프로그램에서 컴포넌트의 절대 크기와 절대 위치 결정 용도] 컴포넌트의 크기나 위치를 개발자
 * 임의로 결정하고자 하는 경우 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는 경우 여러
 * 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우
 * 
 * 컨테이너의 LayoutManager 제거 컨테이너.setLayout(null);
 * 컴포넌트를 내 맘대로 지정하고 싶을 때~
 * 
 * 컴포넌트 크기 설정 : component.setSize(int width, int height); 컴포넌트 위치 설정 :
 * component.setLocation(int x, int y); 컴포넌트 위치와 크기 동시 설정 :
 * component.setBounds(int x, int y, int width, int height);
 */

class NullContainerFrame extends JFrame{
	public NullContainerFrame() {
		setTitle("NullContainer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 컨테이너의 LayoutManger제거
		
		// lable 컴포넌트 생성
		JLabel lbl = new JLabel("Hello, Press Button");
		lbl.setLocation(130, 50);
		lbl.setSize(200, 20);
		c.add(lbl); // add는 컴포넌트 안에 이 것을 직접생성하는 구문
		
		// 버튼을 한번에 여러개 만드는 방법 = for구문 활용
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setLocation(i*15, i*15);
			btn.setSize(50, 20);
			c.add(btn);
		}
		
		setLocation(150, 150);
		setSize(400, 200);
		setVisible(true);
		
		
	}
}












