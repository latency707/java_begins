import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Q9
다음의 numbers 리스트 
[1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 에서 중복 숫자를 제거해 보자.

※ 집합 자료형의 요솟값이 중복될 수 없다는 특징을 사용해 보자.
*/

public class PracticeChap03_09 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
		
		System.out.println(numbers);
		
		// 집합 자료형 s1 생성
		HashSet<Integer> s1 = new HashSet<>(numbers);
		
		System.out.println(s1);
	}

}
