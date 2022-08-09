import java.util.Arrays;
import java.util.ArrayList;

// String 자료형을 여러개 전달해서 ArrayList 생성하기

public class MakingArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		
		System.out.println(pitches);
	}

}
