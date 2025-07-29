package exercise;

import java.util.Scanner;

class Product{
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	Scanner sc = new Scanner(System.in);
	
	void inputPrdInfo() {	//상품 정보 입력 메소드
		System.out.println("****상품 정보 입력****");
		
		System.out.print("상품명: ");
 		prdName = sc.nextLine();
 		
 		System.out.print("가격: ");
 		prdPrice = sc.nextInt();
 		
 		System.out.print("판매 수량: ");
 		prdSold = sc.nextInt();
 		
 		System.out.print("재고 수량: ");
 		prdStock = sc.nextInt();
 	}
 	
 	void showPrdInfo() { //상품 정보 출력 메소드
 		System.out.println("****상품 정보 출력****");
 		System.out.println("상품명: " + prdName);
 		System.out.println("가격: " + prdPrice);
 		System.out.println("판매 수량: " + prdSold);
 		System.out.println("재고 수량: " + prdStock);
 	}
 	
 	void showSalesAmount() { //매출액 계산 출력 메소드
 		int SalsesAmount = prdPrice * prdSold;
 		String formattedNumber = String.format("%,d", SalsesAmount); //천 단위 쉼표 표시
 		System.out.println("매출액: " + formattedNumber);
 	}
 	
 	void showStockAmount() { //재고액 계산 출력 메소드
 		int StockAmount = prdPrice * prdStock;
 		String formattedNumber = String.format("%,d", StockAmount); //천 단위 쉼표 표시
 		System.out.println("재고액: " + formattedNumber);
 		
 	}
}

public class ProductMain {
	public static void main(String[] args) {
		Product p = new Product();
		
		p.inputPrdInfo();	//상품 정보 입력
		p.showPrdInfo();	//상품 정보 출력
		p.showSalesAmount();	//매출액 계산 출력	
		p.showStockAmount();	//재고액 계산 출력

	}
}
