/*
 * 메서드에서 this 활용하기
sample.varTest(sample);
위 문장은 굳이 sample 객체를 전달하지 않아도 this 키워드를 이용해 객체에 접근할 수 있음
*/

public class MethodSample10 {
	int a; // 객체변수 a
	
	void varTest() {
		this.a++;
	}
	
	public static void main(String[] args) {
		MethodSample10 sample = new MethodSample10();
		sample.a = 1;
		sample.varTest();
		System.out.println(sample.a);
	}

}
