// 제네릭스를 사용하지 않은 예

import java.util.ArrayList;

public class GenericsSample02 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList(); // 제네릭스 없음
		pitches.add("138");
		pitches.add("129");
		
		// 제네릭스를 사용하지 않을 경우 ArrayList 안에 추가되는 객체는 Object 타입으로 인식됨
		// 따라서 값을 가져올 경우에는 항상 String 자료형으로 형변환을 해줘야 문제가 되지 않음
		String one = (String) pitches.get(0); // Object -> String 캐스팅
		String two = (String) pitches.get(1); // Object -> String 캐스팅
		
		System.out.println(one);
		System.out.println(two);
	}
}
