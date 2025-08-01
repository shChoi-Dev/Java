package interfacePkg.sec05;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {
	//db connection data 필드
	//db 연결 코드 : 연결 메서드가 필요함
	
	//실제 구현은 db연동에 의한 db 접근이 진행되어야 하고
	//관련 쿼리를 전달해서 각 기능이 수행되게 해야 함
	@Override
	public void insertMember(MemberDTO dto) {
		// 전달받은 회원 정보를 DB에 저장하려면 DTO에서 개별 정보를 반환받아 저장하게 됨
		String id = dto.getMemId();
		System.out.println("회원가입 성공");
		System.out.println(id + "님의 회원가입이 완료 되었습니다.");
		
	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO selectMember(String memId) {
		// db에게 id를 전달해서 검색된 회원정보를 받았다고 가정하면 정보를 DTO에 저장해서 반환해야 함
		MemberDTO dto = new MemberDTO("123","abcd","홍길동","1111","서울");
		return dto;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberDTO> getNameMember(String nameStr) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
