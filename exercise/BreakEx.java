package exercise;
import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		int balance = 100000;
		int withdrawal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 잔액 : " + balance);
		
		while(true) {
			System.out.print("인출액 입력 : ");
			withdrawal = sc.nextInt();
			
			if(balance < withdrawal) {
				break; //반복문 중료
			}
			
			balance -= withdrawal;
			
		}
		System.out.print("잔액부족. 현재 잔액 : " + balance);
		sc.close();
	}

}
