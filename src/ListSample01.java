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

        System.out.println(pitches.get(1)); // get; 인덱스 1 값 출력

        System.out.println(pitches.size()); // size; ArrayList 갯수 리턴
        
        System.out.println(pitches.contains("142")); // contains; 해당 항목 유무 판별 후 결과를 T/F로 리턴
        
        System.out.println(pitches.remove("129")); // remove(객체); 해당 객체 삭제 후 결과 T/F 리턴
        
        System.out.println(pitches.remove(0)); // remove(인덱스); 해당 인덱스 항목 삭제 후 삭제 항목 리턴
    }
    
}
