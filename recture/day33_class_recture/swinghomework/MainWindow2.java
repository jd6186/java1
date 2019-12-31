package swing201.event;

// event는 사용자가 무언가를 할 때 무엇을 하게 한다. 
// 즉, 사용자의 행동을 규정해주고 그것에 맞는 event를 만들어주는 것이다.
// 그래서 어떤 사건들이 순차적으로 일어나는 것이 아니라. 사용자가 눌렀을 때만 작동하게 된다.
// 그래서 코드를 만들어서 바로 실행되게 하는 것이 아니라 자바에 코드를 만들어서 등록만 해놓는 것이다.
// 그럼 사용자가 어떤 행동을 했을 때 등록된 코드가 실행되게 된다. 원하지 않으면? 실행되지 않는다.

// 특정한 이벤트에 반응하는 코드를 리스너라고 부른다. 그래서 html에 onclickListener라는 것이 있지? 이게 이제 왜 그런 행동을 했는지 알겠지?
// 그럼 이런 이벤트는 어떤 스레드에서 동작할까? 이건 이벤트분배 스레드라고 따로 존재한다. // 그럼 이 스레드는 언제 끝나지??? 자동으로 종료되나??   // 내부적으로 알아서 동작한다.



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow2 {
	
	public static void main(String[] args) {
		
		new MyFrame();
		
	} // end main
} // end class

class MyFrame extends JFrame{
	
	public MyFrame() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 방법1 : 별도의 리스너 작성
		JButton btn1 = new JButton("Action1");
		// TODO
		btn1.addActionListener(new MyListener1()); // ActionListener달기
		
		
		
		// 방법2 inner class
		JButton btn2 = new JButton("Action2");
		// TODO
		btn2.addActionListener(new MyListener2());
		
		
		
		
		// 방법3 : 익명 클래스 사용
		JButton btn3 = new JButton("Action3");
		// TODO
		MyListener3 listener3 = new MyListener3();
		ActionListener al = listener3.MyListener4();
		btn3.addActionListener(al);
		
		
		// 방법4 : 람다식 사용
		JButton btn4 = new JButton("Action4");
		// TODO
		ActionListener al1 = (ActionEvent e) -> {
			System.out.println(e.getActionCommand());
			
			System.out.println("Event type : " + e.getID());
			
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action4")) {
				btn.setText("액션 4");
			} else {
				btn.setText("Action4");
			}
		};
		
		btn4.addActionListener(al1);
		
		
		
		
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		setSize(450, 150);
		setVisible(true);	
	} // end 생성자
	
	// 방법2 inner class
	// TODO
	public class MyListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			
			System.out.println("Event type : " + e.getID());
			
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action2")) {
				btn.setText("액션 2");
			} else {
				btn.setText("Action2");
			}
			
		}
		
	}

	
	
} // end MyFrame


//방법 1 별도의 Listener 클래스 만들어서 사용.
// TODO
class MyListener1 implements ActionListener{
	
	// 이 이벤트가 발생했을 때 이벤트 스레드에서 동작하고 있는 이벤트큐가 실행해준다.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
		System.out.println("Event type : " + e.getID());
//		e.getSource(); // 이 이벤트가 어디서 발생된 것입니까? > 이상태에서는 오브젝트를 리턴한다. 따라서 다른 형식으로 바꿔줘야함.
		JButton btn = (JButton)e.getSource();
		
		if(btn.getText().equals("Action1")) { //클릭할 때 버튼안에 적혀있는 텍스트가 바뀐다. 컴포넌트마다 다르지만 엑션커맨드의 문자가 출력되는 문자와 동일하다.
			btn.setText("액션1");
		} else {
			btn.setText("Action1");
		}
		
	} // end Method
	
} // end class


class MyListener3 {
	public MyListener3() {}
	
	public ActionListener MyListener4() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				
				System.out.println("Event type : " + e.getID());
				JButton btn = (JButton)e.getSource();
				
				if(btn.getText().equals("Action3")) { //클릭할 때 버튼안에 적혀있는 텍스트가 바뀐다. 컴포넌트마다 다르지만 엑션커맨드의 문자가 출력되는 문자와 동일하다.
					btn.setText("액션3");
				} else {
					btn.setText("Action3");
				}
			}
		};
		
	}
}	 // end MyListener3



