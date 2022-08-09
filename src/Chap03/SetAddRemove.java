import java.util.Arrays;
import java.util.HashSet;

/*
 * 집합 자료형 관련 메서드
 */

public class SetAddRemove {
	public static void main(String[] args) {
		// 집합 자료형 set 생성
		HashSet<String> set = new HashSet<>();
		
		// add ; 집합 자료형에 값 추가하기
		set.add("Jump");
		set.add("To");
		set.add("Java");
		
		System.out.println(set); // [Java, To, Jump] 출력
		
		// 집합 자료형 set2 생성
		HashSet<String> set2 = new HashSet<>();

		// addAll ; 집합 자료형에 값 여러개 추가하기
		set2.add("Jump");
		set2.addAll(Arrays.asList("To", "Java"));
		
		System.out.println(set2); // [Java, To, Jump] 출력
		
		// 집합 자료형 set3 생성
		HashSet<String> set3 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
		
		// remove ; 집합 자료형에서 특정 값 제거하기
		set3.remove("To");
		System.out.println(set3); // [Java, Jump] 출력
		
		
	}

}
