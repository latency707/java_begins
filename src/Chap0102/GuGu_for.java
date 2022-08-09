public class GuGu_for {
    public void dan(int n) {
        for(int i = 1; i < 10; i++) { // i에 1에서 9까지의 값을 반복적으로 대입
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        GuGu_for gugu = new GuGu_for();
        for (int i = 2; i < 10; i++) {
            gugu.dan(i);
        }
    }
}