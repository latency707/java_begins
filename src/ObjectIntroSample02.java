/*
 * 클래스의 한계
Sample01 의 클래스 기반 계산기가 2대 필요한 경우,
각 계산기는 각각의 결괏값을 유지해야 하기 때문에 클래스를 새로 만들어야 함
*/

class Calculator01 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}

class Calculator02 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
		
	}
}

public class ObjectIntroSample02 {
	public static void main(String[] args) {
		System.out.println(Calculator01.add(4)); // 4
		System.out.println(Calculator01.add(3)); // 7
		
		System.out.println(Calculator02.add(6)); // 6
		System.out.println(Calculator02.add(8)); // 14
	}
	
	// 야이~~~ ㅎㅎ 그래서 필요할 때마다 계산기 클래스 계속 추가할거야???
	// Sample03에서 객체 활용해서 간단하게 해결해보자고

}
