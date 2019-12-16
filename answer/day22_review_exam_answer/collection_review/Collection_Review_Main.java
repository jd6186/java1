package com.lec.java.collection_review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class Collection_Review_Main {
	public static void main(String[] args) {
//		문제. 제네릭클래스는 왜 정의를 하게 되는가?
//		TODO
//		제네릭클래스는 클래스들이 가지고 있는 공통된 기능을 모아서 따로 클래스마다 메소드를 만들지 않아도 사용할 수 있게 만들어주는 클래스
//		그래서 메소드의 리턴타입, 매개변수등의 타입을 지정하지 않게 도와준다.
		
		
		
		
		
		
		
		
		
//		문제. 해당 클래스 밑에 제네릭클래스를 정의하여라.
//		TODO
		
		
		
		
		
		
		
		
		
//		문제. 다른 클래스와 다르게 어떤 것을 통해 우엇을 정의하는가?
//		TODO
//		앵글 브래킷을 통해 타입을 작성하게 한다.
		
		
		
		
		
		
		
		
//		문제. 제네릭클래스 안에 이름과 나이를 출력하게 하는 메소드를 정의하라.
//		TODO
//		밑에
		
		
		
		
		
		
		
		
		
		
		
//		문제. 이름 정동욱 나이 26을 기존 클래스를 황요하는 방식으로 출력하라.
//		TODO
		du du1 = new du(26, "정동욱");
		duIntroduce hu1 = new duIntroduce(du1);
		hu1.introduce().display();
		
		
		
		
		
		
		
		
		
//		문제. 하지만 저 결과값을 얻는데는 du1.display(); 를 쓰는 방법이 있는ㄷ ㅔ왜 이렇게 출력하면 되지 뭐하러 제네릭클래스를 쓰는가?
//		TODO
//		게임이라고 생각해봐 나라는 캐릭은 정리가 되어있어 그런데 나라는 캐릭을 소개만 계속하게 하는 클래스가 정의되어 있다면? 나 자체를 불러올 필요가 없으니까 편하겠지? 약간 그런거라고 생각하면됑
		
		
		
		
		
		
		
		
		
//		문제. 그럼 소개한느 것을 제네릭클래스로 만들어보아라. 그리고 무슨 차이가 있는가?
//		TODO
		Number<du> nu = new Number<du>(du1);
		nu.introduce().display();
		// 앵클 브래킷에 다른 사람을 넣으면 똑같은 기능이 바로 실행된다.
		// 이 장점은 다른 인트로듀스를 위한 클래스를 만들지 않아도 된다는 점이다.
		// 즉, 위에랑 기능은 같지만 그 범위값이 하나의 클래스에 속해있지 않고 엄청 넓게 활용될 수 있다.
		
		
		
		
		
		
		
		
		
//		문제. 이름 김경빈, 나이 26 이라는 김경빈 클래스를 만들고 위에 사용한 제네릭클래스를 활용해 출력해보라.
//		TODO
		gb gb1 = new gb(26, "김경빈");
		Number<gb> nu2 = new Number<gb>(gb1);
		nu2.introduce().display();
		

		
////////////////////////////////////////////////////////여기까지가  01/////////////////////////////////////////////////////////////		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////여기부터  02/////////////////////////////////////////////////////////////	
		
		
		
//		문제. 제네릭클래스에서는 어떤 타입을 사용 할 수가 없는가?
//		TODO
//		프리미티브 타입을 사용 불가능하다. 즉, 기본자료형은 사용 불가능하다.
		
		
		
		
		
		
		
		
		
//		문제. 그럼 무엇이 올 수 있는가?
//		TODO
//		Object 타입만 올 수 있다.
		
		
		
		
		
		
		
		
		
		
//		문제. 다른 클래스를 만들지 말고 제네릭클래스 하나로 두가지 타입을 받아서 출력하게 만들어 보아라.
//		TODO
		Mix<Integer, String> mix1 = new Mix<Integer, String>(26, "동욱");
		mix1.outPut();
		
////////////////////////////////////////////////////////여기까지가  02/////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
////////////////////////////////////////////////////////여기부터  03/////////////////////////////////////////////////////////////	
		
		
//		문제. Collection클래스를 상속받는 대포적인 클래스 2개는?
//		TODO
//		List, Set
		
		
		
		
		
		
		
		
//		문제. 두가지의 기능적 결정적 차이 2가지는?
//		TODO
//		리스트는 중복 데이터 값 저장을 허용하고 Set은 허용하지 않는다.
		
		
		
		
		
		
		
		
//		문제. 두가지의 장점에 대표적인 것은 1개씩 각각 설명하라.
//		TODO
//		리스트는 나오는 데이터 값을 모두 저장하여 추후 데이터 관리를 편하게 만들어주고
//		셋은 데이터 중복을 막아 검색속도를 빠르게 하여 원하는 결과물을 빠르게 찾아주는 역할을 한다.
		
		
		
		
		
		
		
//		문제. List클래스를 상속받는 대표적 클래스 2개는
//		TODO
//		ArrayList, LinkedList
		
		
		
		
		
		
		
		
		
//		문제. 두가지의 장단점에 대해 설명해보라.
//		TODO 
//		ArrayList는 데이터를 순서대로 정리하여(인덱스별로) 찾아내는데는 효과적인 반면
//		인덱스 별로 정리되어 있는 사이 값에 데이터를 집어넣으려 한다면 나머지 뒤 데이터들을 전부 뒤로 한칸식 복사붙혀넣기를 하는 과정을 거쳐야하는 엄청난 단점이 있다.
//		LinkedList는 데이터를 아무렇게나 주소값만 복사해서 저장해놓다보니 새로운 데이터의 생성 및 삭제가 편리하다는 장점이 있는 반면
//		막상 데이터를 찾으려고하면 첫 데이터부터 순서데로 주소값들을 따라가서 찾아야한다는 극단적인 단점이 있다. 이것 때문에 실무에선 안쓰인다.
		
		
		
		
		
		
		
		
		
//		문제. 위 2가지중 실무에서 무조건 이것만 써야되는 것은?
//		TODO
//		ArrayList
		
		
		
		
		
		
		
		
//		문제. 데이터를 관리할 때 필요한 4가지의 대표 앞글자 4개와 각 앞글자별로 어떤 기능을 하는지 설명하라.
//		TODO
//		CRUD
//		Create : 데이터 생성(추가라고도 불림)
//		Read : 데이터 읽기
//		Undo : 데이터 되돌리기(없던 상태로) (즉, 제거)
//		Design : 데이터 수정
		
		
		
		
		
		
		
		
		
		System.out.println();
//		문제. ArrayList로 회원 이름을 받는 리스트를 만들고 회원 5명을 받아라.
//		TODO
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("동욱");
		list1.add("경빈");
		list1.add("사랑");
		list1.add("한다");
		list1.add("애기랑");
		
		
		
		
		
		
		
		
		System.out.println();
//		문제. 받은 리스트안에 존재하는 원소의 개수를 출력하라.
//		TODO
		System.out.println(list1.size());
		
		
		
		
		
		
		
		
//		문제. 일반 for 구문을 활용해 해당 리스트 안에 있는 원소들을 한번에 출력하라.
//		TODO
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		
		
		
		
		
		
		
		System.out.println();
//		문제. 3번째 원소 자리에 "결혼"을 넣어라. 이 후  enhanced for을 이용하여 리스트를 출력하라.
//		TODO
		list1.set(2, "결혼");
		for(String st : list1) {
			System.out.println(st);
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println();
//		문제. 5번째 인덱스 지우고 이터레이터로 출력 (이 때 이터레이터는 뭐로 임포트 시켜야되는가?)
//		TODO
		
		// java.util로 임포트시켜야됨
		list1.remove(4);
		Iterator ite = list1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
////////////////////////////////////////////////////////여기까지가  03/////////////////////////////////////////////////////////////	
		
		
		
		
		
		
////////////////////////////////////////////////////////여기부터  05/////////////////////////////////////////////////////////////	
		System.out.println();
//		문제. 
		// Student 타입을 담는 ArrayList를 만드고
		// 3개의 Student 데이터 을 입력받아서
		// 3가지 방법으로 출력해보세요. 
		// for, Enhanced-for, Iterator
//		TODO
		Student st = new Student(1, "동욱", new Score(100, 100, 100));
		Student st1 = new Student(2, "경빈", new Score(100, 100, 100));
		Student st2 = new Student(3, "다른", new Score(100, 100, 100));
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(st);
		list2.add(st1);
		list2.add(st2);
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println();
		System.out.println("인헨스드");
		System.out.println();
		
		for(Student stu : list2) {
			System.out.println(stu);
		}
		
		System.out.println();
		System.out.println("이터레이터");
		System.out.println();
		
		Iterator itr = list2.iterator();
		while(itr.hasNext()) { 
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
//		문제. 위 처럼 출력이 가능한 이유가 무엇인가? (2가지)
//		TODO
//		가능한 이유 1. 스코어의 를 스튜던트에 원소로 심어 놓은것 시켜놓은 상태
//		가능한 이유 2. 스튜던트 클래스 안에 Object클래스의 toString을 오버라이딩 받아서 주소값이 나와야되는 상황을 다른 값들이 나오게 튜닝해서 가능하다.
		
////////////////////////////////////////////////////////여기까지가  05/////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////여기부터  06/////////////////////////////////////////////////////////////	
		
//		문제. 
		// MemberModel1을 저장할 수 있는 ArrayList 인스턴스 생성
		// 5개이상 add
		// 수정, 삭제 등 저장된 자료를 변경해보기
		
		// 출력방법 3가지로 출력
//		TODO
		MemberModel mm = new MemberModel();
		MemberModel mm1 = new MemberModel();
		ArrayList<MemberModel> list3 = new ArrayList<MemberModel>();
		list3.add(mm);
		mm.setId("뉴비");
		mm.setPasswd("뉴비들으르");
		list3.add(mm1);
		mm1.setId("뉴비");
		mm1.setPasswd("뉴비들으르 이라나");
		for (int i = 0; i < list3.size(); i++) {
			list3.get(i).displayInfo();
		}
		
		
		
		
		
		
//		문제. 05에서 만든 것과 어떤 차이가 있는가?
//		TODO
//		toString이 오버라이딩이 되어있지 않아서 그냥 출력하면 주소값이 나오게 된다.
//		그래서 setter를 이용해서 모든 값들을 세팅해줘야 값이 출력 가능하다.
//		그리고 for문 안에서도 프린트문이 아니라 displayInfo를 직접 사용하여 출력하는게 다르다.
		
		
////////////////////////////////////////////////////////여기까지가  06/////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////여기부터  08/////////////////////////////////////////////////////////////	
		
//		문제. Set의 종류에는 어떤 것들이 있는가?
//		TODO
//		Set에는 HashSet과 TreeSet이 있다.
		
		
		
		
		
//		문제. 각각의 장점에 대해 설명하라
//		TODO
//		HashSet은 정보 검색에 특화됨
//		TreeSet은 정보 정렬에 특화됨
		
		
		
		
		
		
		
		
//		문제. Set에서는 List와 다르게 어떤 것을 이용한 출력문을 활용할 수 없는가? 이유는 무엇인가?
//		TODO
//		일반 for
//		get(인덱스)를 활용해서 각 구문을 출력해내는 방식인데 여기서는 인덱스가 존재하지 않기 때문에 출력자체가 불가능하다.
		
		
		
		
		
		
		
		
//		문제. set에 장점이자 단점은 무엇인가? 그리고 그 이유는 무엇인가?
//		TODO
//		데이터 중복저장이 허용되지 않고 두번째 부터 입력하는 값들은 다 false로 데이터 입력자체가 실패된다.
//		하지만 이 특성으로 인해 여러 데이터를 빠르게 찾을 수 있게 된다.
		
		
		System.out.println();
//		문제. Integer 타입을 저장할 수 있는 HashSet 인스턴스 생성
//		TODO
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(1);
		for(Integer in : hash){
			System.out.println(in);
		}
		
		
		
//		문제. 위에 HashSet은 어떤 것으로 임포트 시켜야 하는가??
//		TODO
//		jave.util.
		
		
		
		
		
		
		
		
//		문제. iterator로 값을 불러올 때 단점은 무엇인가?
//		TODO
//		불러올 때 마다 다시 이터레이터를 정의해줘야한다. hasNext를 써서 불러올 때 안에 있는 원소를 꺼내듯이 불러내는 거라. 다 부르고 나면 아무런 원소가 남아있지 않게 된다.
		
		
////////////////////////////////////////////////////////여기까지가  08/////////////////////////////////////////////////////////////	
		
		
		
		
////////////////////////////////////////////////////////여기부터  10/////////////////////////////////////////////////////////////	
		
//		문제. 앵클 브레킷에 일반 클래스를 넣는 것과 레퍼클래스를 담는 것에 차이가 무엇인가? 
//		TODO
//		add 했을 때 중복이 되냐 안되냐 차이
//		레퍼클래스는 프리미티브타입으로 처음에 작성이 되기 때문에 같은 값이어도 주소값이 아니라 기본데이터형이 저장된다.
//		하지만 클래스는 주소값 즉, 헤쉬코드로서 저장되기 때문에 중복저장이 되는 것 처럼 보이지만 실질적으론 주소값이 달라서 중복저장이 되지 않은 것이다.
		
		
		
		
		
		
		
//		문제. 그럼 그런 차이르 없에기 위해선 어떻게 헤쉬코드를 통제해야 하는가?
//		TODO
//		해당 클래스 안에 해쉬코드를 오버라이딩 시키고 그 안에서 값을 수정해준다.
//		여기서 끝이 아니라 equals()또한 오버라이딩 시켜 그 값을 수정해주어야한다.
		
		
		
		
		
		
		
		
//		문제. 위 내용을 활용해 Integer타입을 받는 hashSet을 만들고 MyClass를 받는 해쉬셋을 각각 만들어서 중복이 둘다 안된다는 것을 증명하라.
//		TODO
		System.out.println();
		System.out.println("hashSet 중복불가 기능 만들어주기");
		System.out.println();
		
		System.out.println("기본적인 set에 의한 중복 불가 구문");
		HashSet<Integer> ha1 = new HashSet<Integer>();
		ha1.add(123);
		ha1.add(123);
		System.out.println(ha1.size());
		System.out.println(ha1.hashCode());
		
		
		System.out.println();
		System.out.println("hashCode를 활용한 중복 불가구문");
		MyClass my1 = new MyClass(1, "동욱");
		MyClass my2 = new MyClass(1, "동욱");
		MyClass my3 = new MyClass(3, "경빈");
		
		HashSet<MyClass> ha2 = new HashSet<MyClass>();
		ha2.add(my1);
		ha2.add(my2);
		ha2.add(my3);
		for(MyClass me : ha2) {
			System.out.println(me);
		}
		
		
		
		
		
		
		
//		문제. hashCode를 오버라이딩 시킬 때 어떤 값이 리턴되게 만들어야 되는가?
//		TODO
//		어떤 값이 같을 때 두 변수가 같은 결과라고 인식하게 만들 것인지 그것을 결정해줘야한다.
//		위에 같은 경우는 id가 같을 때 서로 같은 것이라고 인식시킨것.
		
		
		
		
		
		
		
		
		
//		문제. equals()를 오버라이딩 시킬 때 순서는 어떻게 되는가?
//		TODO
//		1. 위에서 결정한 맴버변수가 새로 유입되는 변수값과 같은지 같지 않은지 비교가 가능하기 위해 우선 유입되는 변수를 해당 클래스타입의 변수로 바꿔준다.
//		2. 입력 변수타입과 해당 클래스의 타입을 서로 맞췄다면 비교하고자 하는 해당 클래스의 멤버변수와 유입되는 변수의 맴버변수가 같을 때와 다를 때 어떤 값을 리턴해줄 것인지 정해준다.
//		3. 서로 같은 값이라면 true, 서로 다른 값이라면 false로 리턴한다.
//		4. 그 후 위에 처럼 같은 값을 넣어보면 1가지 변수만 인식하고 있는 것을 볼 수 있다.
		
		
		
////////////////////////////////////////////////////////여기까지가  10/////////////////////////////////////////////////////////////		
		
////////////////////////////////////////////////////////여기부터  11/////////////////////////////////////////////////////////////	
		
//		문제. Set에 속하는 자손 클래스에는 무엇이 있는가?
//		TODO
//		hashSet과 sortSet >> 근데 sortSet안에 TreeSet이 더 많이 쓰인다.
//		그니까 그냥 hashSet과 TreeSet으로 기억해도 된다.
		
		
		
		
		
		
		
		
//		문제. 그럼 TreeSet은 무엇을 상속 받기 때문에 기본적으로 어떤 성격이겠는가?
//		TODO
//		sort를 상속받기 때문에 기본적으로 오름차순으로 정렬해주는 성격을 가지고 있다.
		
		
		
		
		
		
//		문제. TreeSet을 만들고 안에 값을 입력, 출력해보아라 (2가지 방식)
//		TODO
		System.out.println();
		System.out.println("TreeSet 출력");
		TreeSet<String> tr = new TreeSet();
		tr.add("동욱");
		tr.add("경빈");
		tr.add("사랑");
		tr.add("성공");
		tr.add("결혼");
		
		for(String sts : tr) {
			System.out.println(sts);
		}
		
		System.out.println();
		System.out.println("iterator출력");
		Iterator<String> itr1 = tr.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		System.out.println();
		System.out.println("descndingiterator출력");
//		문제. 출력할 때 오름차순이 아닌 내림차순으로 출력되게 만들어 보아라.
//		TODO
		Iterator<String> itr2 = tr.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
////////////////////////////////////////////////////////여기까지가  11/////////////////////////////////////////////////////////////		
		
		
////////////////////////////////////////////////////////여기부터  13/////////////////////////////////////////////////////////////	
		System.out.println();
		System.out.println("여기서부터 Map");
//		문제. Map이란 무엇인가?
//		TODO
//		key와 value값을 나누어 데이터를 저장하는 자료구조

//		문제. Map은 앞에 Set과 List처럼 Collection을 상속받는가?
//		TODO
//		아니다 하지만 이것 또한 자료구조 중 하나인것은 확실하다.
		
		
//		문제. Map을 상속받는 자료구조는 무엇이 있는가?
//		TODO
//		HashMap, TreeMap
		
		
//		문제. 둘의 차이점은 무엇인가?
//		TODO
//		검색속도에 최적화 되어있는가 아닌가
//		hashMap은 hashcode를 부여하여 아무렇게나 저장가능
//		TreeMap은 오름차순으로 정리하여 저장.
		
//		문제. 공통점은 무엇인가?
//		TODO
//		둘다 value값은 같을 수 있지만 key값이 서로 중복되는 것들은 허용하지 않는다.
//		따라서 key값은 단 1개만 존재 하므로 검색, 수정, 삭제 등에 key값이 활용된다.
		
		
//		문제.
		// HashMap 인스턴스 생성
		// Key - Integer 타입
		// Value - String 타입
//		TODO
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
		
//		문제. 3개의 데이터 값을 입력해 출력하고 Set과 List와 다른 Map만의 입력방식에 대해 설명하라.
//		TODO
		hm.put(1, "동욱");
		hm.put(2, "경빈");
		hm.put(3, "사랑");
		// add가 아닌 put을 이용한 데이터 입력을 지원한다.
		
//		문제. Iterator를 활용한 데이터 출력을 시도할 때 순서에 대해서 설명하라.
//		TODO
//		1) HashMap이 가지고 있는 KeySet()메소드를 활용해서 저장된 키 값들로만 이루어진 Set을 만든다.
		Set<Integer> se = hm.keySet();
		
		System.out.println();
		System.out.println("iterator");
//		2) 이 Set에 대한 이터레이터 구문을 만들고 키를 가져오는 구문과 키에 해당하는 벨류값을 가져오는 구문을 만든다.
		Iterator<Integer> itr3 = se.iterator();
		while(itr3.hasNext()) {
			int key = itr3.next();
			
			System.out.println(key + " : " + hm.get(key)); 
		}
		
		
		
		System.out.println();
		System.out.println("Enhanced for");
//		문제. enhanced for로 출력해봐라.
//		TODO

		for(Integer iii : se) {
			System.out.println(iii + " : " + hm.get(iii));
		}
		
		
		
		System.out.println();
		System.out.println("Map.Entry");
//		문제. 다른 방식으로도 출력해봐라.
//		TODO
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println();
		System.out.println("발생빈도 맞추기");
//		문제. 
		// 발생 빈도 맞추기.
		// 도전과제
		// arr[] = {2, 4, 5, 4, 3, 3, 4}
		// 주어진 배열이 위와 같을때 다음과 같이 발생회수 나타내기 
		// 2 : 1개 
		// 3 : 2개 
		// 4 : 3개 
		// 5 : 1개
//		TODO
		int [] arr = {2, 4, 5, 4, 3, 3, 4};
		sortedCaramel(arr);
		
//		문제. 위에 결과가 출력될 수 있는 기능이 작동되는 원리는 무엇인가요?
//		TODO
//		HashMap에서 처음 대입된 값들은 반드시 null값이 리턴 되기 때문에 그 특성을 이용하여 null일경우 벨류값을 1로 초기화 시켜주고
//		두번 이상 나오게 되는 것들은 1부터 +1씩 되어지게 만든것이다.
//		그럼 왜 put하고 다음에 sysout으로 출력하면 나오요? 라고 물어보면 당연하지 위에서 put을 한번 했잖아. sysout에서 지정하면 2번째잖아.
		
		
		
////////////////////////////////////////////////////////여기까지가  13/////////////////////////////////////////////////////////////		
		
////////////////////////////////////////////////////////여기부터  14/////////////////////////////////////////////////////////////	
		
//		문제. TreeMap타입은 어떤 것에 특화되어 있는가?
//		TODO
//		키값들을 오름차순으로 정렬하여 저장한다.(인덱스는 x)
		
//		문제. TreeMap을 만들어보아라.(원소 5개)
//		TODO
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(300, "동욱");
		tm.put(500, "경빈");
		tm.put(300, "동욱 성공");
		tm.put(300, "동욱 브로스~ 굿");
		tm.put(300, "경비니랑 결혼 각");
		
		
//		문제. Iterator와 Map.Entry를 통해 출력해보라.
//		TODO
		System.out.println();
		System.out.println("TreeMap출력");
		Set<Integer> se1 = tm.keySet();
		Iterator<Integer> itr4 = se1.iterator();
		while(itr4.hasNext()) {
			int key = itr4.next();
			System.out.println(key + " : " + tm.get(key));
		}
		for(Map.Entry<Integer, String> tt : tm.entrySet()) {
			System.out.println(tt.getKey() + " : " + tt.getValue());
		}
		
		
		
//		문제. 지정된 value값들만 출력해보아라 2가지 방식
//		TODO
		System.out.println();
		System.out.println("sysout 이용");
		
		System.out.println(tm.values());

		System.out.println();
		System.out.println("for 활용");
		for(String value : tm.values()) {
			System.out.println(value);
		}
		
		
//		문제. HashMap을 TreeMap으로 전환해 출력해보라.
//		TODO
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("이순신", 50000);
		hmap.put("강감찬", 10000);
		hmap.put("최영", 35000);
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(hmap);
		for(Map.Entry<String, Integer> tt : tmap.entrySet()) {
			System.out.println(tt.getKey() + " : " + tt.getValue());
		}
		
		
		
		
////////////////////////////////////////////////////////여기까지가  14/////////////////////////////////////////////////////////////		
		
////////////////////////////////////////////////////////여기부터  16/////////////////////////////////////////////////////////////	
		
//		문제. 리스트들을 오름차순으로 배열하는 예약어는?
//		TODO
		
		System.out.println("리스트들을 오름 차순으로 정렬");
		List <String> list9 = new LinkedList<String>(); // 다형성을 활용한 것.
		list9.add("장길산");
		list9.add("구자철");
		list9.add("정동욱");
		list9.add("축신");
		Collections.sort(list9);
		System.out.println(list9.toString());
		
		
//		문제. 위에 처럼 정렬하여 출력해라(Date클래스 사용하여 날짜), Student클래스를 만들어서(성적순으로 정렬)
//		TODO
		
		
		
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
//		문제.
//		TODO
		
////////////////////////////////////////////////////////여기까지가  16/////////////////////////////////////////////////////////////		
		
		
		
	} // end main
	
	public static void sortedCaramel(int[]array) {
		HashMap<Integer, Integer> ham = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			Integer v = ham.get(array[i]);
			if(v == null) {
				ham.put(array[i], 1);
			} else {
				ham.put(array[i], v + 1);
			} // end if
		} // end for
		
		for(Map.Entry<Integer, Integer> a : ham.entrySet()) {
			System.out.println(a.getKey() + " : " + a.getValue());
		} // end for
	} // end method
	
	
	
	
} // end class


class du {
	int age;
	String name;
	
	public du() {}
	public du(int age, String name) {
		this.age = age;
		this.name = name;
		}
	public void display() {
		System.out.println("나이는 : " + age);
		System.out.println("이름은 : " + name);
	}
}

class gb {
	int age;
	String name;
	
	public gb() {}
	public gb(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public void display() {
		System.out.println("나이는 : " + age);
		System.out.println("이름은 : " + name);
	}
}

class duIntroduce {
	du hu1;
	public duIntroduce() {}
	public duIntroduce(du hu1) {this.hu1 = hu1;}
	public du introduce() {return hu1;}
}
// 이게 사람마다 이런 클래스를 따로 만들어서 리턴을 해줘야 되는데 이건 미친짓이다 이거지
// 그래서 

class Number<T>{
	T n1;
	
	public Number() {}
	public Number(T n1) {this.n1 = n1;} // 이걸 왜 해주는거냐 근데? // 맴버변수를 초기화 해주는 과정이잖아
	public T introduce() {return n1;}
	
	
}

///////////////////////////////////////////////////////////////여기까지가 01//////////////////////////////////////////////////////

class Mix<T, U> {
	T age;
	U name;
	
	public Mix () {}
	public Mix (T age, U name) {
		this.age = age;
		this.name = name;
	}
	public void outPut() {
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);
	}
}

