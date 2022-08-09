/* 
배열의 길이는 고정되어 있다. 
초기값 없이 배열변수 생성 시, 반드시 길이에 대한 숫자 값이 필요함.
*/

public class ArraySample02 {
    public static void main(String[] args) {
        // 배열 길이 우선 설정 ;String[7]
        String[] weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";
        
        // 배열 값 인덱싱
        System.out.println(weeks[3]);
    }
    
}
