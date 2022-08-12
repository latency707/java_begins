/*
 * 인터페이스
자바는 인터페이스라는 것을 토해 다중 상속 기능을 대체하고 있음
인터페이스란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하며,
다른 클래스 사이의 중간매개 역할까지 담당하는 일종의 추상 클래스
*/

// 인터페이스의 필요성
class Animal_z {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal_z {
	
}

class Lion extends Animal_z {
	
}

class ZooKeeper {
	void feed(Tiger tiger) { // feed(호랑이 호랑이) 메서드 오버로딩
		System.out.println("feed apple.");
	}
	
	void feed(Lion lion) { // feed(사자 사자) 메서드 오버로딩
		System.out.println("feed banana.");
	}
	
	// ***인터페이스 없이는 클래스가 추가될 때마다 feed 메서드를 추가해야 함*** 
}

public class InterfaceSample01 {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		
		
	}

}
