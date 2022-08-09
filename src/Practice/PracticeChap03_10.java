import java.util.HashMap;

/*
 * Q10
다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면 커피의 가격을 알려주는 프로그램이다.
1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.

public class Practice_Chap03_10 {
	static void printCoffeePrice(int type) {
		HashMap<Integer, Integer> priceMap = new HashMap<>();
		priceMap.put(1, 3000); // 1: 아메리카노
		priceMap.put(2, 4000); // 2: 아이스 아메리카노
		priceMap.put(3, 5000); // 3: 카페라떼
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원 입니다.", price));
		
	}

	public static void main(String[] args) {
		printCoffeePrice(1); // "가격은 3000원 입니다." 출력
		pirntCoffeePrice(99); // NullPointerException 발생
	}
}

*/

public class PracticeChap03_10 {
	enum CoffeeType {
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	
	static void printCoffeePrice(CoffeeType type) {
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.AMERICANO, 3000);
		priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
		priceMap.put(CoffeeType.CAFE_LATTE, 5000);
		int price = priceMap.get(type);
		System.out.println(String.format("가격은 %d원 입니다.", price));
	}
	
	public static void main(String[] args) {
		printCoffeePrice(CoffeeType.AMERICANO);
		printCoffeePrice(CoffeeType.CAFE_LATTE);
		
	}
	
}