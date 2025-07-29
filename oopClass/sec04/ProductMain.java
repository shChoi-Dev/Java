package oopClass.sec04;

public class ProductMain {

	public static void main(String[] args) {
		Product p = new Product();
		
		p.inputPrdInfo();	//상품 정보 입력
		p.showPrdInfo();	//상품 정보 출력
		p.showSalesAmount();	//매출액 계산 출력	
		p.showStockAmount();	//재고액 계산 출력

	}

}
