/*
length
배열의 길이는 객체명.length 로 구함
*/

public class ArraySample03 {
    public static void main(String[] args) {
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }
    }
    
}
