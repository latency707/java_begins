/*
 * 인터페이스의 스태틱 메서드
자바 8 이후부터 인터페이스에 스태틱 메서드를사용할 수 있음
인터페이스에 스태틱 메서드를 구현하면 
인터페이스명.스태틱메서드명
과 같이 사용하여 일반 클래스의 스태특 메서드와 동일하게 사용할 수 있음

인터페이스에서 정의한 상수는 public static final 을 생략해도 자동으로 적용
*/

interface Predator_x {
	String getFood();
	
	default void printFood() {
		System.out.println("my food is %s\n", getfood());
	}
	
	
	// 스태틱 메서드 in interface
	int LEG_COUNT = 4; // 인터페이스 상수
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

class Cow {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.setName("moo");
		Predator_x.speed();
		
		System.out.println(cow.name);
		System.out.println(Predator_x.speed());
	}

}
