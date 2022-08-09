/*
 * Enum
 * Enum은 서로 관련있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형
 * Enum 장점
 * 매직넘버(1,2,3 과 같은 숫자 상수값)를 사용할 때보다 코드가 명확함
 * 잘못된 값을 사용함으로 인해 발생할 수 있는 위험성 차단
 */

public class EnumSample01 {
	// 상수집합(enum) CoffeeType 정의
	enum CoffeeType {
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	
	public static void main(String[] args) {
		// 각각 출력
		System.out.println(CoffeeType.AMERICANO);
		System.out.println(CoffeeType.ICE_AMERICANO);
		System.out.println(CoffeeType.CAFE_LATTE);
		
		// 반복문 출력
		for(CoffeeType type: CoffeeType.values()) {
			System.out.println(type);
		}
	}
}