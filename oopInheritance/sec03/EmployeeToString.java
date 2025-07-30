package oopInheritance.sec03;

public class EmployeeToString {
	private String empNo;
	private String name;
	private String part;
	
	public EmployeeToString(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	//toString()메소드
	//Object 클래스가 구현한 메소드 모든 클래스에 상속됨 - Override 해야 함
	//객체가 텍스트 값으로 표시되거나 문자열이 예상되는 방식으로 참조될떄 자동으로 호출되는 메서드
	//toString 메소드 호출되면 객체가 갖고 있는 정보나 값들을 문자열 형태로 반환
	
	//오버라이드 어노테이션 사용 - 상속받은 메소드 재정의
	@Override
	public String toString() {
		return empNo + "\t| " + name + "\t| " + part;  
	}
}
