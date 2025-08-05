package multiThread.sec04;

public class MultiThread extends Thread {
	int id;
	
	public MultiThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("thread(%d), i:%d%n", id, i);
		}
	}
}
