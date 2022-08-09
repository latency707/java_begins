/*
 * Q5
다음과 같은 문자열 a:b:c:d가 있다. 
문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.

>>> a = "a:b:c:d"*/


public class PracticeChap03_05 {
	public static void main(String[] args) {
		String a = "a:b:c:d";
		
		System.out.println(a.replaceAll(":",  "#"));
	}

}
