/*
 * Q5
A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.

int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
*/

public class PracticeChap04_05 {
	public static void main(String[] args) {
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int total = 0;
		
		for (int mark : marks) {
			total += mark;
			
		}
		
		float average = (float) total / marks.length;
		System.out.println(average);
	}

}
