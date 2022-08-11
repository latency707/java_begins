/*
 * 메서드
클래스 내에 구현되어 있는 함수를 메서드라고 함.
다른 언어에는 함수가 별도로 존재하지만,
자바에는 클래스를 떠나서 존재하는 것은 불가능하기 때문에 함수가 없음
*/

class Animal_b {
	String name;
	
	// setName 메서드	
	public void setName(String name) { // 출력: void (리턴값 없음), 입력: String name
		this.name = name; // this 해당 클래스에서 생성된 객체. 파이썬에서 self 같은 개념인듯  
	}
}

public class MethodSample01 {
	public static void main(String[] args) {
		Animal_b cat = new Animal_b();
		cat.setName("boby"); // setName 메서드 호출, 입력항목 name에 boby 문자열 전달
		
		System.out.println(cat.name); // setName 입력항목 name에 입력된 boby 출력 
	}

}
