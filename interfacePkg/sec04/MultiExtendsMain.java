package interfacePkg.sec04;

public class MultiExtendsMain {

	public static void main(String[] args) {
		// interface 활용
		ImplementationC c = new ImplementationC(); //구현클래스 객체 생성
		
		// InterfaceA : c 참조변수는 InterfaceA타입으로 자동 형 변환
		InterfaceA ia = c;
		ia.methodA();
		
		//InterfaceB : c 참조변수는 InterfaceB타입으로 자동 형 변환
		InterfaceB ib = c;
		ib.methodB();
		
		//InterfaceC : c 참조변수는 InterfaceC타입으로 자동 형 변환
		InterfaceC ic = c;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
