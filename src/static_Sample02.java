class Counter {
    static int count = 0; 
    Counter() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {  // static 키워드가 있는 getCount() 메서드
        return count;
    }
}

public class static_Sample02 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());  // 스태식 메서드는 클래스를 이용하여 호출
    }
    
}

// 스태틱 메서드 내에서는 객체변수 접근이 불가능함.
// 여기서는 count 변수가 static 변수이기 때문에 스태틱 메서드에서 접근이 가능함
// 스태틱 메서드는 유틸리티 메서드 작성에 많이 사용됨
// ex) 오늘 날짜 구하기, 숫자에 콤마 추가하기 등