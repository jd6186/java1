package com.lec.java.thread05;

/* join()  
	 지정한 시간 동은 쓰레드가 실행되도록 둔다.
	 지정한 시간이 지나거나, 작업이 종료되면 (쓰레드가 종료되면)  join()을 호출한 쓰레드로 돌아와 실행을 한다
	 특정 쓰레드가 종료한 시점을 기다릴 필요가 있을때  사용
	 
	 즉, 그냥 다른스레드를 기다려준다고 생각하면 되 A, B, C라는 스레드가 있는데 C가 B가 끝나고 시작되어야 하는 상황이면 이 join을 쓴다.
*/

public class Thread05Main {

	public static void main(String[] args) {
		System.out.println("join() 메소드\n");
		// TODO
		
		Thread th1 = new MyThread("ONE");
		Thread th2= new MyThread("TWO");
		
		
		
		th1.start();
		th2.start();
		
		
		try {
			th1.join(); // 현재 쓰레드(여기는 지금 main쓰레드)가 th1쓰레드가 끝날 때 까지 기다려줬다가 실행된다는 뜻이다.
//			th2.join(); 필요하면 여기다가 th2도 이런 식으로 적어주면됭
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 그래서 이게 없을 때는 "여기는 언제 실행될까요?"가 앞에 뜨지만 이걸 만들면 th1 뒤에 뜬다.
		
		
		
		System.out.println("여기는 언제 실행될까요?");

	} // end main()

} // end class


// Thread 클래스를 상속받는 클래스 정의
class MyThread extends Thread{
	public MyThread() {}
	// TODO
	
	public MyThread(String name) {
		setName(name); //쓰레드 이름 지정
	}
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + " : " + i);
		}
		System.out.println("<<" + getName() + ">> 종료"); // 어떤 쓰레드가 종료되었는지 보기 위해 작성
	}
	
	
	
} // end class MyThread




// Dead Lock이 발생하지 않게 주의해야된다.
//한정된 자원을 2개이상의 쓰레드가 가지고 있을 때 서로의 자원을 사용해야되는데 각각이 끝나지 않으면 사용할 수가 없는 상황 그래서 프로그램이 뻗어버리는게 Dead lock이다.










