package genericCollection.sec08;

public class Product {
	// 상품을 표현하는 3개의 필드
    String name;
    int price;
    String manufacturer;

    // 객체를 생성할 때 필드를 초기화
    public Product(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    // 객체 정보를 출력하기 위해 toString() 메서드를 오버라이드
    @Override
    public String toString() {
    	String formattedPrice = String.format("%,d", price);
        return "상품명: " + name + ", 가격: " + formattedPrice + "원, 제조사: " + manufacturer;
    }
}
