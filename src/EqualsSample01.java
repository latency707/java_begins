/*
equals는 두 개의 문자열이 동일한지를 비교 후 결과값을 리턴
*/

public class equalsSample01 {
    public static void main(String[] args){
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true
    }
    
}
