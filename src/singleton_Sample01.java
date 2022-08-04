// singleton 은 단 하나의 객체만을 생성하게 강제하는 패턴
class Singleton {
    // one static 변수 생성
    private static Singleton one;
    private Singleton() {

    }
    
    // getInstance 메서드
    public static Singleton getInstance() {
        // one 값이 null 인 경우에만 객체 생성
        if(one==null) {
            one = new Singleton();

        }
        return one;
    }
}

// main 메서드
public class singleton_Sample01 {
    public static void main(String[] args) {
        // getInstance 2회 호출
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // 호출한 2개의 객체가 같은 객체인지 확인
        System.out.println(singleton1 == singleton2); // true
    }
}