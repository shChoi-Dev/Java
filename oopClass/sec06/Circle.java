package oopClass.sec06;

public class Circle {
	//멤버변수
	int radius;
	
	//멤버 메서드
	public void setCircle(int r) {
		radius = r;
	}
	
	//원의 면적 계산 후 반환하는 메서드
	public float area() {
		return radius * radius * 3.14f; //연산 결과 float
	}
}
