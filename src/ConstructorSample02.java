/*
 * 생성자 오버로딩
하나의 클래스에 여러 개의 입력항목이 다른 생성자를 만드는 것
메서드 오버로딩과 동일한 개념
*/

class Flower {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Rose extends Flower {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseRose extends Rose {
	// String 자료형을 받는 생성자
	HouseRose(String name) {
		this.setName(name);
	}
	
	// int 자료형을 받는 생성자
	HouseRose(int type) {
		if (type == 1) {
			this.setName("red");
		} else if (type == 2) {
			this.setName("pink");
		}
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours.");
	}
}

public class ConstructorSample02 {
	public static void main(String[] args) {
		HouseRose red = new HouseRose("red"); // 문자열로 생성
		HouseRose pink = new HouseRose(2); // 숫자겂으로 생성
		
		System.out.println(red.name);
		System.out.println(pink.name);
	}

}
