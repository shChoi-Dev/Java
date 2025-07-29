package oopClass.sec01;

// 사용자 정의 클래스 생성 : 개발자가 필요한 변수(필드/속성), 함수(메서드) 정의
// 데이터를 다루기 위한 변수 : 멤버 변수
// 데이터 조작하기 위한, 기능을 수행하기 위한 함수 : 멤버 메소드
public class Car {
	//멤버변수, 데이터
	private String carNo; //차량번호
	private String carName; //차종
	private String carMaker; //제조사
	private int carYear; //연식
	private int carCC; //배기량
	//private : 접근제한자, 클래스 외부에서 변수가 있는지 모르게 숨겨놓는것(데이터 은닉)
	
	//맴버 메소드
	//(1)멤버 변수에 데이터 저장하는 메소드 - 직접 저장
	public void setCarInfo() {
		carNo="11가1234"; //private 멤버변수 : 클래스 내부에서는 접근 가능
		carName="아반떼";
		carMaker="현대";
		carYear=2020;
		carCC=1500;
	}
	
	//(2)멤버 변수 값을 출력하는 메소드
	public void showCarinfo() {
		System.out.println("차량번호 : " + carNo);
		System.out.println("차종 : " + carName);
		System.out.println("차량제조사 : " + carMaker);
		System.out.println("차량연식 : " + carYear);
		System.out.println("차량배기량 : " + carCC);
	}
}
