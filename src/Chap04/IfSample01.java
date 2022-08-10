/*
 * if문의 기본 구조
다음의 구조가 if와 else를 사용하는 기본 구조이다.

if (조건문) {
    <수행할 문장1>;
    <수행할 문장2>;
    ...
} else {
    <수행할 문장A>;
    <수행할 문장B>;
    ...
}

조건문을 테스트 해서 
참(true)이면 if문에 속한 문장들을 수행하고,
거짓(false)이면 else문에 속한 문장들을 수행한다.
*/

public class IfSample01 {
	public static void main(String[] args) {
		boolean money = true;
		
		// money 가 true 이므로 if문에 속한 문장들이 수행됨
		if (money) {
			System.out.println(money);
		} else {
			System.out.println("false");
		}
		
		
		// age 는 false 이므로 else문에 속한 문장들이 수행됨
		boolean age = false;
		
		if (age) {
			System.out.println(age);
		} else {
			System.out.println("test");
		}
	}

}
