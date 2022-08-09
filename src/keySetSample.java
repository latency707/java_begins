import java.util.HashMap;
import java.util.ArrayList;

/*
 * keySet
맵의 모든 Key를 모아서 Set 자료형으로 리턴해주는 메서드
*/

public class keySetSample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		System.out.println(map.keySet()); // baseball, people 출력
		
		// Set 자료형 List 자료형으로 변환
		ArrayList<String> keyList = new ArrayList<>(map.keySet());
		System.out.println(keyList);
	}

}

/*
 * LinkedHashMap and TreeMap 
Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는 것임.
단, 아래의 Map은 별도의 특징이 있음 
LinkedHashMap 은 입력된 순서대로 데이터를 저장
TreeMap 은 입력된 key의 오름차순으로 데이터를 저장

 */