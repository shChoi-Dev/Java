package oopInheritance.sec07.ex;

public class Car {
	private String carNo;
    private String carName;
    private String carMaker;
    private int carYear;
	
    //생성자
	 public Car(String carNo, String carName, String carMaker, int carYear) {
	        this.carNo = carNo;
	        this.carName = carName;
	        this.carMaker = carMaker;
	        this.carYear = carYear;
	    }
	 
	 // toString() 메소드
	    public String toString() {
	        return "차량 번호 : " + carNo + "\n" +
	               "차종 : " + carName + "\n" +
	               "제조사 : " + carMaker + "\n" +
	               "연식 : " + carYear;
	    }
}
