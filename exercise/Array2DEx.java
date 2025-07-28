package exercise;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		String[][] eng_voca = {{"chair", "의자"},
				 		 			 {"computer", "컴퓨터"},
				 		 			 {"integer", "정수"}};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<eng_voca.length; i++) { 
				// 질문 번호를 동적으로 생성
				System.out.printf("Q%d.%s의 뜻은? : ", i + 1, eng_voca[i][0]);
				
				// 사용자로부터 정답을 입력 받음
				String answer = sc.next();
				
				//사용자의 답변(answer)과 배열의 정답을 비교
				if(answer.equals(eng_voca[i][1])) {
					System.out.println("정답입니다.");
				}else {
					System.out.println("틀렸습니다. 정답은 " + eng_voca[i][1] + "입니다.");
				}
			
			System.out.println();
		}
			sc.close();
	}

}
