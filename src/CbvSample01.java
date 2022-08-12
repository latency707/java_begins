/*
 * Call by value란?
(중요)메서드에 값(primitive type)을 전달하는 것과 객체(reference type)를 전달하는 것은 큰 차이가 있음.
메서드에 객체를 전달하면 메서드에서 객체의 객체변수(속성) 값을 변경할 수 있음
*/

class Updater {
	void update(int count) {
		count++;
	}
}

class Counter {
	int count = 0; // 객체변수 count 생성
}

public class CbvSample01 {
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update: " + myCounter.count);
		
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter.count);
		
		System.out.println("after update: " + myCounter.count);
		// 객체의 변수 count 값을 메서드에 넘겨서 변형시켜도 값에는 변화가 없음
		// int 자료형은 변화가 없다
		
	}
}

/*
 * 1개의 자바파일에 2개 이상의 클래스 선언하기 
하나의 java 파일 내에는 여러 개의 클래스를 선언할 수있음. 단 파일명이
Sample.java 라면, 해당 파일 내의 Sample 클래스는 public으로 선언하라는 규칙이 있음
 */