/*
 * 자바 메서드의 구조
메서드는 입력값을 가지고 어떤 처리를 하여 적절한 리턴값을 돌려주는 블랙박스와 같음
입력값 -> 메서드 -> 리턴값

자바 메서드의 구조는 
리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수...) {
	... 처리 내용
	return 리턴값; 리턴 자료형이 void 인경우 return문이 필요없음
}

리턴자료형: 메서드 수행후 돌려줄 값의 자료형

메서드는 입출력 유무에 따라 4가지로 분류할 수 있음
-입력과 출력이 모두 있는 메서드
-입력과 출력이 모두 없는 메서드
-입력은 있고 출력이 없는 메서드
-입력은 없고 출력이 있는 메서드
*/

public class MethodSample04 {
	// 일반적인 메서드 (입력값 o, 출력값 o)
	int sum(int a, int b) { // 입력값 - int a, int b
		return a + b; // 리턴값 int a+b
	}
	
	public static void main(String[] args) {
		MethodSample04 sample = new MethodSample04();
		int c = sample.sum(2, 4); // 인수 2, 4
		
		System.out.println(c);
	}

}
