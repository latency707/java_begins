/*
 * 부모 클래스의 기능 확장
클래스 상속 후 별도의 기능을 추가할 수 있음
보통 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 좀 더 많은 기능을 갖도록 작성함
*/

class Animal__ {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Bird extends Animal__ {
	void sleep() { // Bird 클래스에 sleep 메서드 추가
		System.out.println(this.name + " zzz");
	}
}

public class InheritanceSample02 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		bird.setName("kiwi");
		System.out.println(bird.name);
		bird.sleep();
		
		/*
		 * IS-A 관계
		Bird 클래스는 Animal 클래스를 상속했다.
		즉 Bird "is a" Animal 과 같이 말할 수 있는 관계.
		자바는 이런 관계를 IS-A 관계라고 표현함.
		
		단, 이 경우 animal__ 클래스에 구현되어있는 메서드만 사용이가능함
		이것을 코딩으로 표현하면 아래와 같음
		*/
		Animal__ bird2 = new Bird();
		bird2.setName("chick");
		System.out.println(bird2.name);
		
		/*
		 * 부모클래스로 만들어진 객체를 자식 클래스의 자료형으로 사용하는, 
		 반대의 경우는 컴파일 오류가 발생함.
		 Bird bird3 = new Animal__(); 
		 "동물은 새이다" ??? 동물은 다른 동물도 많다
		 */
		
//		*** 자바에서 만드는 모든 클래스는 Object 클래스를 자동으로 상속받는다 ***
	}

}
