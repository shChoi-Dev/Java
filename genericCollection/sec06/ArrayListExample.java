package genericCollection.sec06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		// Scanner를 사용해서 사용자로부터 4개의 단어 입력받기
		for(int i=0; i<4; i++) {
			System.out.print("단어를 입력하세요>>");
			String word = sc.next();
			list.add(word);
		}
		
		System.out.println("------------------------------");
		
		//입력받은 모든 단어 출력
		for(String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		
		//가장 긴 단어 찾기
		String longWord = "";
		for (String word : list) {
			if (word.length() > longWord.length()) {
				longWord = word;
			}
		}
		
		//결과 출력
		System.out.println("가장 긴 단어는 : " + longWord);
		System.out.println("가장 긴 단어의 길이는 : " + longWord.length());
		
		sc.close(); //Scanner 종료

	}

}
