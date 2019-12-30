package swing102.component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*	컴포넌트 (Component)
 	
	프레임에 컴포넌트 붙이기
	프레임으로부터 컨텐트팬(Content Pane) 객체를 얻어와서  컴포넌트를 단다
	
	프레임의 컨텐트팬 (Content Pane) 가져오기 : getContentPane()  --> Container 객체 리턴
	컨텐트팬 에 컴포넌트 달기 :  Container 의 add(컴포넌트)
	프레임의 컨텐트팬 변경 : setContentPane(컨텐트팬)
*/


public class MainWindow {

	public static void main(String[] args) {

		MyFrame frame = new MyFrame();
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
} // end class

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("컴포넌트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료(우측상단에 x버튼) 클릭시 응용프로그램 완전 종료시키기     
		// 만들었으면 이걸 넣어줘야된다.
		
		// 프레임에서 컨텐트팬 가져오기
		Container c = getContentPane();
		c.setBackground(Color.ORANGE); // 배경색 지정 가능
		c.setLayout(new FlowLayout()); // 레이아웃 지정		 // 이 레이아웃의 특징은 배경이 넓으면 넓은데로 좁으면 밑으로 내려서 알아서 위치 조정한다.
		
		// 컴포넌트 추가
		// 버튼 컴포넌트 (JButton)
		JButton button1 = new JButton("OK");
		c.add(button1);
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		
		setSize(500, 500);
		setVisible(true);
	}
}


