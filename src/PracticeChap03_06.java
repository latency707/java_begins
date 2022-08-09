import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Q6
다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
*/

public class PracticeChap03_06 {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
		
		System.out.println(myList); // 1, 3, 5, 4, 2 출력
		
		myList.sort(Comparator.reverseOrder()); // 내림차순 정렬
		System.out.println(myList);
		
	}

}
