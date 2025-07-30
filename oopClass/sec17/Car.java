package oopClass.sec17;

public class Car {
	//private 멤버 필드이므로 인스턴스통한 접근 불가
	private int speed;
	private boolean stop; //기본값 : false
	
	//private 멤버 필드에 접근하려면 클래스 내에서 접근해야 함
	//private 멤버필드의 값을 수정하기위한 setter와 멤버필드 값을 참조하기위한 getter가 필요함
	
	//setter
	public void setSpeed(int speed) {
		//멤버필드에 값 저장
		if(speed<0) {
			this.speed=0;
		}else {
			this.speed = speed;
		}

	}
	
	//getter
	public int getSpeed() {
		return speed;
	}
	
	//getter
	public boolean isStop() {
		return stop;
	}

	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
