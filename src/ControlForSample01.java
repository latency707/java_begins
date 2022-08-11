/*
 * for 문
while 문과 마찬가지로 문장을 반복수행해야 할 경우에 사용
*/

public class ControlForSample01 {
	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		
		// for (초기값; 조건문; 증가값) { 수행 문장 }
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
//		“총 5명의 학생이 시험을 보았는데 
//		시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 
//		합격인지 불합격을 보여주는 코드를 짜시오.”
		int[] scores = {90, 25, 67, 45, 80};
		 
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				System.out.println((i+1) +"번째 응시자 합격입니다.");
			} else {
				System.out.println((i+1) +"번째 응시자 불합격입니다.");
			}
		}
		
		// continue 문을 활용한 for 문
		// 위의 예제에서 60점 이상은 축하 메시지를 보내고 나머지는 메시지도 보내지 않기
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 60) {
				continue;
			}
			System.out.println((i+1) + "번째 응시자 합격을 축하합니다.");
		}
		
		// 이중 for 문 으로 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + " "); // print 는 줄바꿈x
			}
			System.out.println(""); // println 은 줄바꿈 o
		}
		
	}

}
