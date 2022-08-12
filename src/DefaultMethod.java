/*
 * 디폴트 메서드 (Default Method)
자바 8 버전 이후부터는 메서드 가장 앞에 default 라고 표기를 하는 것으로,
디폴트 메서드를 사용할 수 있음.
또한 디폴트 메서드는 오버라이딩이 가능함.abstract
*/

interface People {
	String getFood();
	
	// 디폴트 메서드 printFood
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}

class Man {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Asian extends Man implements People {
	public String getFood() {
		return "rice"; // interface의 getFood 메서드의 내용 작성
	}
	
}

class American extends Man implements People {
	public String getFood() {
		return "bread"; // interface의 getFood 메서드의 내용 작성
	}
}

class Server {
	void feed(People people) {
		System.out.println("feed " + people.getFood());
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		Asian asian = new Asian();
		American american = new American();
		Server server = new Server();
		
		server.feed(american);
		server.feed(asian);
		
		
	}

}
