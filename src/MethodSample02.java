/*
 * 메서드를 사용하는 이유
프로그래밍을 할 때 같은 내용을 여러번 반복해서 적는 것을 최소화하기 위함
추후에 같은 내용을 다시 써야 하는 상황에서 최초 메서드를 작성해두면
"어떤 입력값을 줬을 때, 어떤 값을 반환한다" 는 식의 효율적인 작업이 가능함
*/

public class MethodSample02 {
	// sum 메서드
	int sum(int a, int b) { // int a, int b 2개의 값을 받음)
		return a + b; // a, b 를 더한 값을 리턴
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		MethodSample02 sample = new MethodSample02();
		int c = sample.sum(a, b);
		
		System.out.println(c); // 7 출력
	}
	
	/*** 작성한 클래스를 단독으로 실행해서 테스트 할때는 주로
	 * Sample sample = new Sample() 로 간단하게 작성해서 실행한다고 함 
	 */

}
