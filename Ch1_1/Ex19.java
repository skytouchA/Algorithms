package Ch1_1;

import edu.princeton.cs.introcs.StdOut;

public class Ex19
{
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static long[] FArray(int N)
    {
        long[] fibonacci = new long[N];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            System.out.println(i + " " + fibonacci[i]);
        }
        return fibonacci;
    }
    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++) {
//            StdOut.println(N + " " + F(N));
//        }
        FArray(100);
    }
}
