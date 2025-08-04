package genericCollection.sec11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetStringEx {

	public static void main(String[] args) {
		// HashSet의 중복 객체 저장 불가 확인
		// String 객체를 통해 확인
		Set<String> set = new HashSet<String>();
		
		//Set 은 get()이나 idx 사용하는 메소드는 없음, 순서를 보장하지 않는다
		//String 클래스는 문자열 값이 같은 경우 동등객체가 될 수 있도록 hashCode()/equals() 메소드가 재정의 되어 있음
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA"); //동일 데이터 한번만 추가됨 - 추가되지 않음
		set.add("Mybatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		//set은 idx가 없으므로 반복 순회 위해서 iterator()통해 반복자 얻을 수 있음
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println("\t" + ele);
		}
		
		set.remove("JDBC");
		set.remove("Mybatis");
		System.out.println("총 객체수 : " + set.size());
		for(String ele : set) {
			System.out.println("\t" + ele);
		}
		
		set.clear();//모든 객체 제거하고 비움
		if(set.isEmpty()) {System.out.println("비어 있음");}
	}

}
