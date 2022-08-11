/*
 * Q1
다음 코드의 출력 결과는 무엇일까? (눈으로 해석하고 풀어보자.)
if - wife 없어서 false
elif1 - once 있는데 run 없는게(!a) 거짓이라 false
elif2 - everywhere 없는게(!a) 참이라 true
elif3 - anywhere 있는게 참인데 앞에서 실행돼서 제어문 종료
else - elif2 에서 제어문 종료
// everywhere
*/

public class PracticeChap04_01 {
	public static void main(String[] args) {
		String a = "write once, run anywhere";
		if (a.contains("wife")) {
			System.out.println("wife");
		} else if (a.contains("once") && !a.contains("run")) {
			System.out.println("once");
		} else if (!a.contains("everywhere")) {
			System.out.println("everywhere");
		} else if (a.contains("anywhere")) {
			System.out.println("anywhere");
		} else {
			System.out.println("none");
		}
	}

}
