public class GuGu {
    public void dan(int n) {
        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(n*4);
        System.out.println(n*5);
        System.out.println(n*6);
        System.out.println(n*7);
        System.out.println(n*8);
        System.out.println(n*9);
    }
    
    
    public static void main(String[] args) {
        GuGu gugu = new GuGu(); // GuGu 클래스의 객체 생성

        // gugu.dan(n); // 객체를 통해 dan 메소드를 호출
        gugu.dan(2);
        gugu.dan(3);
        gugu.dan(4);
        gugu.dan(5);
        gugu.dan(6);
        gugu.dan(7);
        gugu.dan(8);
        gugu.dan(9);
    }
}
