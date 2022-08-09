import java.util.ArrayList;

// add 메서드로 ArrayList 객체에 값 추가하기

public class MakingArrayList01 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(); // 제네릭스 사용
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		System.out.println(pitches); // 138, 129, 142
	}
}
