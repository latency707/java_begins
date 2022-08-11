package Chap04;
import java.util.ArrayList;

/*
 * contains
List 자료형에는 해당 아이템 유무를 조사하는 contains 메서드가 있음.
contains 메서드는 조건문에 많이 활용됨
*/

public class ControlIfSample04 {
	public static void main(String[] args) {
		// 주머니에 돈이 있다면 택시를 타고, 없으면 걸어가라를 contains 메서드로
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타시오.");
		} else {
			System.out.println("걸어서 가시오.");
		}
	}

}
