/*
 * Q1 홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
과목	점수
국어	80
영어	75
수학	55
*/

public class PracticeChap03_01 {
	public static void main(String[] args) {
		int a = 80;
		int b = 75;
		int c = 55;
		
		int qnum = 1;
		
		System.out.println(String.format("Q%d)", qnum));
		System.out.println((a+b+c)/3);
	}

}
