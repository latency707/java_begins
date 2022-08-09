import java.util.Arrays;
import java.util.ArrayList;

/*
 * Q7
다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 
"Life is too short" 문자열로 만들어 출력해 보자.
*/

public class PracticeChap03_07 {
	public static void main(String[] args) {
		ArrayList<String> lifeis = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
		String result = String.join(" ", lifeis);
		
		System.out.println(result);
		
	}

}
