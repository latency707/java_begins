/** 클래스 블록
    클래스명이 SourceCode01 인 클래스
    클래스 블록은 {} 로 영역을 구분
    public 은 어디서든 이 클래스에 접근할 권한이 있음
*/
public class SourceCode01 {

/** 메서드 블록
    메서드명이 main 인 메서드
    메서드 블럭도 {} 로 영역을 구분
    클래스 블록 안에는 여러 개의 메서드 블럭이 있을 수 있음
        메서드에 static 키워드를 붙일 경우 클래스 메서드가 됨
        객체생성 없이 "클래스명.메서드명" 형태로 호출 가능

        void 는 메서드에 리턴값이 없는 리턴타입임을 의미함

        String[] args 는 메서드의 매개변수로,
        args 변수는 String[] 배열 자료형임을 의미
*/
    public static void main(String[] args) {


/** 명령문
    컴퓨터에 작업을 명령하는 문장
    명령문은 세미콜론(;) 으로 문장의 끝을 표시해야 함
    메서드 블록 안에는 여러 개의 명령문이 있을 수 있음
*/
        System.out.println("Hello java");
    }
    
}
