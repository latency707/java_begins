/*
 * 형변환
 * 자료형간의 유형을 변환하는 것
 */


public class TypeCastingSample01 {
	public static void main(String[] args) {
		// 문자열을 정수로 형변환
		String num = "123";
		int n = Integer.parseInt(num);
		
		System.out.println(n); // 123 출력
		
		// 정수를 문자열로 변환
		int n2 = 456;
		String num2 = "" + n2;
		
		System.out.println(num2); // 456 출력
		
		// 다른 방법
		int n3 = 234;
		String num3 = String.valueOf(n3); // 문자열로
		String num4 = Integer.toString(n3); // 정수로
		
		System.out.println(num3); // 234 출력
		System.out.println(num4); // 234 출력
		
		// 소숫점 숫자형태 문자열 변환
		// Double.parseDouble 또는 Float.parseFloat 
		
		// Double.parseDouble
		String fnum = "123.456";
		double d = Double.parseDouble(fnum);
		System.out.println(d); // 123.456 출력
		
		// Float.parseFloat 
		String fnum2 = "234.567";
		Float f = Float.parseFloat(fnum2);
		System.out.println(f);
		
		// 정수와 실수 간 형변환
		// 정수를 실수로 변환
		int nf1 = 321;
		double d1 = nf1; // 정수를 실수로 변환시에는 캐스팅이 필요없음
		System.out.println(d1); // 321.0 출력
		
		// 실수를 정수로 변환
		double d2 = 432.123;
		int nf2 = (int) d2; // 실수를 정수로 변환시에는 반드시 정수형으로 캐스팅
		System.out.println(nf2); // 소수점 생략된 432 출력
		
		// 실수형을 정수형으로 변환해야하는 이유
		// 아래 코드를 실행하면 NumberFormatException 에러가 발생함
//		String ex = "123.456";
//		int l = Integer.parseInt(ex);
	}
}
