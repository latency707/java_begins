/*
 * 메서드 오버라이딩 (Method overriding)
부모클래스의 메서드를 자식클래스가 동일한 형ㅌ애로 또다시 구현하는 것을 메서드 오버라이딩(덮어쓰기)이라고 함.
동일한 형태의 메서드를 구현한 경우, 자식클래스의 메서드에 높은 우선순위가 적용됨
오버라이딩으로 상속받은 클래스의 속성을 보다 더 구체화할 수 있음
*/

class Fish {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
}

class Tuna extends Fish {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

// HouseTuna 클래스에만 존재하는 속성
class HouseTuna extends Tuna {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
}

public class OverridingSample01 {
	public static void main(String[] args ) {
		HouseTuna houseTuna = new HouseTuna();
		houseTuna.setName("sushi");
		houseTuna.sleep(); // sushi zzz in house 출력
	}

}
