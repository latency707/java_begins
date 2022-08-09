import java.util.Arrays;
import java.util.HashSet;

// 교집합, 합집합, 차집합 구하기

public class SetSample02 {
	public static void main(String[] args) {
		// 1 ~ 6 값을 가진 s1 생성
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		// 4 ~ 9 값을 가진 s2 생성
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
		// 제네릭스는 int의 Wrapper 클래스인 Integer을 사용
		
		// s1으로 intersection 생성
		HashSet<Integer> intersection = new HashSet<>(s1);
		// 교집합 수행
		intersection.retainAll(s2); 
		System.out.println(intersection); // 4, 5, 6 출력
		
		// s1으로 유니온 생성
		HashSet<Integer> union = new HashSet<>(s1);
		// 합집합 수행
		union.addAll(s2);
		System.out.println(union); // 1, 2, 3, 4, 5, 6, 7, 8, 9 출력
		
		// s1으로 substract 생성
		HashSet<Integer> substract = new HashSet<>(s1);
		// 차집합 수행
		substract.removeAll(s2);
		System.out.println(substract); // 1, 2, 3 출력
		
	}

}
