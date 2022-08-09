/*
문자열 포매팅이란, 문자열 안에 어떤 특정 값을 삽입하는 방법
*/

public class FormattingPackages  {
    // 숫자 n
    public void Num(int n) {
        System.out.println(String.format("I eat %d apples.", n)); // "I eat 3 apples." 출력
    }
    // 문자열 a
    public void Str(String a) {
        System.out.println(String.format("I eat %s apples.", a));
    }
    // 2개 이상의 값 대입
    public void vMul(int n, String day) {
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", n, day));
        
    }
    

    public static void  main(String[] args) {
        FormattingPackages formatting = new FormattingPackages();
        formatting.Num(3);
        formatting.Str("five");
        formatting.vMul(10, "three");
    }
}