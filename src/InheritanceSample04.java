/*
 * 다중 상속
다중 상속이란 클래스가 동시에 하나 이상의 클래스를 상속받는 것인데..
자바는 다중 상속을 지원하지 않는다

*** 만약 자바가 다중상속을 지원한다면 다음과 같은 코드가 가능해질 것 ***

class A {
	public void msg() {
		System.out.println("A message");
	}
}

class B {
	public void msg() {
		System.out.println("B message");
	}
}

class C extends A, B {
	public void static main(String[] args) {
		C test = new C();
		test.msg();
	
	*** 여기서 A, B를 상속한 C가 msg 메서드를 실행한다면,
	*** A와 B 각각의 msg 메서드 중 어떤 것을 실행해야할지 불명확해짐
	*** 자바는 이런 애매모호한 부분을 배제한 것으로 보임
	
	}
}

public class InheritanceSample04 {

}


 */