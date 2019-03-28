package Ch1_1;

public class Ex18 {

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static int mystery1(int a, int b) {
        if (b == 0) return 1 ;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) + a;
    }
    public static void main(String[] args) {
        System.out.println(mystery1(2, 25));
        System.out.println(mystery1(3, 66));
    }
}
