package genericCollection.sec14;

import java.util.*;

public class HashMapExample {
	//1. 사용자로부터 영문단어 = 한글단어 형태어 entry를 입력받아 HashMap에 저장하는 로직 구현
	
	//2. HashMap에 입력된 영단어를 검색할 수 있는 로직을 구현
	//exit 입력되면 종료
	//없는단어 검색 시 "사전에 없는 단어입니다" 출력
	
	public static void main(String[] args) {
        // <Key, Value> -> <영어, 한글>로 맵을 생성
        HashMap<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // 초기 데이터 저장
        map.put("apple", "사과");
        map.put("summer", "여름");
        map.put("candy", "사탕");
        map.put("school", "학교");
        map.put("water", "물");
        map.put("bird", "새");
        map.put("pet", "애완동물");
        map.put("rain", "비");
        map.put("army", "군대");
        map.put("lock", "자물쇠");

        while (true) {
            System.out.print("찾고 싶은 단어는? ");
            String searchWord = scanner.nextLine(); // 단어 입력 받기

            // "exit" 입력 시 종료
            if (searchWord.equalsIgnoreCase("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            // HashMap의 get() 메소드를 이용해 단어 검색
            String koreanWord = map.get(searchWord);

            if (koreanWord != null) {
                // 단어가 존재할 경우
                System.out.println(koreanWord);
            } else {
                // 단어가 존재하지 않을 경우
                System.out.println(searchWord + "는 없는 단어입니다.");
            }
        }
         scanner.close();
    }
}
