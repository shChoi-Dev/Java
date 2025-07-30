package oopInheritance.sec03;

public class EmployeeMain {

	public static void main(String[] args) {
		// toString()사용
		EmployeeToString emp1 = new EmployeeToString("1234", "홍길동", "마케팅");
		EmployeeToString emp2 = new EmployeeToString("5678", "이몽룡", "영업부");
		
		// toString() 오버라이딩 되어 있는 인스턴스 - toString 호출하지 않음 - 자동호출됨
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
