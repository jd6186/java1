package com.lec.java.collection06;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Collection06Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		// TODO
		// MemberModel1을 저장할 수 있는 ArrayList 인스턴스 생성
		// 5개이상 add
		// 수정, 삭제.
		
		// 출력방법 3가지로 출력
		
		ArrayList<MemberModel> arr = new ArrayList<MemberModel>();
		MemberModel mm = new MemberModel("jdjd", "3333");
		arr.add(mm);
		mm.setId("jdjd");
		mm.setPasswd("333");
		
		
		arr.add(new MemberModel("동욱", "동욱s")); // 새로운 인스턴스 생성한거야 이건
		
		arr.get(1).setPasswd("xxxx"); // "동욱s"가 바뀐다이걸로 왜? 인덱스1 번이 새로만든 멤버모델이니까.
		
		
		MemberModel mm1 = new MemberModel("jdjd1", "3333");
		arr.add(mm1);
		
		MemberModel mm2 = new MemberModel("jdjd2", "3333");
		arr.add(mm2);
		
		MemberModel mm3 = new MemberModel("jdjd3", "3333");
		arr.add(mm3);
		
		MemberModel mm4 = new MemberModel("jdjd4", "3333");
		arr.add(mm4);
		
		
		
		for(int i = 0; i < arr.size(); i++) {
			arr.get(i).displayInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












