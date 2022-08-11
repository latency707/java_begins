/*
 * Q2
while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
*/

public class PracticeChap04_02 {
	public static void main(String[] args) {
		int number = 0;
		int total = 0;
		while (number < 1000) {
			number++;
			if (number % 3 != 0) {
				continue;
			}
			total += number;
		}
		System.out.println(total);
	}

}
