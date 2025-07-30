package oopInheritance.sec07;

// Car 클래스로부터 상속
public class Automobile extends Car {
	private String autoManual;
	
	// 생성자
	public Automobile(String carNo, String carName, String carMaker, int carYear, String autoManual) {
        // 부모 클래스의 생성자 호출
        super(carNo, carName, carMaker, carYear);
        this.autoManual = autoManual;
	}
	// toString() 메소드 오버라이딩
	@Override
    public String toString() {
        // 부모 클래스의 toString() 내용을 가져온 후, 자식 클래스의 정보 추가
        return super.toString() + "\n" +
               "기어변속 : " + autoManual;
	}
        
}
