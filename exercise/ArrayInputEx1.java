package exercise;

import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = new String[5];
		int max;
		
		System.out.println("숫자 입력");
		for(int i=0; i<num.length;i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = sc.next();
		}
		
		System.out.print("입력된 값 : ");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		
		//첫 번째 입력값을 정수로 변환하여 최대값 설정
		max = Integer.parseInt(num[0]);
		
		// 두번째 값부터 마지막 값까지 반복
		for(int i=1; i<num.length; i++) {
			//현재 배열의 값을 정수로 변환
			int currentNum = Integer.parseInt(num[i]);
			// 현재 값이 max보다 크면 max 값 교체
			if(currentNum > max) {
				max = currentNum;
			}
		}
		
		//최종 최대값 출력
		System.out.print("\n최대값 : " + max);
		
		sc.close();
	}

}
