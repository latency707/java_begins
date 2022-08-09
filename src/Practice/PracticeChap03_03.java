/*Q3
홍길동 씨의 주민등록번호는 881120-1068234이다. 
홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 
그 뒤의 숫자 부분으로 나누어 출력해 보자.

※ 문자열의 substring을 사용해 보자.
*/

public class PracticeChap03_03 {
	public static void main(String[] args) {
		String pin = "881120-1068234";
		
		System.out.println("생년월일: " + pin.substring(0,6));
		System.out.println("나머지: " + pin.substring(7,14));
	}

}
