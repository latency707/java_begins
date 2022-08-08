// insert 는 특정 위치에 원하는 문자열을 삽입할 수 있는 메서드

public class SbufferInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello ");
        System.out.println(sb.toString());
    }
    
}
