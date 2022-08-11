/*
 * 리턴값이 없는 메서드
입력값 - int 자료형 a, int 자료형 b
리턴값 - void
*/

public class MethodSample06 {
	void sum(int a, int b) {
		System.out.println((a + "과 " + b + "의 합은" + (a + b) + "입니다."));
	}

	public static void main(String[] args) {
		MethodSample06 sample = new MethodSample06();
		sample.sum(3, 4); // println 은 return 값이 아니라 메서드 내에서 사용되는 문장이라 return 받는 값이 아님
	}
}
