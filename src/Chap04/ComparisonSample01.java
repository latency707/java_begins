/*
 * 비교연산자
조건 판단, 주로 오른쪽과 왼쪽의 계계산겨로가나 값 비교에 사용되는 연산자
<, >, ==, !=, >=, <=
*/

public class ComparisonSample01 {
	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		
		System.out.println(x > y); // true
		System.out.println(x < y); // false
		System.out.println(x == y); // false
		System.out.println(x != y); // true
		System.out.println(x >= y); // true
		System.out.println(x <= y); // false
		
		// 3000원 이상의 돈을 갖고 있다면 택시를 타고 없다면 걸어라를 if 문으로
		int money = 2000;
		if (money >= 3000) {
			System.out.println("택시를 타시오.");
		} else {
			System.out.println("걸어서 가시오.");
		}
	}

}
