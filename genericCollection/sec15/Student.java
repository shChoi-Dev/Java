package genericCollection.sec15;

import genericCollection.sec12.Member2;

public class Student {
	//Map 콜렉션에 저장될 데이터의 key로 사용할 클래스
	private int stdNo;
	private String stdName;
	
	public Student(int stdNo, String stdName) {
		this.stdNo = stdNo;
		this.stdName = stdName;
	}

	public int getStdNo() { return stdNo; }
	public void setStdNo(int stdNo) { this.stdNo = stdNo; }
	public String getStdName() { return stdName; }
	public void setStdName(String stdName) { this.stdName = stdName; }
	
	/* 해시맵이 키의 동등성을 비교할 수 있도록 hashCode()와 equals() 재정의 */
	
	@Override
	public int hashCode( ) { //학번(stdNo)과 이름(stdName)을 조합하여 고유한 해시코드 생성
		System.out.println(stdName.hashCode() + stdNo); //hashCode값 출력
		return stdName.hashCode() + stdNo; //hashCode값 반환
	}
	
	@Override
	public boolean equals(Object obj) {
		//비교 대상 객체가 Student 클래스의 인스턴스인지 확인
		if(obj instanceof Student) { 
			//안전하게 Student 타입으로 강제 형변환(casting)하여 필드에 접근할 준비
			Student student = (Student)obj;
			//비교 대상(student)의 이름과 학번이 현재 객체(this)의 이름과 학번과 모두 같은지 확인
			return student.stdName.equals(stdName)&&(student.stdNo==stdNo);
		}else {
			return false; //비교 대상이 Student 타입이 아니므로, false를 반환
		}
	}
}
