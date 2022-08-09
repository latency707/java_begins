import java.util.Arrays;
import java.util.ArrayList;

// 이미 데이터가 존재할 때 ArrayList 생성하기

public class MakingArrayList02 {
	public static void main(String[] args) {
		String[] data = {"138", "129", "142"}; // 배열 data 존재
		
		// asList 메서드: 이미 존재하는 문자열 배열로 ArrayList를 생성함 
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
		
		System.out.println(pitches);
	}

}
