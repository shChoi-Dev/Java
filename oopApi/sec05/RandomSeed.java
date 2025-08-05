package oopApi.sec05;

import java.util.Random;

public class RandomSeed {

	public static void main(String[] args) {
		// Random 클래스 객체 생성 시 seed 전달
		//Random r = new Random(); //실행시마다 난수를 발생시키는 연산에서 사용할 seed 값이 다르게 구성
		Random r = new Random(3); //난수를 생성하는 알고리즘에서 사용하는 값 : seed 값
		//seed가 동일하면 프로그램 실행 시 동일 난수 발생
		for (int i=0; i<10; i++) {
		int x = r.nextInt(10) + 1; //1~10 까지의 정수
		System.out.print(x + " ");
		
		}
	}

}
