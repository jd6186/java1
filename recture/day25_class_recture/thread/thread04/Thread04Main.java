package com.lec.java.thread04;

/* 쓰레드 우선 순위(priority)가 존재한다. (시분할을 통해서 나눌 수 있다.)
 * PRIORITY 값은 1부터 10까지 줄 수 있다.
 * 기본값은 5이다.
 * 그리고 이 쓰레드는 우선순위가 자바가상머신에게 있는게 아니고 window맘이다 왜? 스레드는 window에서 돌아가고 있기 때문이다.
 */
public class Thread04Main {

	public static void main(String[] args) {
		System.out.println("쓰레드 우선 순위(priority)");
		
		// TODO

		new MyThread("One", Thread.MAX_PRIORITY).start(); // 제일 먼저 끝난다. (왜냐 가장 많은 시간을 할당 받아서 작업을 하기 때문에 같은 작업이면 더 빨리 끝나야 정상)
		new MyThread("Two", Thread.MIN_PRIORITY).start(); // 제일 마지막에 끝난다.
		new MyThread("Three", Thread.NORM_PRIORITY).start(); // 보통속도로 끝난다.
		
		
		
		
		
		
		
	} // end main()

} // end class Thread04Main


// Thread 클래스를 상속받는 클래스 정의
class MyThread extends Thread{

	private String msg;
	public MyThread() {}
	public MyThread(String msg, int priority) {
		this.msg = msg;
		setPriority(priority);
	}
	
	// setPriority(): Thread 클래스가 가지고 있는 메소드
	// 쓰레드의 우선순위(priority)를 변경하는 기능
	// Thread 클래스에 정의된 우선순위:
	//   MAX_PRIORITY(10), MIN_PRIORITY(1), NORM_PRIORITY(5)
	// 대부분의 시스템(OS)에서는 우선순위가 높은 쓰레드에게만 실행 기회를 부여
	
	// main() 메소드의 priotiry는 5 이다
	// priotiry 는 상대적이다  9 > 1 (몇배 더 시간을 받는게 아니라 그냥 누가더 많이 받을 지 우선순위를 정하는거고 숫자가 크면 클 수록 시간을 많이 받는다.)
		

	// TODO
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + " : " + msg + " : " + getPriority());
		}
	}
	// 누가더 먼저 끝날 것인지를 결정하기 때문에 좀더 중요한 작업이 먼저 끝날 수 있게 순번을 정해주면 된다.
	

	
	
	
} // end class MyThread















