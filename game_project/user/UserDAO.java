package game_project.user;

import java.util.HashSet;
import java.util.Set;

/**
 * IUserDAO 인터페이스의 구현한 데이터 접근 객체(DAO) 클래스
 * HashSet을 사용하여 사용자 정보를 저장하고 관리
 */

public class UserDAO implements IUserDAO {
	
	// 사용자 정보를 저장할 Set 컬렉션
	private final Set<UserDTO> users;
	
	// UserDAO 객체 생성자, 사용자 정보를 저장할 HashSet 초기화
	public UserDAO() {
		this.users = new HashSet<>();
	}
	
	// 새로운 사용자를 HashSet에 추가
	@Override
	public boolean addUser(UserDTO user) {
		return users.add(user);
	}
	
	// 저장된 사용자를 반복하여 아이디와 비밀번호가 일치하는 사용자 확인
	@Override
	public UserDTO login(String id, String pass) {
		for (UserDTO user : users) {
			if(user.getUserId().equals(id) && user.getUserPass().equals(pass)) {
				return user; // 일치하는 사용자를 찾으면 해당 객체를 반환
			}
		}
		return null; // 모든 사용자를 확인했지만 일치하는 사용자가 없으면 null을 반환
	}
	
	// 저장된 사용자 정보가 담긴 Set을 반환
	@Override
	public Set<UserDTO>getAllUsers() {
		return users;
	}
}
