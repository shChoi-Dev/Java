package exercise;

import java.util.Arrays;

public class ArrayExer3 {

	public static void main(String[] args) {
		//6개의 번호를 저장할 정수 배열
		int[] lottoNum = new int[6];
		
		for(int i=0; i<lottoNum.length; i++) {
			//1 ~ 45 사이의 난수 생성
			int randomNumber = (int) (Math.random() * 45) + 1;
			
			//--- 중복 검사 ---
			boolean isDuplicate = false;
			// 현재 배열에 채워진 숫자만큼 반복하여, 중복 확인
			for(int j=0; j<i; j++) {
				if(lottoNum[j] == randomNumber) {
					isDuplicate = true;
					break;
				}
			}//--- 중복 검사 종료 ---
			
			// 중복 여부에 따라 다시 뽑기 or 번호 저장
			if (isDuplicate) {
				i--;
			}else {
				lottoNum[i] = randomNumber;
			}
		}
		//로또 번호 출력
		System.out.println("생성된 로또 번호");
		System.out.println(Arrays.toString(lottoNum));
		
	}

}
