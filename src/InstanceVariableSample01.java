/*
 * 객체 변수 (Instance variable)
클래스에 선언된 변수를 객체변수라고 함.
객체변수는 인스턴스변수, 멤버변수, 속성으로도 불림.

	* 클래스에 의해 생성되는 것 -> 객체
	* 클래스에 선언된 변수 -> 객체변수
*/

// 껍데기 클래스를 발전시켜보기
class Animal_a {
	String name; // 객체 변수 name
}

public class InstanceVariableSample01 {
	public static void main(String[] args) {
		Animal_a cat = new Animal_a();
		
		// 객체변수 사용해보기
		System.out.println(cat.name); // null
	}

}
