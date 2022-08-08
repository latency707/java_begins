// 2개 이상의 값 넣기

public class FormattingSample04 {
    public static void main(String[] args) {
        int number = 10;
        String day = "three";

        // "I ate 10 apples. so I was sick for three days." 출력
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
    }
}
