/* 
 * StringBuilder
StringBuffer 와 동일한 자료형으로, StringBuffer보다 성능이 우수함.
동기화를 고려할 필요가 없는 상황에서는 StringBuilder 사용이 유리함
 */

public class Sbuilder {
   public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");
    String result = sb.toString();
    System.out.println(result);
   } 
}
