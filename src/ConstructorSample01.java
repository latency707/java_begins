/*
 * 생성자 (Constructor)
메서드명이 클래스명과 동일하고 리턴자료형을 정의하지 않는 메서드를 생성자라고 함
생성자를 사용하면 필수적인 행동을 객체 생성시에 제어할 수 있음.

생성자의 규칙
-클래스명과 메서드 명이 동일할 것
-리턴타입을 정의하지 않음(void도 사용하지 않음)

디폴트 생성자 : 생성자 입력항목이 없고 내부에 아무 내용도 없는 생성자를 뜻함
단, 클래스에 생성자가 하나도 없어야 디폴트 생성자가 작동함
HousePig() { 
}

*/

class Animal_y {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Pig extends Animal_y {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HousePig extends Pig {	
	// 객체변수에 값을 무조건 설정해야 객체가 생성되도록 강제하는 방법; 생성자
	HousePig(String name) { // 클래스명 (입력인수1, 입력인수2, ...)
		this.setName(name);
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house.");
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house " + hour + " hours.");
	}
}

public class ConstructorSample01 {
	public static void main(String[] args) {
		HousePig pig = new HousePig("pink"); // 생성자 호출시 문자열을 전달해야 함
		System.out.println(pig.name); // pig 객체의 name 변수에 아무 설정이 없었으므로 null 출력
	}

}
