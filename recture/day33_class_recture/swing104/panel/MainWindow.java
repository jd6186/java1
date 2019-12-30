package swing104.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* JPanel : 컨테이너 역할을 하는 클래스  // 컴포넌트들!!을 담고 있는 객체
 	
 	다른 컨테이들처럼 컴포넌트들을 담을수 있다.
 	JPanel 내의 디폴트 레이아웃은 FlowLayout,  레이아웃 변경 가능
 	
 	프레임에 panel 들을 컴포넌트처럼 배치하고
 	각 panel 안에  또다시 panel 을 배치함으로 
 	복잡한 레이아웃 (중첩 레이아웃) 구성 가능.  >>>> 이 것이 가능하기 때문에 복잡한 작업이 가능
 */



public class MainWindow {
	public static void main(String[] args) {
		new PanelFrame1();
		
		
		
		
		
	} // end main
} // end class

class PanelFrame1 extends JFrame {

	public PanelFrame1() {
		setTitle("panel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel 생성
		// TODO
		JPanel p = new JPanel();
		p.setBounds(40, 80, 200, 200); // 부모 프레임에 대한 상대적 위치 즉, 부모 프레임의 왼쪽 상단부부터 얼마나 떨어질 것인인지를 정한다.
		p.setBackground(Color.gray);
		
		
		// 컴포넌트들 생성
		JButton b1 = new JButton("Button 1");
		// TODO
		b1.setBounds(50, 50, 80, 30);
		b1.setBackground(Color.YELLOW);
		
		
		JButton b2 = new JButton("Button 2");
		// TODO
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.green);
		
		
		JTextField t1 = new JTextField("0", 10); // (최초 문자열, 입력 column 수)
		// TODO
		t1.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬 시키는 것.
		t1.setBounds(50, 10, 80, 30);
		
		
		// 컴포넌트들을 panel 에 추가
		// TODO
		p.setLayout(null);  // 디폴트 값은 FlowLayout이지만 이걸 null로 바꿔준 것       // 보통 숫자는 우측 정렬 시킨다.
		p.add(b1);
		p.add(b2);
		p.add(t1);
		
		// panel 을 프레임에 추가
		// TODO
		add(p);
		
		
		setLayout(null);    
		setSize(400,400);    
		
		// 사이즈 조정 못하게 설정 가능
		// TODO
		setResizable(false);
		// 이렇게 하면 컴포넌트를 마우스로 조절도 안되고 맥시마이즈도 안된다. 걍 한번뜨면 사이즈 조정 불가/
		
		
        setVisible(true);
	} // end 생성자

} // end Frame
