/*
 * 매개변수(parameter)와 인수(arguments)
매개변수는 메서드에 입력으로 전달된 값을 받는 변수
인수는 메서드를 호출할 때 전달하는 입력값
*/

public class MethodSample03 {
	int sum(int a, int b) { // a, b는 매개변수
		return a+b;
	}

	public static void main(String[] args) {
		MethodSample03 sample = new MethodSample03();
		
		int c = sample.sum(5, 8); // 5, 8은 인수
		
		System.out.println(c); // 13 출력
		
	}
}
