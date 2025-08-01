package genericCollection.sec08;

import java.util.LinkedList;

public class ProductMain {
	public static void main(String[] args) {
		// Product 객체를 저장할 LinkedList 생성
        LinkedList<Product> productList = new LinkedList<>();
        
        // 3개의 상품 객체를 생성 후 LinkedList에 저장
        productList.add(new Product("갤럭시 S25", 1280000, "SamSung"));
        productList.add(new Product("아이폰 16 Pro", 1550000, "Apple"));
        productList.add(new Product("샤오미 15", 1109900, "Xiaomi"));
        
        // LinkedList에 저장된 모든 상품 정보 출력
        System.out.println("--- 상품 목록 ---");
        for (Product product : productList) {
            System.out.println(product);
        }
	}
}
