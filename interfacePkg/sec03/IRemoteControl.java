package interfacePkg.sec03;

public interface IRemoteControl {
	//상수필드 선언 : public static final은 자동으로 컴파일러에 의해 추가
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 선언 : public abstract 자동으로 컴파일러에 의해 추가
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 선언 및 구현 : 실행블럭이 있음
	//default 키워드를 반드시 붙여야 함 - 접근제한자가 아님
	//기본적으로 public 접근제한
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 선언 및 구현 : 객체 없이 인터페이스만으로 호출 가능한 메소드
	//static 키워드 사용, 실행블록이 있음
	//기본 public 접근제한
	static void showRemote() {
		System.out.println("static 메소드가 인터페이스에서 구현");
	}
	
	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
}
