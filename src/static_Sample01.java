// static 변수

class Counter  {
    static int count = 0;
    Counter() {
        count++;  // static 키워드 없이 객체 생성시 
        System.out.println(count);  // this 제거
    }
}

public class static_Sample01 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}

// count에 static를 사용하지 않을 경우,
// c1, c2 객체 생성시 생성자에서 객체변수인 count 값을 1씩 증가하더라도
// c1, c2가 각각의 메모리를 가리키고 있기 때문에 카운트가 증가하지 않음
// 객체변수는 항상 독립적인 값을 지님

// count 변수에 static 키워드를 사용하면 값이 공유되어 count 증가
// 보통 변수의 static 키워드는 메모리 효율보다 공유의 목적이 큼