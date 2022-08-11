/*
 * switch/case
if문과 비슷하지만 보다 더 정형화된 조건 판단문으로, 
입력값이 정형화되어 있을 때 사용 시 if else 문에 비해 가독성에서 유리함

*/
public class ControlSwitchCase01 {
	public static void main(String[] args) {
		int month = 8;
		String monthString = "";
		
		// 입력변수(month)의 값과 일치하는 case 입력값(8)이 있다면 해당 case에 속한 문장 실행
		switch (month) {
			case 1: monthString = "January";
					break;
			case 2: monthString = "Feburary";
					break;
			case 3: monthString = "March";
					break;
			case 4: monthString = "April";
					break;
			case 5: monthString = "May";
					break;			
			case 6: monthString = "June";
					break;
			case 7: monthString = "July";
					break;
			case 8: monthString = "August";
					break;
			case 9: monthString = "September";
					break;
			case 10: monthString = "October";
					break;
			case 11: monthString = "November";
					break;
			case 12: monthString = "December";
					break;
		}
		System.out.println(monthString);
	}

}
