import java.util.ArrayList;
import java.util.Arrays;

/*
 * for each 문
for 문에서 초기값, 조건문, 증가값을 넣는 대신,
루프를 돌릴 객체를 한개씩 순차적으로 대입해 for 문을 수행하는 것.
반복횟수를 따로 명시하는 것이 불가능하고, 한 스텝씩 순차적으로 반복할 때만 사용 가능
*/

public class ControlForEachSample01 {
	public static void main(String[] args) {
		// 통상적인 for 문
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		// for each 문
		String[] numbersCopy = numbers;
		// for(type var: 루프를 돌릴 객체)
		for(String number: numbersCopy) {
			System.out.println(number);
		}
		
		// ArrayList 로 for each 문 구현
		ArrayList<String> nums = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String num : nums) {
			System.out.println(num);
		}
		
	}

}
