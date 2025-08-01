package genericCollection.sec04;

public class Util {
	//멤버 메소드 추가 : 제네릭 타입 메소드 형식 : 접근제한자 static <> 반환값타입 메소드명(매개변수)
	//<T> : 타입파라미터(메소드가 제네릭이라는걸 명시함)
	//Box<T> : 반환타입
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box; //객체 인스턴스 반환
	}
}
