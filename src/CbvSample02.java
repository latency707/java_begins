class Updaterr {
	void update(Counterr counter) { // Counterr 메서드의 객체 전달
		counter.count++;
	}
}

class Counterr {
	int count = 0; 
}

public class CbvSample02 {
	public static void main(String[] args) {
		Counterr myCounter = new Counterr();
		System.out.println("before update: " + myCounter.count);
		
		Updaterr myUpdater = new Updaterr();
		myUpdater.update(myCounter); // 객체명 전달로 메서드 호출
		System.out.println("after update: " + myCounter.count);
	}
	// 업데이트 전 0, 업데이트 후 1로 count 상승 반영 

}
