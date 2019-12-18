package com.lec.java.thread01;

/*	쓰레드 Thread
 *  동일 프로세스 내에 '독립'적인 다중 수행하는 프로그램 단위
 *  병행성 증진. 처리율 향상, 응답속도 향상 목적
 * 
 *  자바에서 쓰레드를 만들어서 사용하는 방법1:
 *   1. Thread 클래스를 상속받는 클래스를 정의
 *   2. 정의한 클래스에서 run() 메소드를 override - 쓰레드에서 할 일을 구현
 *   3. Thread 클래스의 인스턴스를 생성
 *   4. 생성된 인스턴스에서 start() 메소드를 호출
 */

public class Thread01Main {

	public static void main(String[] args) {
		System.out.println("쓰레드 생성 1");
		
		// 3. Thread 클래스의 인스턴스를 생성
		// TODO
		
		
		
		Thread th1 = new MyThread("Hello Java!"); // 다형성!!
		
		th1.run(); // 이건 동시에 수행된게 아니야 그래서 thread가 실해오딘게 아니라고 보면 된다. 웃기지? 실행은 됐는데 이게 스레드는 아니라는거야 ㅋㅋ
		
		

		// 4. 생성된 인스턴스에서 start() 메소드를 호출
		// TODO
		// Thread 클래스의 start() 메소드를 호출하면,
		// 내부적으로 run() 메소드가 호출됨
		// start() 메소드가 호출되어야 OS에 의해서 쓰레드로 동작을 하게 됨
		
		th1.start(); // 이게 새로운 thread를  실행시키는 거거든? 동시에 진행되었다는걸 어떻게 아냐면  "여기는 언제 출력될까요?"가 언제 뜨는지 보면 알 수 있어.
		
		
		Thread th2 = new MyThread("Hello 동욱!"); // 다형성!!
		th2.start(); // 그래서 여기서 하나를 더 추가하면 뒤죽박죽으로 글자들이 출력된다. 
		// 여기까지 총 3개의 스레드가 있는거다 기본적인 main스레드와 내가만든 2개의 스레드 총 3개다.
		
		// 이제 스레드가 여러개가 되었으니까 메인이 끝나면 프로그램이 끝나는게 아니고 나머지 스레드들이 다 끝나야 프로그램이 종료되었다고 할 수 있다.
		
	
		// run() 메소드를 직접 호출하는 경우는 쓰레드로 동작하는 것이 아니라,
		// 단순히 run() 메소드만 실행이 되는 것임.
		// 이때 발생하는 호출스택 관계도는 '자바의 정석' p626 그림 참조.   p628,629 예제
		
		System.out.println("=======================");
		System.out.println("여기는 언제 출력될까요?");
		System.out.println("=======================");
		
		
		// 하나의 쓰레드는 start() 가 딱 한번만 호출될수 있다.
		// 만약 아래와 같이 다시 start() 하면 IllegalThreadStateException 발생
		// TODO
		
		// 스레드는 단 한번만 start(); 해줄 수 있고 여러번 하게되면 익셉션뜨면서 프로그램 뻗는다.
//		th2.start();
		
		
		// 하지만!!!
		// 아래와 같이 새로 생성해서 사용하면 가능
		// TODO
		th2 = new MyThread("Hello Java2");
		th2.start();
	
	} // end main()

} // end class


// 1. Thread 클래스를 상속받는 클래스를 정의
class MyThread extends Thread {
	
	private String msg;
	private int count;

	public MyThread() {}
	
	public MyThread(String msg) {
		this.msg = msg;
		count = 0;
	}
	
	
	
	// 2. 정의한 클래스에서 run() 메소드를 override
	// 쓰레드에서 할 일을 구현
	// TODO
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + count + " : " + msg);  // thread에 기본적으로 있는 메서드으로서 Tread의 이름이 나오는 메서드다.
			count++; // 이건 출력되고 있는게 지금 몇번째 쓰레든지 알려주기 위해 붙힌다.
		}
	}
	
	
	
	
} // end class MyThread













