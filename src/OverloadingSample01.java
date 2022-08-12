/*
 * 메서드 오버로딩 (method overloading)
이미 같은 이름의 메서드가 있어도 동일한 이름의 메서드를 또 생성할 수 있음.
단, 메서드의 입력항목이 다를 경우에만. 
입력 항목이 다를 때 동일한 이름의 메서드를 만들 수 있는 것을 메서드 오버로딩이라고 함.
*/
class Fish_ {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tuna_ extends Fish_ {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseTuna_ extends Tuna_ {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours.");
	}
}

public class OverloadingSample01 {
	public static void main(String[] args) {
		HouseTuna_ houseTuna = new HouseTuna_();
		houseTuna.setName("sushi");
		System.out.println(houseTuna.name);
		houseTuna.sleep();
		houseTuna.sleep(8);
	}

}
