/*
 * Q3
while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.

*
**
***
****
*****
*/

public class PracticeChap04_03 {
	public static void main (String[] args) {
		
		// 내맘대로 풀이
		StringBuffer stars = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			stars.append("*");
			System.out.println(stars);
		}
		
		// 답지 풀이
		int i = 0;
		while (true) {
			i++; // 루프 당 i 1씩 증가
			if (i > 5) { // 루프 5회까지만 반복 후 break
				break;
			}
			for (int j = 0; j < i ; j++) { // j < i 일때 
				System.out.print('*'); // j 만큼 *를 이어서 출력
			}
			
			
			System.out.println("");
		}
	}

}
