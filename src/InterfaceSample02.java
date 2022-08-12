/*
 * 인터페이스 작성하기
인터페이스에도 메서드를 작성할 수 있음.

단, 인터페이스의 메서드는 메서드 이름과 입출력에 대한 정의만 있고 내용은 없음
인터페이스는 규칙이기 때문에 메서드의 구체적인 내용은 인터페이스를 implement 한 클래스들이 구현해야 함.

인터페이스의 핵심은 특정 클래스의 독립성을 지킬 수 있다는 것임
ex-동물의 종류에 의존적이었던 ZooKeeper 클래스의 feed 메서드  
*/

// 인터페이스 추가
interface Predator {
	// 인터페이스 메서드 추가
	String getFood();
	
}

class Animal_P {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

// Wolf 클래스에 implements Predator 로 인터페이스 구현
class Wolf extends Animal_P implements Predator {
	public String getFood() {
		return "apple";
	}
	
}

// Fox 클래스에 implements Predator 로 인터페이스 구현
class Fox extends Animal_P implements Predator {
	public String getFood() {
		return "banana";
	}
	
}

// Crocodile 클래스에 implements Predator 로 인터페이스 구현
class Crocodile extends Animal_P implements Predator{
	public String getFood() {
		return "peach";
	}
	
}

class ZooKeeper_B {
//	// 인터페이스 적용 전
//	void feed(Wolf wolf) {
//		System.out.println("feed apple");
//	}
//	
//	void feed(Fox fox) {
//		System.out.println("feed banana");
//	}
	
	// 인터페이스 적용 후
	void feed(Predator predator) {
		System.out.println("feed "+ predator.getFood());
	}
	
}

public class InterfaceSample02 {
	public static void main(String[] args) {
		ZooKeeper_B zooKeeper = new ZooKeeper_B();
		Wolf wolf = new Wolf();
		Fox fox = new Fox();
		Crocodile croco = new Crocodile();
		
		zooKeeper.feed(wolf);
		zooKeeper.feed(fox);
		zooKeeper.feed(croco);
	}

}
