/* 
메서드 로컬변수로 동일한 이름의 외부변수를 증가시킬 수 있는가
*/ 
 
public class MethodSample08 {
	int varTest(int a) {
		a++; // a 를 증가시킨 후
		return a; // 증가시킨 값을 리턴하면 외부의 a 값은 메서드의 리턴값으로 대입됨
	}
	
	public static void main(String[] args) {
		int a = 1;
		MethodSample08 sample = new MethodSample08();
		a = sample.varTest(a);
		System.out.println(a);
	}

}
