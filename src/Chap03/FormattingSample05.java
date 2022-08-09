// 정렬과 공백

public class FormattingSample05 {
    public static void main(String[] args) {
        // 길이 10개인 문자열 공간 오른쪽 정렬 hi
        System.out.println(String.format("%10s", "hi"));
        // 길이 10개인 문자열 공간 왼쪽 정렬 hi
        System.out.println(String.format("%-10s", "hi"));
    }
    
}
