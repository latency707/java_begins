/*
 * 입력값이 없는 메서드
입출력 자료형
입력값 - 없음
리턴값 - String 자료형*/

public class MethodSample05 {
	String say() {
		return "Hi"; // 리턴값 Hi 지정 
	}
	
	public static void main(String[] args) {
		MethodSample05 sample = new MethodSample05();
		String a = sample.say();
		
		System.out.println(a); // Hi 출력
	}

}
