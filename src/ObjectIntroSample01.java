/*
 * 객체지향 프로그래밍
자바는 객체지향 프로그래밍 언어임
객체지향에는 클래스, 객체, 인스턴스, 상속, 인터페이스, 다양성, 추상화 등
많은 개념들이 존재함
*/

// 자바 코드로 계산기 구현해보기
// 1. 객체 없이 클래스만으로 만든 계산기
class Calculator {
	static int result = 0; // 이전 결과값을 유지하기 위해 전역변수 static 사용
	
	// 매개변수 num 을 결과값 result에 더한 후 돌려주는 메서드
	static int add(int num) {
		result += num;
		return result;
	}
}
		
public class ObjectIntroSample01 {
	public static void main (String[] args) {
		System.out.println(Calculator.add(3)); // 0+3 = 3 출력
		System.out.println(Calculator.add(4)); // 3+4 = 7 출력
		
	}

}
