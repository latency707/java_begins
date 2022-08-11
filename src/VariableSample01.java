/*
 * 객체변수는 공유되지 않음
 객체변수의 값은 독립적으로 유지되는 것이 핵심 특성
 단, 필요에따라 static 키워드를 활용해서 공유할 수도 있음.
 */

class Animal_c {
	String name;
	
	public void setName (String name) {
		this.name = name;
	}
}

public class VariableSample01 {
	public static void main(String[] args) {
		Animal_c cat = new Animal_c();
		cat.setName("boby"); // 메서드 호출
		
		Animal_c dog = new Animal_c();
		dog.setName("happy"); // 메서드 호출
		
		// 객체 공유 여부 확인
		System.out.println(cat.name); // boby
		System.out.println(dog.name); // happy
		
	}

}
