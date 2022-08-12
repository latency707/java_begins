class dashInsert {	
	int number;
	int lennum;
	
	void setNumber(int number) {
		this.number = number;
		System.out.println("입력값: " + number);
	}
	
	void lenNumber(int lennum) {
		this.lennum = lennum;
	}
	
}

public class Noob {
	public static void main(String[] args) {
		dashInsert dash = new dashInsert();
		dash.setNumber(4546793);
		
//		for (int i = 0 ; i < dash.lennum ; i++) {
//			System.out.println(dash.number.substring(i, i+1));
//		}
	}

}

// 홀수 연속 7-9
// 짝수 연속 4*6