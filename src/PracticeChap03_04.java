/*
 * Q4
주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 
주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.

>>> pin = "881120-1068234"
※ 문자열 인덱싱을 사용해 보자.
*/

public class PracticeChap03_04 {
	public static void main(String[] args) {
		String pin = "881120-1068234";
		
		System.out.println("성별코드: " + pin.charAt(7));
	}

}
