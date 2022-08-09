import java.util.ArrayList;
import java.util.Arrays;

/*
 * String.join
ArrayList의 각 요소를 콤마로 구분하여 하나의 문자열로 만들어보기
*/


// String.join 을 사용하지 않은 경우
public class ListStringJoin01 {
	public static void main (String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		String result = "";
		
		// 결합
		for (int i = 0 ; i < pitches.size(); i++) {
			result += pitches.get(i);
			result += "," ;
		}
		result = result.substring(0, result.length() - 1); // 마지막 콤마 제거
		
		// 출력
		System.out.println(result);
	}
}
