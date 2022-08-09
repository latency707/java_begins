import java.util.Arrays;

/*
split은 문자열을 특정 구분자로 분리하는 메서드
*/

public class splitSample {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":");

        System.out.println(Arrays.toString(result));
        // for(String s : result)
        //     System.out.println(s);
    }
    
}

/*
split 사용 시 주의사항
메타문자로 들어가는 특수문자를 split 할 때이다.
?, *, +, (, ), [, ], {, }, 등의 메타문자를 
split으로 나누려고 할 시 오류가 발생함.

이 메타문자들을 이스케이프 처리를 해주면 나눌 수 있어짐
ex- \\?
 */