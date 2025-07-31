package interfacePkg.sec02;

public class Television implements IRemoteControl {
	private int volume; //객체 인스턴스 필드
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > IRemoteControl.MAX_VOLUME) {
			this.volume = IRemoteControl.MAX_VOLUME;
		}else if(volume < IRemoteControl.MIN_VOLUME) {
			this.volume = IRemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	}
	
	//interface default method도 필요하면 재정의 가능(선택사항)
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Tv 무음 처리합니다.");
		}else {
			System.out.println("Tv 무음 해제합니다.");
		}
	}
	
}
