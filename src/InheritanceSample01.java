/*
 * 상속 (Inheritance)
자바에는 자식 클래스가 부모 클래스의 기능을 그대로 물려받을 수 있는 기능이 있음
*/

class Animal_ {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal_ { // "extends 클래스명" 으로 기존 클래스의 속성을 그대로 상속받을 수 있음 

}

public class InheritanceSample01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
	}
	

}
