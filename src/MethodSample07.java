/*
 * 메서드 내에서 선언된 변수의 효력 범위
메서드 내에서 사용되는 변수는 메서드 안에서만 쓰이기 때문에 메서드 밖의 변수명과는 무관함
이렇게 메서드 내에서만 쓰이기 때문에 로컬 변수라고도 칭함 

단, int 자료형이 아닌 객체를 입력값으로 지정하면,
객체는 메서드 수행으로 변경된 속성값을 유지함 
*/

public class MethodSample07 {
	void varTest(int a) {
		a++;
	}
	
	public static void main(String[] args) {
		int a = 1; // a 에 1 입력
		MethodSample07 sample = new MethodSample07();
		sample.varTest(a); // 메서드에 a++ 이 있어서 2이 나올거 같지만 
		
		System.out.println(a); // 나오는건 1였고요
	}

}
