package oopException.sec04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			// 정수1 입력받기
			System.out.printf("정수1 입력 : ");
			int num1 = sc.nextInt();
			
			// 정수2 입력받기
			System.out.printf("정수2 입력 : ");
			int num2 = sc.nextInt();
			
			// 나눗셈 수행 및 결과 출력
			int result = num1 / num2;
			System.out.println("나누기 결과 : " + result);
			
		}catch(ArithmeticException e) {
			// 0으로 나누려고 할 때의 예외 처리
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			// 정수가 아닌 값을 입력 했을때 예외 처리
			System.out.println("문자는 입력할 수 없습니다.");
		}catch (Exception e) {
            // 위에서 지정한 예외 외에 다른 모든 예외 처리
            System.out.println("예상치 못한 오류가 발생했습니다.");
            System.out.println("오류 내용: " + e);
		} finally {
			System.out.println("프로그램이 정상적으로 종료되었습니다.");
			// 스캐너 리소스 닫기
			sc.close();
		}
	}

}
