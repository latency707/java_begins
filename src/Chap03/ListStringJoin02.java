import java.util.Arrays;
import java.util.ArrayList;

// String.join 활용해서 리스트 요소들을 하나의 문자열로 만들기

public class ListStringJoin02 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		String result = String.join(",",  pitches);
		
		System.out.println(result);
	}

}
