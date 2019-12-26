package com.lec.java.stream_review;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stream_review {
	public static final String FILEPATH = "temp/donguk";
	public static final String FILE = "donguks.txt";
	
	
	public static void main(String[] args) {
		
//		문제  컴퓨터에 데이터를 인풋시켜주는 매체의 예를 들고 어떤 값으로 들어오게 되는지 설명하라.
//		TODO
//		키보드 마우스 등
//		0101 같은 데이터형태로 들어오며 그 데이터를 받아줄 수 있게 길을 만들어주는 즉 빨대를 꽂아 그곳으로 부터 데이터를 받아오는 것을 Stream이라고 부른다. ㅡ 
//		Sorce > inputStream > program
		
		
		
		
//		문제  컴퓨터에서 데이터를 아웃풋 시키는 매체의 예를 들고 어떤 값으로 나가게 되는지 설명하라.
//		TODO
//		파일, 프린트 등 
//		프로그램 > outputStream > endMethod순으로 이동
		
		
		
		
		
		
//		문제  Java Stream의 흐름은 어떻게 돌아가는가?(input과 output을 나눠서 설명)
//		TODO
//		위에 씀
		
		
		
		
		
		
//		문제  java.io의 주요 클래스들을 설명하라.(크게 4종류)-+
//		TODO
//		byte타입 스트림
//		charactor타입 스트림
//		file을 통해 직접 주고 받기
//		외부 데이터를 직접입력받는 방식
		
		
		
		
		
//		문제  InputStream 객체 in을 가지고 읽어들일 수 있는 스캐너 객체 생성
//		TODO
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
//		문제  외부장치(콘솔, 키보드)로부터 데이터를 읽는 것을 가능하게 하는 예약어
//		TODO
//		InputStream
		
		
		
		
//		문제  System.out.println(); 에서 out은 무엇을 상속 받는가?
//		TODO
//		OutputStream
		
		
		
		
		
		
		
//		문제  Scanner sc = new Scanner(System.in); 에서 in은 무엇을 상속받는가?
//		TODO
//		InputStream
		
		
		
		
		
		
		
//		문제  콘솔로부터 문자을 입출력하기 위한 클래스의 종류에는 무엇이 있는가? 그리고 왜 사용하는가?
//		TODO
//		int a = sc.nextInt(); 이게 그것이다.  외부로 부터 데이터르 입력받아 사용하기 위해 씀.
		
		
		
		
		
		
	/////////////////////////////////////////////////////////////////여기까지가 01/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 02/////////////////////////////////////////////////////////////
		
//		문제  InputStream과 OutputStream을 상속받는 객체들에 대해 나열하라.
//		TODO
//		FileInputStream
//		FileOutputStream
		
		
		
		
		
		
		
		
		
		
//		문제  위 객체들은 각각 어떤 역할을 하는가?
//		TODO
//		File에 빨대를 꽂아 데이터를 가져오고 내보내는 역할을 한다.
		
		
		
		
		
		
		
		
		
//		문제  InputStream과 OutputStream은 기본적으로 어느 블럭안에 있어야 하는가?
//		TODO
//		try - catch블럭
		
		
		
		
		
		
		
		
		
//		문제   InputStream과 OutputStream은 "______" 이기 때문에 프로그램 종료전 반드시  "______" 해주어야 한다. (빈칸에 들어갈 말은)
//		TODO
//		자원이기 때문에 종료전에 자원반납을 반드시 해줘야 한다. 따라서 try-catch구문에 finally구문을 만들어서 그 안에 트라이캐치로 블럭을 새로만들고 받아줘야함.
		
		
		
		
		
		
		
		
//		문제   그럼 위 내용은 어느 블럭 안에 작성을 해야 하는가? 그리고 왜 거기에 해야 하는가?(정확하게 기술해라 어디 안에 어디에 위치하는지)
//		TODO
//		위에씀
		
		
		
		
		
		
		
//		문제  그 블럭안에 작성하게 되면 반드시 반납전에 if구문을 써줘야한다. 조건값에는 무엇이 들어가야되고 왜 들어가야 되는가?
//		TODO
//		finally안에 자원 반납을 할 땐 항상 그 자원의 값이 null인지 아닌지 판단을 해줘야 한다. 값이 null인 상태에서 .close를 해버리면 널포인트 익셉션이 
//		finally구문에서 반드시 실행되기 때문에 항상 프로그램이 뻗는 현상이 발생할 수 있다.
//		따라서 null이 아닐 때만 .close가 진행되게 만들어줘야한다.
		
		
		
		
		
		
		
		
//		문제  temp 패키지에 big어쩌구 텍스트문서를 input한 다음 그 값을 읽어드리고 다시 그 똑같은 내용물의 것을 이름을 바꾸어서 외부로 내보내봐라.
//		이 때 현재 시간 저장하는 예약어를 이용해 시작부분과 끝부분에 넣어 그 차이 값이 얼마인지 구하여라(즉, 프로그램이 최종 종료되는데 까지 걸린 시간)
//		TODO
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("temp/big_text.txt");
			out = new FileOutputStream("temp/new_volue1_text.txt");
			int bytedata = 0;
			int dataRead = 0;
			long StartTime = System.currentTimeMillis();
			System.out.println("데이터 Reading 시작");
			while(true) {
				dataRead = in.read();
				bytedata++;
				if(dataRead == -1) break;
				out.write(dataRead);
			} // end while
			System.out.println("데이터 Write 시작");
			System.out.println("총 읽고 쓴 데이터량 : " + bytedata);
			long EndTime = System.currentTimeMillis();
			long elapsedTime = EndTime - StartTime;
			System.out.println("총 읽고 쓴 모든 시간 : " + elapsedTime);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // end try-catch
			} // end if
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // end try-catch
			} // end if
		} // end try-catch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		문제  read()는 무엇으로 부터 얼마만큼을 읽어서 어느정도의 단위에 담아 리턴을 해주는 예약어인가? 그리고 들어오는 값과 나가는 값의 단위의 차이가 있다면 왜 그런 차이가 발생하는가?
//		TODO
//		소스로 부터 1byte씩 데이터를 읽어와 4byte의 형태로 보여주는 것이다. 
//		4byte인 이유는 아까도 말했듯이 -1이라는 값이 등장할 수 있는데 이런 변수들을 수용하기 위해 출력시에는
//		조금더 큰 단위로 호출을 시켜준다.
		
		
		
		
		
		
		
		
//		문제  최종적으로 읽고 쓴 바이트의 양을 구하여라.
//		TODO
//		위에 구해놓음
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 02/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 03/////////////////////////////////////////////////////////////
		
//		문제   FileInputStream은 데이터를 한번에 몇바이트씩 읽어나가는가?
//		TODO
//		1byte
		
		
		
		
		
		
		
		
//		문제   그럼 시간효율을 봤을 때 몇 바이트씩 읽어나가는게 유리한가?
//		TODO
//		최대한 많이씩 읽어나가는게 유리
		
		
		
		
		
		
		
		
//		문제   그럼 읽고 출력하는 바이트 단위를 수정하는 방식에는 몇가지가 있는가?
//		TODO
//		2가지가 있다 집하장을 만들어주는 방식, 그리고 택배차의 용량자체를 큰걸 사용하는 방식 2가지로 나뉨
		
		
		
		
		
		
		
		
//		문제   try with resource는 어떤 장점을 가지고 있으며 사용하는 방법은 무엇이며 기존 try-catch 구문과의 차이점은 무엇인가? 
//		그리고 이것을 쓰면 무엇을 안써도 되는가?
//		TODO
//		finally구믄을 작정하지 않아도 알아서 소괄호 안에 있는 자원들을 try-catch종료시 반납시켜준다.
//		사용방법 :
//			try(
//				반납할 자원들
//					){
//				본문 내용
//			} catch {
//				받아줄 익셉션 구문
//			}
		
		
		
		
		
		
		
		
//		문제  try with resource는 java 몇 버전 부터 생겨난 것인가?
//		TODO
//		8버전
		


		
		
		
		
//		문제    InputStream, OutputStream 둘다 어떤 것을 기본적으로 상속(implements)하는가?
//		TODO
//		closeable
		
		
		
		
		
		
//		문제   버퍼를 이용해 입출력 데이터 값을 확장시킬 수 있는 2가지 방식을 기술하라.(집하장과 대형트럭에 비유하면 쉬움)
		
//		1) 데이터 운반의 집하장을 만들어주는 개념(팁을 주자면 팩을 꽂아서 쓰는것들 중 하나야)(File04의 개념인데 한번에 정리를 해야되서 여기서 문제냄)
//		TODO
//		BufferedInputStream bis = null;
//		bis = new BufferedInputStream(in);
//		bis.read(100);
		
		
		
		
//		2) 데이터 운반 시 대형 트럭을 이용하는 개념
//		여기서 중요한건 어떤것을 만들어야하고 그 만든 값이 어디에 들어가야 하는지가 중요
//		TODO
//		int [] buff = new int [1024]; 이런식으로 배열을 만들어주는데 이렇게 배열을 만들어주면 저 배열 원소 1개당 1개의 바이트값을 가져온다.
//		그래서 in.read(); 단계에서 read(buff); 이런식으로 넣어주면 버퍼를 만들어주는 겪이된다.
		
		
		
		
		
		
//		문제  위에서 활용한 두 개념은 서로 중복 적용이 가능한가? 
//		TODO
//		가능하다.
		
		
		
		
		
		
//		문제   read()와 write()의 ()에는 각각 어떤 내용이 들어가게 되는가? 그리고 아무것도 작성하지 않는다면 기본값이 어떻게 되는가?
//		TODO
//		byte타입이기 때문에 0이 기본값이다.
		
		
		
		
		
		
		
//		문제   System.currentTimeMillis(); 로 측정하는 시간의 단위는 무엇인가?
//		TODO
//		1000분에 1초
//		(밀리세컨드단위로 나온다.)
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 03/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 04/////////////////////////////////////////////////////////////
		
//		문제   InputStream에서 상속되어져 내려가는 계보도를 그려라. 누가 누구를 상속받는지 마지막 BufferedInputStream까지 
//		TODO
//		InputStream > FileInputStream > BufferedInputStream
		
		
		
		
		
		
		
		
//		문제   보조 스트림을 무엇이라고 부르는지 작성하고 어떤 기능을 하는지 써라.
//		TODO
//		filter Stream
		
		
		
		
		
		
		
		
		
		
//		문제   보조 스트림들은 어디에 명시해주는가?
//		TODO
//		스트림들의 값을 초기화 시킬 때 같이 초기화 시켜주고 try-catch블럭안에서 인스턴스시켜준다.
		
		
		
		
		
		
		
		
		
//		문제   보조 스트림들은 어디에 인스턴스시켜주는가?
//		TODO
//		위에 씀
		
		
		
		
		
		
		
		
		
//		문제   BufferedInputStream과 BufferedOutputStream의 자원반납시 어떤 것도 같이 반납되는가?
//		TODO
//		inputStream과 OutputStream또한 같이 반납된다.
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 04/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 05/////////////////////////////////////////////////////////////
		
//		문제    03번에서 푼 문제를 Buffered와 Buff를 합쳐서 더 빠른 속도로 출력해보라.
//		TODO
		
		InputStream in1 = null;
		BufferedInputStream biss = null;
		OutputStream out1 = null;
		BufferedOutputStream boss = null;
		
		try {
			byte[] buff = new byte [1024];
			in1 = new FileInputStream("temp/big_text.txt");
			biss = new BufferedInputStream(in1);
			out1 = new FileOutputStream("temp/new_volue1_text1.txt");
			boss = new BufferedOutputStream(out1);
			int bytedata = 0;
			int dataRead = 0;
			long StartTime = System.currentTimeMillis();
			System.out.println("데이터 Reading 시작");
			while(true) {
				dataRead = biss.read(buff);
				bytedata++;
				if(dataRead == -1) break;
				boss.write(dataRead);
			} // end while
			System.out.println("데이터 Write 시작");
			System.out.println("총 읽고 쓴 데이터량 : " + bytedata);
			long EndTime = System.currentTimeMillis();
			long elapsedTime = EndTime - StartTime;
			System.out.println("총 읽고 쓴 모든 시간 : " + elapsedTime);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // end try-catch
			} // end if
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // end try-catch
			} // end if
		} // end try-catch
	
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 05/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 06/////////////////////////////////////////////////////////////
		
//		문제   자바의 기본 데이터 타입(프리미티브타입)을 그대로 읽어들어 오고 자바타입 그대로 출력하는 필터스트림은 무엇인가?
//		TODO
//		DataInputStream, DataOutputStream
		
		
		
//		문제   그럼 프리미티브타입이면 아무거나 다 가능한가?
//		TODO
//		다 가능
		
		
		
		
//		문제   원하는 타입으로 output을 해서 temp패키지 안에 txt파일을 하나 만들고 거기에 30byte에 해당하는 값을 넣어봐라. 
//		넣었으면 이제 해당 문자들을 다시 자바로 불러들여와봐라.
//		TODO
		try(
				OutputStream opsss = new FileOutputStream("temp/examplesss.txt");
				DataOutputStream dos = new DataOutputStream(opsss);
				InputStream ipsss = new FileInputStream("temp/examplesss.txt");
				DataInputStream dis = new DataInputStream(ipsss);
			){
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeInt(8);
			dos.writeChar('a');
			int a = dis.readInt();
			System.out.println(a);
			char b = dis.readChar();
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 06/////////////////////////////////////////////////////////////
		
		
		
		/////////////////////////////////////////////////////////////////여기부터 08/////////////////////////////////////////////////////////////
		
//		문제   자바 객체(Class)를 파일로 읽고 써내는 filterStream은?
//		TODO
//		ObjectInputStream, ObjectOutputStream
		
		
		
		
		
//		문제   Object 스트림의 입출력 대상이 되는 클래스는 Serializable 인터페이스를 구현하는 방법에 대해 설명하라.
//		TODO
//		불러오려는 클래스 이름 옆에 implements Serializable이라고 작성해준다.
		
		
		
		
		
		
//		문제   클래스의 일부 변수를 직렬화에서 제외시키기 위한 예약어는 무엇이며 어디에 붙어야되는가?
//		TODO
//		transient(트렌지션)
		
		
		
		
		
//		문제   파일에서 object는 방법(2가지)를 설명하고 각각을 활용해 파일을 읽어라.
//		TODO
		
		
		
		
		
		
		
//		문제   직렬화의 대상이 되는 클래스는 반드시 어떤 것을 상속시켜야되는가?
//		TODO
//		 Serializable
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 08/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 09/////////////////////////////////////////////////////////////
		
//		문제    ArrayList<> 와 같은 Collection 에서, 모든 데이터들이 Serializable 되어 있으면  ObjectInputStream/ObjectOutputStream 으로 read/write 가능하다 
//		클래스를 타입으로 가지는 ArrayList<> 구문을 만들고 사람의 이름과 나이를 출력할 수 있는 'MemberClass'러눈 것을 만들어 넣어라. 이후 리스트에 클래스를 인스턴스시켜서 넣고 이 리스트 자체를 입력및 출력하는 작업을 해줘라.(파일로 출력을 먼저해줘야겠지?)
//		TODO
		try( 
				OutputStream out11 = new FileOutputStream(FILEPATH);
				ObjectOutputStream oo = new ObjectOutputStream(out11);
				InputStream in11 = new FileInputStream(FILEPATH);
				ObjectInputStream oi = new ObjectInputStream(in11);
				){
			ArrayList<Member> list = new ArrayList<Member>();
			
			Member m1 = new Member("동욱", "경빈");
			Member m2 = new Member("동욱&", "경빈");
			Member m3 = new Member("동욱과", "경빈");
			
			list.add(m1);
			list.add(m2);
			list.add(m3);
			
			
			oo.writeObject(list);
			
			list = null;
			list = (ArrayList<Member>)oi.readObject();
			
			System.out.println();
			System.out.println("enhanced for로 출력");
			for(Member e : list) {
				e.displayInfo();
			}
			
			System.out.println();
			System.out.println("iterator로 출력");
			Iterator<Member> itr = list.iterator();
			while(itr.hasNext()) {
				itr.next().displayInfo(); // next()값이 Member를 리턴하니까 해당 Member에 해당하는 displayInfo를 호출하라고 요청하면 된다.
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 09/////////////////////////////////////////////////////////////
		
		
		
		
		/////////////////////////////////////////////////////////////////여기부터 11/////////////////////////////////////////////////////////////
		
//		문제     '텍스트파일, 즉 문자 단위' 데이터를 읽고/쓰기 할때 사용하는 filterStream은 무엇인가?
//		TODO
//		FileWriter, FileReader
		
		
		
		
		
//		문제   이것은 무엇을 상속받는가?
//		TODO
//		InputStreamReader, OutputStreamWriter
		
		
		
		
		
//		문제   바이너리 파일을 출력할 때와 문자를 출력할 때의 차이점은 무엇인가?
//		TODO
//		너무 많은데? 카톡으로 보낸거 봐봐
		
		
		
		
		
//		문제    UTF-8과 영어 알파벳의 바이트수는 각각 몇바이트로 취급되는가?
//		TODO
//		3바이트와 1바이트
		
		
		
		
//		문제   메소드 호출한 후에, 출력버퍼에 남아있는 데이터 완전히 출력해주는 예약어는 무엇인가?
//		TODO
//		writer변수.flush
		
		
		
		
//		문제    한글자씩 읽다가 더 이상 읽을 문자가 없으면 어떤 값을 리턴해주는가?
//		TODO
//		-1값
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 11/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 12/////////////////////////////////////////////////////////////

//		문제   시스템 정보에 접근하기 위해 사용해야되는 객체의 이름은?
//		TODO
//		.getproperty
		
		
//		문제    시스템 정보 확인을 위한 객체들은 어떤 것이 있는가? (총 8가지) 
//		1) 내 컴퓨터 오퍼레이팅 시스템이 무엇인지 알려주는 예약어
//		2) ADM버전을 보여주는 것은 무엇인가?
//		3) window버전을 보여주는 것은 무엇인가?
//		4) 자바가 깔린 위치를 알려주는 것은 무엇인가?
//		5) 자바 버전을 보여주는 것은 무엇인가?
//		6) 현재 실행중인 프로그램의 위치를 알려준느 것은?
//		7) 지금 실행중인 내 문서가 들어있는 폴더의 이름
//		8) \를 표현해주는 것은?? (파일들을 구분할 때 사용되는게 팁이다.)
//		TODO
//		1) os.name
//		2) os.arch
//		3) os.version
//		4) java.home
//		5) java.version
//		6) user.dir
//		7) user.home
//		8) file.separator
		
		
		
//		문제   jre와 jdk에 대해 설명하라.
//		TODO
//		jre : 자바런타임에디터, 런이 가능하게 해주는 것.
//		jdk : 자바디벨롭킷, 자바 프로그램 개발이 가능하게 해주는 시스템
		
		
		
//		문제   현재 실행중인 프로그램의 위치를 무엇이라고 부르는가?
//		TODO
//		user.dir
		
		
		
		
//		문제   내 문서가 있는 폴더를 무엇이라고 부르는가?
//		TODO
//		user.home
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 12/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 13/////////////////////////////////////////////////////////////
		
//		문제   디렉토리와 파일의 차이점이 무엇인가?
//		TODO
//		디렉토리는 폴더고 파일은 파일이고
		
		
		
		
		
		
		
		
		
//		문제   디렉토리 정보를 출력할 때 사용하는 것은 무엇인가?(어디안에 정보를 넣어서 출력하는가?)
//		TODO
//		String타입안에 넣어서 사용한다. 출력할 땐 String타입 변수를 활용해서 출력해주면 된다.
		
		
		
		
		
		
		
		
		
//		문제   디렉토리 안에 있는 파일들을 배열안에 넣는과정에서 사용되는 2가지 구문은 무엇인가?(크게 봤을 때)
//		TODO
//		File과 .listFiles();
		
		
		
		
		
		
		
		
		
		
		
//		문제   현재 작업 중인 디렉토리에 대한 정보를 불러올 땐 어떤 예약어를 사용해야되는가? 또 어떤 타입으로 받아줘야 하는가?
//		TODO
//		System.getProperty("user.dir");
		
		
		
		
		
		
		
		
		
//		문제   파일 이름과 크기를 알려주는 객체는 각각 무엇인가?
//		TODO
//		for구문 같이 반복문안에 작성해주고
//		list변수이름 + [] + .getName()  또는   .length();
		
		
		
		
		
		
		
		
		
		
//		문제   현재작업폴더에 있는 디렉토리와 파일들을 담아서 타입, 이름, 파일 용량이 나오게 출력하라. 
//		TODO
		String name = System.getProperty("user.dir");
		System.out.println("현재 작업 폴더명 : " + name);
		File comdir = new File(name);
		File [] list = comdir.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println("DIR" + "\t");
			} else {
				System.out.println("FILE" + "\t");
			}
			System.out.print(list[i].getName() + "\t");
			System.out.println(list[i].length()); // 파일크기(byte)
		}
		
		
		
		
		
		
		
		
		
//		문제   위 작업시 파일을 최초 인스턴스 시키면 이것은 실존하는 파일을 가져오는 것인가?
//		TODO
//		아니다 자바에서  가상의 자바파일을 하나 만드는것이다.
		
		
		
		
		
		
		
		
//		문제  아니라면 어떤 작업만을 하고 있는 것인가?
//		TODO
//		위에 적음
		
		
		
		
		
		
		
		
		
//		문제    파일 하나에 대한 정보를 출력할 때 (이름, 절대경로, 실존여부)를 확인하는 객체를 각각 나열하여라.
//		TODO
//		getName();, getAbsolutePath();, .exists();
		
		
		
		
		
		
		
		
//		문제   위에서 만든 파일의 이름, 절대경로, 실존여부를 체크해 출력해라.
//		TODO
		System.out.println(comdir.getName());
		System.out.println(comdir.getAbsolutePath());
		System.out.println(comdir.exists());
		
		
		
		
		
		
		
		
		
		
//		문제    파일 정보를 읽어들어올 때 따로 디렉토리를 지정해주지 않고 파일 이름만 작성하면 어디 디렉토리에서 해당 파일을 가져오는가?
//		TODO
//		지금 이 자바 실행파일이 돌아가고 있는 폴더 안에 생성된다.
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 13/////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////여기부터 14/////////////////////////////////////////////////////////////
		
//		문제   파일생성 전에 무엇을 생성해야 되는가?
//		TODO
//		폴더를 생성 및 맴버클래스 생성 한다.
		
		
		
		
		
		
//		문제   폴더 생성을 할 때 사용하는 약자가 무엇인가?
//		TODO
//		File.separator와 맴버클래스를 활용
//		.mkdir(); 메이크 디렉토리다.
		
		
		
		
		
//		문제  File.separator는 어떤 것과 같은의미를 지니는가?
//		TODO
//		백슬레쉬 \ 폴더와 폴더사이를 나눠준다.(디렉토리끼리 나눠준다고 생각하면됑)
		
		
		
		
		
		
//		문제  separator는 무엇을 의미하는가?
//		TODO
//		위에 적음
		
		
		
		
		
//		문제   하나의 파일을 생성하고 이름을 바꾸고 삭제를 하는 일련적인 과정을 작성하라
//		TODO
		String path = System.getProperty("user.dir") + File.separator + FILE;
		
		File fe = new File(path);
		
		if(!fe.exists()) {
			try {
				if(fe.createNewFile()) {
					System.out.println("파일 생성 성공");
				} else {
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("파일이 이미 존재합니다.");
		}
		
		
		
//		문제   이름을 변경하는 것과 같은 작동을 하는 것은 무엇인가?
//		TODO
//		파일 다른폴더로 이동
		
		
		
		
		
//		문제	File f = new File(path); 이렇게 인스턴스 된 순간 새로운 파일이 생기는가?
//		TODO
//		아니다.
		
		
		
		
		
//		문제   만들거나 이름을 변경하거나 삭제하거나 어떤 것을 준비해둬야 하는가?
//		TODO
//		파일 변경이 실패할 때를 대비해야된다.
		
		
//		문제 파일 생성, 그리고 이름 변경과 파일 삭제의 객체이름을 작성하시오
//		TODO
//		만들파일명.createNewFile()
//		바꾸고 싶은 파일명.renameTo(바꿀 파일명)
//		지울 파일명.delete()
//		둘 다 파일을 생성할 때 와 동일한 형식으로 만들어주면 된다.
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 14/////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////////////////////////////////여기부터가 15/////////////////////////////////////////////////////////////
		
//		문제.  웹 상의 주소를 무엇이라고 부르는가?
//		TODO
		
		
		
		
//		문제.  웹과 자바를 연결시키는 객체는 무엇인가?
//		TODO
		
		
		
		
//		문제.	  프로토콜의 종류는 몇가지가 있는가?
//		TODO
		
		
		
		
//		문제.	 문자 단위를 읽어들이는 통로는 어떤 것이 있는가?
//		TODO
		
		
		
		
		
//		문제. html 데이터를 텍스트 형태로 불러오는 작업을 진행하라.
//		카피할 사이트는 '다음' 사이트의 상위 200개의 텍스트문서
		
//		1단계. 다음 URL주소에 대한 데이터를 끌어와서 리턴해주는 메소드를 만들어라. 
//		TODO
		
		
		
		
//		2단계. 메소드 안에 URL객체와 다음 사이트에 맞는 URLConnection객체를 초기화 시켜라.
//		TODO
		
		
		
		
		
//		3단계. 데이터를 인풋시킬 통로를 만들어라. (이 때 버퍼를 만들어줄 배열도 만든다.)
//		TODO
		
		
		
		
		
//		4단계. URL객체와 다음에 맞는 URLConnection객체를 인스턴스 시켜라
//		TODO
		
		
		
		
		
//		5단계. 실제 사이트에 커넥션 전에 처리할 세팅 4가지 준비하라.
//		 1) 2초 이내에 연결 수립이 안되면 익셉션을 발생시켜라.
//		 2) 웹 요청 방식을 결정하라.
//		 3) 국제 기본형으로 리퀘스트를 요청하라.
//		 4) 귀찮더라도 요청할 때마다 새로운 데이터를 가져오게 만들어라. 즉, 지금 내 컴퓨터에 있는 캐쉬를 사용하지 않게 만들어라.
//		TODO
		
		
		
		
		
//		6단계. 정상적으로 코드값이 잘 왔는지 확인하라(리퀘스트 결과값이 200대인경우, 400대인경우, 500대인 경우로 나누어서 각각이 어떤 결과값인지도 적어라.)
//		TODO
		
		
		
		
		
//		7단계. 본격적으로 데이터를 긁어오라. 
//		TODO
		
		
		
		
		
//		8단계. 다 긁어왔으면 자원을  버퍼에 담아 리턴하고 종료전에 반납시켜라.
//		TODO


		
		
		
		
//		9단계. 메인에서 어느 사이트를 긁어올건지 사이트 주소를 정해주고 해당 주소에서 어디부터 어디까지 긁어올 것인지 정하여라.
//		TODO
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 15/////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////////////여기부터 crawl01/////////////////////////////////////////////////////////////
//		문제. 크롤링 전에 무엇을 다운받아야 하는가?
//		TODO
		
		
		
		
		
		
		
//		문제. 다운 받았으면 이 파일을 어떻게 넣어줘야 하는가? (2가지를 해주어야한다.)
//		TODO
		
		
		
		
		
		
//		문제. 이제 네이버 웹크롤링을 해보아라
		
//		1단계. url을 받아줄 스트링타입을 변수를 만들어 넣어라
//		TODO
		
		
		
		
		
		
//		2단계. jsoup에서 요청할 때 쓸 객체와 자료를 받아줄 객체를 불러와서 변수를 만들어주어라.
//		TODO
		
		
		
		
		
//		3단계. 서버에 자료를 요청하여 리스폰스객체를 받아라.(이게 1줄로 끝나게 되는데 어떤 과정을 1줄로 요약한 것인가?) 
//		(해당 URL주소가 GET방식으로 만들어진 경우는 어떤식으로도 할 수 있는가?)
//		TODO
		
		
		
		
		
//		4단계. 리퀘스트 코드를 요청해서 정상적으로 리퀘스트 되었는지 확인하라.
//		TODO
		
		
		
		
		
//		5단계. 리퀘스트 메시지를 통해 정산적으로 들어갔는지 확인하라.
//		TODO
		
		
		
		
		
		
//		6단계. 리퀘스트 코드를 요청해서 정상적으로 리퀘스트 되었는지 확인하라.
//		TODO
		
		
		
		
		
//		7단계. 자료를 받아줄 객체 변수에 문자열을 해석해서 리턴하는 구문을 넣어라.
//		TODO
		
		
		
		
		
//		8단계. 앞에서부터 200개의 html코드를 출력해라
//		TODO
		
		
		
		
		
//		9단계. 뒤에서부터 200개의 html코드를 출력해라
//		TODO
		
		
		
		
		
//		10단계. Document나 Element 객체의___________, ___________메소드로 ________를 찾아내라 그리고 앞에 2개의 메소드는 각각 어떤 특성이 있는가?
//		TODO
		
		
		
		
		
//		11단계. 위 내용을 활용하여 네이버 실시간 검색어에 해당하는 atribute를 찾아내라.(찾는 방법 부터 어떤식으로 작성해야되는지 까지)
//		TODO
		
		
		
		
		
//		12단계. 실시간 검색어가 몇가지가 있는지 개수를 알아내는 구문을 작성하라.
//		TODO
		
		
		
		
		
//		13단계. 해당 실시간 검색어들이 하나씩 출력되게 만들어라.
//		TODO
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 crawl01/////////////////////////////////////////////////////////////

		
		/////////////////////////////////////////////////////////////////여기부터 crawl01/////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////여기까지가 crawl01/////////////////////////////////////////////////////////////

	} // end main
} // end class
