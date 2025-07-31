package interfacePkg.sec02;

public class RemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 활용 객체와 통신
		IRemoteControl irc = null;
		
		//Television 객체 활용
		irc = new Television();
		irc.turnOn(); //인터페이스 추상메소드 : 재정의
		irc.turnOff();
		irc.setVolume(5);
		irc.setMute(true);//디폴트 메서드지만 재정의 되었음(Television에서 재정의된 메소드가 호출) - 객체 통해서 호출
		irc.setMute(false);
		
		System.out.println("--------------------------");
		
		//Audio 객체 활용
		irc = new Audio();
		irc.turnOn();
		irc.turnOff();
		irc.setVolume(50);
		irc.setMute(true); //디폴트 메서드 재정의 하지 않았음 interface의 기본 메서드 호출(객체 통해서 호출)

		// 정적 메소드 사용
		IRemoteControl.changeBattery();
		// irc.showRemote(); 인터페이스의 정적 메소드여도 인터페이스 참조변수를 통해서 접근은 불가능
	}

}
