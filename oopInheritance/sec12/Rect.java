package oopInheritance.sec12;

public class Rect extends DrawingObject {

	public Rect() {
		penColor = "green"; //DrawingObject의 필드 penColor 접근
	}
	
	@Override
	public void draw() {
		// 추상 메서드 구현
		System.out.println(penColor + "색상으로 사각형 그리기");
	}
	
}
