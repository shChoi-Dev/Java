package oopClass.sec11;

public class StaticTest {
	//인스턴스 멤버 필드 / 메서드
	//static 메서드는 static 멤버만 접근 할 수 있다
	int a;
	void f1(int x) {a=x;}	//인스턴스 메서드에서 인스턴스 필드 사용가능
	void f2(int x) {b=x;}	//인스턴스 메서드에서 static 필드 사용가능
	void f3(int x) {s3(x);} //인스턴스 메서드에서 static 메서드 사용 가능
	
	//static 멤버
	static int b;
	static void s1(int x) {a=x;} //static 메소드는 인스턴스 멤버 사용 불가
	static void s2(int x) {f1(3);} //static 메소드는 인스턴스 메소드 호출 불가
	static void s3(int x) {b=x;} //static 메소드는 static 필드 사용 가능
	static void s4(int x) {s1(x);} //static 메소드는 static 메소드 호출 가능
}
