package interfacePkg.sec02;

public class Audio implements IRemoteControl {
	//멤버필드
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
}
