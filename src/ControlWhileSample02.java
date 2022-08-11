/*
 * 무한루프
while 문으로 무한히 반복하는 코드를 구현할 수 있음
break 를 활용해서 조건부 무한반복문을 구현할 수 있음
continue 를 활용해서 원하는 값만을 출력하는 코드를 구현할 수 있음
*/

public class ControlWhileSample02 {
	public static void main(String[] args) { 
//		루프 중지 안되는데..??
//		while (true) {
//			System.out.println("무한반복을 중지하려면 Ctrl + c 를 누르시오");
//		}
	
		// break로 조건부 무한반복문 만들기
		int coffee = 10;
		int money = 1000000;
		
		while (money > 4000) {
			System.out.println("돈이 있으시군요. 커피를 받으세요.");
			coffee--;
			System.out.println(("커피가 " + coffee + "잔 남았습니다."));
			
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 물 드세요.");
				break;
			}
		}
		
		// continue로 홀수만 출력해보기
		int a = 0;
		
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue; // a 가 짝수면 조건문으로 돌아가라
			}
			
			System.out.println(a);
			
		}
	}
}