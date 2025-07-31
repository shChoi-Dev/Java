package oopInheritance.sec08;

public class SpotsCar extends MyCar { //MyCar 클래스가 fianl이면 상속 불가능
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() { //MyCar클래스에서 stop 메소드 final로 지정함 - Override 불가능
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
