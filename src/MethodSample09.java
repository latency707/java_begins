/*
 * 메서드에 클래스의 객체를 넘기는 방법
메서드가 객체를 전달받으면 메서드 내의 객체는 전달받은 객체 그 자체로 수행되고
메서드 수행 이후에도 객체는 변경된 속성값을 유지함.
따라서 입력으로 전달받은 객체의 객체변수 값을 바꿀 수 있음.

메서드의 입력항목이 값인지 객체인지를 구별하는 기준은 
입력항목의 자료형이 primitive 자료형인지 아닌지에 따라 나뉨.
int 자료형같은 primitive 자료형인 경우 - 값 전달
그 밖의 reference 자료형 - 객체 전달
*/

public class MethodSample09 {
	int a; // a를 varTest 메서드가 아닌 클래스의 객체변수로 선언
	
	void varTest(MethodSample09 sample ) { // 메서드에 객체 입력
		sample.a++; // 객체의 객체변수 1 증가
	}

	public static void main(String[] args) {
		MethodSample09 sample = new MethodSample09();
		sample.a = 1;
		sample.varTest(sample);
		System.out.println(sample.a);
	}
}
