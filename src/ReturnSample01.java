/*
return 의 다른 쓰임새
특정 경우에만 메서드를 빠져나가고 싶을때 return 을 사용할 수 있음
단, return 키워드만으로 메서드를 빠져나가는 것은,
리턴자료형이 void 인 메서드에서만 가능함		
*/

public class ReturnSample01 {
	void sayNick(String nick) {
		if ("fool".equals(nick)) { // 입력값에 fool 이 들어오면 탈출
			return;
		}
		System.out.println("나의 별명은 " + nick + " 입니다.");
	}
	
	public static void main(String[] args) {
		ReturnSample01 sample = new ReturnSample01();
		sample.sayNick("fool"); // 출력되지 않음
		sample.sayNick("genius");
	}

}
