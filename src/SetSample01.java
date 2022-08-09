import java.util.Arrays;
import java.util.HashSet;

/* 
 * 집합(Set) 
자료형은 집합과 관련된 거을 쉽게 처리하기 위한 자료형
 */

public class SetSample01 {
	public static void main(String[] args) {
		// 집합 자료형 set 생성 
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
		
		System.out.println(set); // e, H, l, o 출력 
		
	}
}

/*
 * 집합 자료형의 특징
 - 중복을 허용하지 않음
 - 순서가 없음
 - 이러한 특징으로 인해 자료형의 중복값을 제거하기 위한 필터 역할로 종종 사용함
 */