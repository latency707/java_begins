/*
 * Map
자바의 Map은 Key와 Value를 한 쌍으로 갖는,
대응관계를 쉽게 표현할 수 있게 해주는 자료형임
*/

import java.util.HashMap;

public class HashMapSample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		// put ; key/value 입력 메서드
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		// get ; key 에 해당하는 value 얻는 메서드
		System.out.println(map.get("people")); // 사람 출력
		
		System.out.println(map.get("java")); // null 출력
		// getOrDefault ; 로 null 대신 디폴트 값을 지정 가능
		System.out.println(map.getOrDefault("java",  "자바")); // 자바 출력
		
		// containsKey ; 맵에 해당 key 유무 확인 후 결과값 T/F 리턴
		System.out.println(map.containsKey("people")); // true 출력
		
		// remove ; 맵의 항목을 삭제한 후 삭제한 value 리턴
		System.out.println(map.remove("people")); // "사람" 출력
		
		// size ; 맵의 갯수 리턴
		System.out.println(map.size()); // 1 출력
	}

}
