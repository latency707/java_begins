import java.util.ArrayList;

/*
 * else if 
if, else 만으로는 다양한 조건을 판단하기는 어려움.
이 점을 보완하기 위한 것이 다중 조건 판단
else if는 앞선 조건문이 거짓일 때 수행됨.
*/

public class ControlIfSample05 {
	/*
	 * "지갑에 돈이 있으면 택시를 타고, 
	 * 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 
	 * 돈도 없고 카드도 없으면 걸어가라“ 를 다중 조건 판단으로 표현하기
	 */
	public static void main(String[] args) {
		boolean hasCard = true;
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("handphone");
		
		if (pocket.contains("money")) { // 돈이 없는 경우 else if 진행
			System.out.println("택시를 타고 가시오.");
		} else if(hasCard) { // 카드가 있는 경우
			System.out.println("택시를 타고 가시오.");
		} else {
			System.out.println("걸어가시오.");
		}
	}

}
