/*
 * 객체 생성
객체를 사용하면 매번 클래스를 새로 추가하지 않아도 됨
*/

class Calculatorx {
	int result = 0;
	
	int add(int num) {
		result += num;
		return result;
	}
	
	// 빼기 기능 추가하기
	int sub(int num) {
		result -= num;
		return result;
	}
}

public class ObjectIntroSample03 {
	public static void main(String[] args) {
		Calculatorx cal1 = new Calculatorx(); // cal1 객체 생성
		Calculatorx cal2 = new Calculatorx(); // cal2 객체 생성
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(5));
		
		// 빼기 기능 써보기
		Calculatorx cal3 = new Calculatorx(); // cal3 객체 생성
		System.out.println(cal3.add(10));
		System.out.println(cal3.sub(5));
	}

}
