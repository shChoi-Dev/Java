package oopClass.sec10;

public class Reservation {
	String aircraft;
    String name;
    String departure;
    String arrival;
    int price;
    String seatNum;
    
    //기본 생성자 (오버로딩)
    public Reservation() {
        this.aircraft = "KE1001";
        this.name = "홍길동";
        this.departure = "인천";
        this.arrival = "뉴욕";
        this.price = 1600000;
        this.seatNum = "A38";
    }
    
    // 매개변수가 있는 생성자
    public Reservation(String aircraft, String name, String departure, String arrival, int price, String seatNum) {
        this.aircraft = aircraft;
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.seatNum = seatNum;
    }
    
    // 예약 정보 출력 메소드
    public void showRsvInfo() {
        System.out.println("**항공권 예약 정보**");
        System.out.println("항공기 : " + this.aircraft);
        System.out.println("예약자 : " + this.name);
        System.out.println("출발지 : " + this.departure);
        System.out.println("도착지 : " + this.arrival);
        System.out.println("금액 : " + this.price);
        System.out.println("좌석번호 : " + this.seatNum);
    }
}


