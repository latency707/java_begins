//제네릭스는 자료형 타입 옆에 자료타입 문구를 작성하는 것

import java.util.ArrayList;

public class GenericsSample01 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(); // 제네릭스 <> 사용
		pitches.add("138");
		pitches.add("129");
		
		// 형변환 필요없이 pitches.get 가능
		String one = pitches.get(0);
		String two = pitches.get(1);
		
		System.out.println(one);
		System.out.println(two);
	}
}