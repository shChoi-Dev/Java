package interfacePkg.sec01;

public interface ISmartPhone {
	//생성자가 없는 interface 이므로 선언할 떄 초기화 해야 함 : 상수
	// 상수 필드
	String name = "smartphone"; //interface 내에 있는 필드므로 무조건 상수처리 됨 (컴파일 될 때 자동으로 public static final)
	//구현되는 클래스의 메소드 설계도 역할
	
	// 추상 메서드 : body가 구현되지 않는 메소드{}없음
	// 객체가 갖고있을 메서드를 설명하는 부분 (접근제한, 반환타입, 메소드명, 매개변수)
	public void sendCall();
	public void receiveCall();
	public void sendSMS();
	public void receiveSMS();
}
