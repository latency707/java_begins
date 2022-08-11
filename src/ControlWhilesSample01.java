/*
 * while 문
문장을 반복해서 수행해야 할 경우에 사용.
조건이 참인 동안 while 문의 문장들을 반복 수행함
*/

public class ControlWhilesSample01 {
	public static void main(String[] args) {
		// "열 번 찍어 안 넘어가는 나무 없다" 를 자바 코딩으로
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
			if (treeHit == 10) {
				System.out.println("나무를 넘어뜨렸습니다.");
			}
		}
//		System.out.println("나무를 넘어뜨렸습니다.");
	}

	
}
