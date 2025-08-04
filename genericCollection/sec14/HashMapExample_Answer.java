package genericCollection.sec14;

import java.util.*;

public class HashMapExample_Answer {
	public static void main(String[] args) {

	//1. 사용자로부터 영문단어 = 한글단어 형태어 entry를 입력받아 HashMap에 저장하는 로직 구현
	HashMap<String, String> dic = new HashMap<String, String>(); //해시맵 생성
	Scanner scanner = new Scanner(System.in);
	
	//dic에 entry 저장
	//dic.put("candy","사탕");
	
	//입력 진행 exit가 입력되면 종료
	while(true) {
		System.out.println("key를 입력하세요. 단, 종료는 exit 입력");
		String k = scanner.nextLine();
		
		if(k.equals("exit")) {
			break;
		}
		System.out.println("Value를 입력하세요.");
		String v = scanner.nextLine();
		
		//map(dic)에 저장
		dic.put(k, v);
	}
	
	while(true) {
		System.out.println("항목을 입력하세요(영문단어=한글단어). 단, 종료는 exit 입력");
		String entry = scanner.nextLine();
		
		if(entry.equals("exit")) {
			break;
		}
		//candy=사탕, candy = 사탕
		String[] w = entry.split("=");
		dic.put(w[0].trim(), w[1].trim());
	}
	
	//2. HashMap에 입력된 영단어를 검색할 수 있는 로직을 구현
	//exit 입력되면 종료
	//없는단어 검색 시 "사전에 없는 단어입니다" 출력
	
	while(true) {
		System.out.println("찾고싶은 단어는? 단, 종료는 exit 입력");
		String eword = scanner.nextLine();
		
		if(eword.equals("exit")) {
			System.out.println("종료합니다...");
			break;
		}
		
		//해시맵에서 eword의 값을 키로 주고 value를 찾기
		String kword = dic.get(eword);
		if(kword == null) {
			System.out.println(eword + "는 없는 단어");
		}else {
			System.out.println(kword);
		}
	}
	scanner.close();
	}
}
