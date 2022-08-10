/*
 * 논리연산자
논리적 계산에 대한 판단을 수행하는 연산자

x || y	: x와 y 둘 중 적어도 하나가 참이면 참
x && y	: x와 y 모두 참이어야만 참
!x		: X가 거짓이면 참

*/
public class ComparisonSample02 {
	public static void main(String[] args) {
		// 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지않으면 걸어라.
		int money = 2000;
		boolean hasCard = true;
		
		if (money >= 3000 || hasCard) {
			System.out.println("택시를 타시오.");
		} else {
			System.out.println("걸어서 가시오.");
		}
		
		// 돈이 3000원 이상 있고, 시간이 부족하다면 택시를 타고 아니면 걸어라.
		int money2 = 3000;
		boolean enoughTime = false;
		
		if (money2 < 3000 && enoughTime) {
			System.out.println("걸어서 가시오.");
		} else {
			System.out.println("택시를 타시오.");
		}
	}
}
