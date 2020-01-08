package practice.wordcount;

import java.io.FileInputStream;
import java.util.HashMap;

/*
	단어의 개수 세기
	★HashMap 사용★
	
	word_count(String inputFile, String outputFile)
 	입력파일 (텍스트, UTF-8)
 	출력파일 : 다음과 같은 entry 로 저장되면 됨.
 		ex) Alice: 221
 		
 대소문자 별도로 카운트 해도 됨.(Alice 나 alice 나 다른 단어로 카운트)
 
 파일에서 한 라인씩 읽어서 "\\s+" 로 split 하면 됨
*/


public class WordCount {
	public static void main(String[] args) {
		
		System.out.println("단어를 세는 Word Count");
		// 단어를 세는 Word Count
		// 파일에서 가져오기
		WordCount app = new WordCount();
		app.wordCount("./data/alips30.txt", "./data/out.txt");
		
		
		
		
		
		System.out.println("프로그램 종료");
	} // end main
	
	
	
	
	public void wordCount(String inputPath, String outputPath) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		for (int i = 0; i < .length; i++) {
			
		}
		
		
		
	}
	
	
	public void FileinputStream() {
		FileInputStream fs = new FileInputStream("./data/alips30.txt");
		
	}
	
} // end class
