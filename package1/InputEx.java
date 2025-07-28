package package1;

//Scanner 클래스를 활용해서 입력을 사용할 수 있음 - 객체 참조 변수 생성 후 사용해야 함
//Scanner 클래스 import 해야 함
import java.util.Scanner;	//클래스

public class InputEx {

	public static void main(String[] args) {
		// Scanner 객체 생성 - 메모리 할당을 받음(사용후에는 해제 해야 함)
		Scanner sc = new Scanner(System.in);	//키보드 입력이므로 문자 입력됨
		int num1, num2;
		System.out.println("숫자 1 입력 : ");
		num1 = sc.nextInt();	//입력한 값을 정수로 반환
		System.out.println("숫자 2 입력 : ");
		num2 = sc.nextInt();	//num2에 저장
		
		System.out.println("두 수의 합: " + (num1 + num2));
		
		//실수 입력
		sc.nextFloat();
		
		//문자 입력 - 기본 입력
		sc.next();
		
		sc.close();//할당받은 메모리 해제

	}

}
