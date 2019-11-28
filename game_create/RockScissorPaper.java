package practice.rockscissorpaper;

import java.util.Random;
import java.util.Scanner;

/*
	 간단한 가위, 바위, 보 게임을 만듭니다.
	(실행화면은 다음 페이지에)
	
	showMenu / inputChoice / displayChoice
	/ computeResult  메소드들을 어떻게 
	구현해볼수 있을까요? 
	
	
	main() 메소드는 오른쪽과 같이 구성하고
	변경하지 않는 상태에서
	나머지 메소드들을 구현하여 완성해보세요
	
	필요하다면 클래스의 멤버변수등을 추가해도
	좋습니다
 */
public class RockScissorPaper {

	// 멤버변수가 필요하면 작성하세요.
	
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임");
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	showMenu();
        	int select = sc.nextInt();
        	if (select < 0 || select > 3) {
        		while(true) {
	        		System.out.println("▼ 하단에 다시 숫자를 입력하세요 ▼");
	        		select = sc.nextInt();
	        		if (select >= 1 && select <= 3) break;
	        	} //end while
        	} // end if
        	inputChoice(select);
        	if (select == 0) break;
        	getHandType(select);
        	System.out.print(" vs ");
        	computeResult(select);
        	
        } // end while
        sc.close();
        
        
        
        
        
    } // end main
    
    
    
    
    //[1]
	// method name: showMenu
	// return: void
	// arguments: none
	// 기능: 유저가 가위/바위/보 선택할 수 있는 메뉴 출력
	public static void showMenu() {
		
		System.out.println("----------------");
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보");
		System.out.println("[0] 종료");
		System.out.println("----------------");
		System.out.print("선택 : ");
		
		
	} // end showMenu()
	
	
	
	
	
	//[2]
	// method name: inputChoice
	// return: int (유저의 가위(0)/바위(1)/보(2) 선택 내용)
	// arguments: Scanner sc (입력장치)
	public static int inputChoice(int select) {
		
		int inputchoice;
		while (true) {
			inputchoice = select;
			if(inputchoice >= 1 && inputchoice <= 3) {
				System.out.println("사용자 vs 컴퓨터");
			} else if (inputchoice == 0){
				 System.out.println("게임이 종료됩니다.");
			} else {
			} // end if
			
			return inputchoice;
			
		} // end while
	} // end inputChoice()

	
	
	


	
	
	
	/**
	 * 사용못해본 메소드 (쥬륵...)
	 * @param user
	 * @param com
	 */
    //[3]
	// method name: displayChoice
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
	//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	public static void displayChoice(int user, int com) {

		// TODO
		
		
	} // end displayChoice()
	
	
	
	
	
	
	
	
	
	
	/**
	 * 사용자가 선택한 번호를 문자열로 출력해주는 메소드
	 * @param choice 번호
	 * @return "가위, 바위 ,보"
	 */
    //[4]
	// method name: getHandType
	// return: String ("가위"/"바위"/"보")
	// arguments: int choice(0, 1, 2)
	public static String getHandType(int choice) {

		
		int twit = choice;
		String type = "type";
		if (twit >= 1 && twit <= 3) {
			if (twit == 1) {
				type = String.format("%s", "가위");
				System.out.print(type);
			}else if (twit == 2) {
				type = String.format("%s", "바위");
				System.out.print(type);
			}else if (twit == 3) {
				type = String.format("%s", "보"); 
				System.out.print(type);
			}else {
				type = String.format("%s", "다시 입력하세요"); 
				System.out.print(type);
			} // end if
				
		} // end if
		
		return type;
		
	} // end getHandType()
	
	
	
	
	
	
	/**
	 * 컴퓨터의 랜덤 선택 및 그 선택에 따른 승패여부를 나타내는 메소드
	 * @param user 유저가 선택한 "가위, 바위, 보"
	 */
    //[5]
	// method name: computeResult
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
	//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	public static void computeResult(int user) {
		
		String a = "가위";
		String b = "바위";
		String c = "보";
		int twit = user;
		int alphago = new Random().nextInt(3) + 1;
		if (twit >= 1 && twit <= 3) {
			if (alphago == 1) System.out.println(a);
			if (alphago == 2) System.out.println(b);
			if (alphago == 3) System.out.println(c);
		} // end if
			
		
		if(twit == 1){
			if(alphago == 1) System.out.println("비겼습니다.");
			if(alphago == 2) System.out.println("COM WIN!");
			if(alphago == 3) System.out.println("USER WIN!");
		} else if(twit == 2){
			if(alphago == 1) System.out.println("USER WIN!");
			if(alphago == 2) System.out.println("비겼습니다.");
			if(alphago == 3) System.out.println("COM WIN!");
		} else if(twit == 3){
			if(alphago == 1) System.out.println("COM WIN!");
			if(alphago == 2) System.out.println("USER WIN!");
			if(alphago == 3) System.out.println("비겼습니다.");
		} // end if
		
	} // end computeResult()

	
	
	
	
	
	
} // end class

