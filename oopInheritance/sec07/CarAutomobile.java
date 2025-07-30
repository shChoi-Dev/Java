package oopInheritance.sec07;

public class CarAutomobile {

	public static void main(String[] args) {
		// 객체 생성 후 생성자에게 값 전달
		Automobile myCar = new Automobile("01가1234", "아반떼", "현대", 2022, "자동");
		Automobile myCar1 = new Automobile("232가5678", "제네시스", "현대", 2025, "자동");
		
		//객체 정보 출력(myCar, myCar1)
		System.out.println(myCar);
		System.out.println();
		System.out.println(myCar1);
	}

}
