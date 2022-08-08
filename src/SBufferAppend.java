/*
StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
*/

public class SBufferAppend {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // append : 문자열 추가 메서드
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        // toString() : String 자료형으로 변경
        String result = sb.toString();
        System.out.println(result);
    }
}
