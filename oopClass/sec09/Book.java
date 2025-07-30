package oopClass.sec09;

public class Book {
	private String title;
	private String author;
	private int price;
	
	//생성자 오버로딩 - 같은 이름의 메서드를 여러개 구현하는 것
	public Book() {
		//this() : 생성자내에서 다른 생성자 호출 할 수 있는 메서드
		this("자바스크립트","이몽룡",12000); //매개변수로 생성자를 구분
	}
	
	public Book(String t, String au, int p) {
		//this 레퍼런스 : 현재 클래스를 참조하는 레퍼런스
		this.title = t;
		this.author = au;
		this.price = p;
	}
	
	public void show() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자명 : " + this.author);
		System.out.println("가격 : " + this.price);
		
	}
	
}
