package game_project.user;

import java.util.Scanner;

/**
 * 사용자 관련 기능(회원가입, 로그인)의 UI & 입출력을 담당하는 클래스
 */

public class UserMain {

	// 회원가입을 처리하는 static 메소드
	public static void register(Scanner sc, IUserDAO userDAO) {

		System.out.println("******************************************");
		System.out.println("\t\t회원가입");
		System.out.println("==========================================");
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String pass = sc.nextLine();
		System.out.print("이름 입력: ");
		String name = sc.nextLine();

		// 입력받은 정보로 UserDTO 객체 생성
		UserDTO newUser = new UserDTO(id, pass, name);

		// DAO를 통해 사용자 추가
		if (userDAO.addUser(newUser)) {
			System.out.println("회원가입이 완료되었습니다.");
		} else {
			// UserDTO의 equals/hashCode에 의해 중복으로 판단될 경우
			System.out.println("오류 : 동일한 아이디와 이름을 가진 사용자가 이미 존재합니다.");
		}
		System.out.println("현재 회원 목록: " + userDAO.getAllUsers());
	}

	// 로그인 과정을 처리하는 static 메소드
	public static void login(Scanner sc, IUserDAO userDAO) {
		System.out.println("******************************************");
		System.out.println("\t\t로그인");
		System.out.println("==========================================");
		System.out.print("아이디 : ");
		String loginId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String loginpass = sc.nextLine();

		// DAO를 통해 로그인 시도
		UserDTO loggedInUser = userDAO.login(loginId, loginpass);
		if (loggedInUser != null) {
			// 로그인 성공시 출력
			System.out.println("로그인 성공!\n 환영합니다. 어서오십시오, " + loggedInUser.getUserName() + "님.");
		} else {
			// 로그인 실패시 출력
			System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인해주세요.");
		}
	}
}
