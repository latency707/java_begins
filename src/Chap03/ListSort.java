import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// 리스트 정렬하기

public class ListSort {
	public static void main(String [] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		
		pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
		System.out.println(pitches);
		
		pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
		System.out.println(pitches);
	}

}
