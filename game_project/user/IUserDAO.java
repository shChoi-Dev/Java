package game_project.user;

import java.util.Set;

/**
 * 사용자 데이터 관리(DAO)를 위한 인터페이스 
 * addUser, login, getAllUsers 메소드 표준화
 */

public interface IUserDAO {
	// 새로운 사용자 정보 추가
	// user 추가할 사용자의 정보가 담긴 UserDTO 객체
	// 사용자 추가 성공 시 true, 실패(중복)시 false
	boolean addUser(UserDTO user);

	// 아이디와 비밀번호가 일치하는 사용자가 있는지 확인
	// id : 사용자가 입력한 아이디, pass : 사용자가 입력한 비밀번호
	// 로그인 성공 시 해당 UserDTO 객체, 실패 시 null
	UserDTO login(String id, String pass);

	// 저장소에 있는 모든 사용자 정보의 목록을 가져옴
	// 모든 UserDTO 객체가 담긴 Set
	Set<UserDTO> getAllUsers();
}
