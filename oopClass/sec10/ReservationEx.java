package oopClass.sec10;

public class ReservationEx {

	public static void main(String[] args) {
		// 기본 생성자 사용, 첫 번째 예약 객체 생성
		Reservation rsv1 = new Reservation();
		//rsv1 정보 출력
		rsv1.showRsvInfo();
		
		System.out.println();
		// 매개변수가 있는 생성자 사용, 두 번째 예약 객체 생성
		Reservation rsv2 = new Reservation("QR859", "손흥민", "인천", "영국", 2310000, "C75");
		//rsv2 정보 출력
		rsv2.showRsvInfo();
	}

}
