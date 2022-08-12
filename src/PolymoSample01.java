/*
 * 다형성(Polymorphism)
다형성이란 프로그램 언어 내의 각 요소들(클래스, 메서드, 인터페이스 등) 즉 하나의 객체가
다양한 자료형(type)을 갖는 것이 허가되는 성질.
즉, 하나의 타입에 여러 객체들을 대입할 수 있다는 의미.

Tiger 클래스의 객체는 아래와 같이 다양한 자료형으로 표현할 수 있음.

Tiger tiger = new Tiger();
Animal animal = new Tiger();
Predator predator = new Tiger();
Barkable barkable = new Tiger();

단, 각각의 인터페이스별로 호출된 객체는 사용 가능한 메서드도 다른데,
이 경우 새로운 인터페이스를 만들어 extends로 기존의 인터페이스들을 동시에 상속할 수 있음 

다형성을 활용하면 기능 확장이나 객체를 변경해야할 때 타입수정 없이 객체 주입만으로 수정이 가능함

Bouncer(경비원) 클래스 추가해보기

bark 메서드의 효율성을 위해 경비원 클래스를 추가한 후
Barkable 인터페이스 추가하는 것으로 동물을 추가될마다 else if로 barkAnimal에 분기물을 추가하지 않아도 됨
*/ 

interface Predator_h {
	String getFood();
	
	default void printFood() {
		System.out.println("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4; 
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

// Barkable interface 추가, 추가후 까먹지말고 implements 에 인터페이스 추가하기
interface Barkable {
	void bark();
}

// 다중 상속 인터페이스 생성 후 Dog 클래스에 구현해보기
interface BarkablePredator extends Predator_h, Barkable {
	
}

class Animal_h {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

// Dog 에 다중상속 인터페이스 구현
class Dog_h extends Animal_h implements BarkablePredator {
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("멍멍");
	}
}

class Cat_h extends Animal_h implements Predator_h, Barkable { // 인터페이스 추가
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("야옹");
	}
}

class Lion_h extends Animal_h implements Predator_h, Barkable { // 인터페이스 추가
	public String getFood() {
		return "strawberry";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

class ZooKeeper_h {
	public void feed(Predator_h predator_h) {
		System.out.println("feed " + predator_h.getFood());
	}
}

class Bouncer_h {
	// 다형성을 이용하기 전의 barkAnimal, 메서드
//	void barkAnimal(Animal_h animal_h) {
//		 // O instanceof C 는 객체가 특정 클래스의 객체인지 조사할 때 사용되는 내장명령어
//		if (animal_h instanceof Cat_h) { // animal 이 Cat 클래스 파생 객체인지
//			System.out.println("야옹");
//		} else if (animal_h instanceof Lion_h) { // animal 이 Lion 클래스 파생 객체인지
//			System.out.println("으르렁");
//			
//		}
//	}
	// 다형성을 활용한 barkAnimal(입력자료형이 animal에서 Barkable로 변경)
	void barkAnimal(Barkable animal_h) { // Animal 클래스 대신 Barkable 인터페이스 사용
		animal_h.bark(); // 복잡한 형태의 분기문를 메서드 호출로 간소화
		
	}
}

public class PolymoSample01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog_h dog = new Dog_h();
		Cat_h cat = new Cat_h();
		Lion_h lion = new Lion_h();
		ZooKeeper_h zooKeeper = new ZooKeeper_h();
		
		zooKeeper.feed(cat);
		zooKeeper.feed(lion);
		zooKeeper.feed(dog);
		
		Bouncer_h bouncer = new Bouncer_h();
		bouncer.barkAnimal(lion); // 으르렁
		bouncer.barkAnimal(cat); // 야옹
		
		// 다중 인터페이스 상속 테스트
		bouncer.barkAnimal(dog); // 멍멍
	}

}
