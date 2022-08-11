/*
 * 클래스
간단한 클래스 작성으로 시작해서 개념 확장해보기
*/

// 클래스 선언만 있고 내용이 없는 최소한의 클래스 Animal 
class Animal {
	
}

public class ClassSample01 {
	public static void main(String[] args) {
		// 클래스는 내용이 없어도 객체를 만드는 기능이 있음
		Animal cat = new Animal(); // Animal 클래스의 인스턴스 cat 생성
		System.out.println(cat);
	}
	
		/* 
		 * 객체와 인스턴스의 차이
		 클래스에 의해 만들어진 객체를 인스턴스라고도 함.
		 둘의 차이는??
		 
		 Animal cat = new Animal() 이렇게 생성된 cat은 객체.
		 객체 cat은 Animal의 인스턴스.
		 인스턴스란, 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를
		 관계위주로 설명할 때 사용됨.
		 cat은 객체(독립적)
		 cat은 'Animal의' 인스턴스(종속적)
		 
		 과자와 과자틀의 관계
		 과자틀 = 클래스
		 과자틀에 의해 만들어진 과자 = 객체(Object)
		 
		 Animal 클래스로 cat, dog, horse 등의 객체들을 무수히 찍어낼 수 있다
		 Animal cat = new Animal();
		 Animal dog = new Animal();
		 Animal horse = new Animal();
		 */

}
