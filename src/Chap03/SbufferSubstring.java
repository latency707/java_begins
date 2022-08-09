// substring은 StringBuffer 객체의 시작위치에서 끝위치까지의 문자 추출 메서드

public class SbufferSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));
    }
    
}
