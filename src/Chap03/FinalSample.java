import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
 * final
 * 자료형에 값을 단 한번만 설정할 수 있게 제한을 거는 키워드
 * 최초 설정 후에는 값을 다시 설정할 수 없음
*/

public class FinalSample {
	public static void main(String[] args) {
		// 정수 n을 final 설정
		final int n = 123;
//		n = 456; // 실행 시 컴파일 에러 발생
		
		// 리스트 a를 final 설정
		final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
//		a = new ArrayList<>(Arrays.asList("c", "d")); // 실행 시 컴파일 에러 발생
		
		/*
		 * Unmodifiable List 
		 * 리스트는 final 선언시 리스트에 값을 더하거나 빼는 것은 가능함. 재할당이 불가능한 것인데, 더하거나
		 * 빼는 것도 불가능하게 하고 싶은 경우, List.of 로 수정이 불가능한 리스트를 생성해야 함.
		 */
		
		final List<String> b = List.of("a", "b");
//		b.add("c"); // 실행 시 UnsupportedOperationException 발생
		
	}
	
}

