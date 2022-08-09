/*
 * Q2
 * 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해 보자.
*/

public class PracticeChap03_02 {
	public static void main(String[] args) {
		int a = 13;
		int b = 2;
		
		if (a % b == 0) {
			System.out.println(a + "는 짝수입니다.");
		} else {
			System.out.println(a + "는 홀수입니다.");
		}
	}

}
