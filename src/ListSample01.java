/*
 * List
리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점.
*/

// ArrayList
import java.util.ArrayList;

public class ListSample01 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133"); // 인덱스 0에 133 삽입
        pitches.add(1, "135"); // 인덱스 1에 135 삽입

        System.out.println(pitches.get(1)); // 인덱스 1 값 출력

        System.out.println(pitches.size()); // ArrayList 갯수 리턴
    }
    
}
