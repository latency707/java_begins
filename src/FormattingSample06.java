// 소수점 표현

public class FormattingSample06 {
    public static void main(String[] args) {
        // 소수점 4번째 자리까지 표현
        System.out.println(String.format("%.4f", 3.42134234));
        // 소수점 4번째 자리까지 표현 및 10개의 문자열 공간 오른쪽 정렬
        System.out.println(String.format("%10.4f", 3.42134234));
    }
    
}
