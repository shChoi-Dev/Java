package genericCollection.sec04;

public class Box<T> {
	private T tObj;
	
	public void set(T tObj) {
		this.tObj = tObj;
	}
	
	public T get() {
		return this.tObj;
	}
}
