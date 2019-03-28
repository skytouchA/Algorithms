package Ch1_1;

import edu.princeton.cs.introcs.StdIn;

public class Ex23
{
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6,7, 9, 10, 24, 66}; // define a white list
        System.out.println("+ will print number not in list, - will print number in list");
        char symbol = StdIn.readChar();
        StdIn.readLine();
        System.out.println("Enter the key:");
        String[] keys = StdIn.readLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            if (rank(Integer.parseInt(keys[i]), a) != -1 && symbol == '-')
                System.out.printf("%s ", keys[i]);
            else if (rank(Integer.parseInt(keys[i]), a) == -1 && symbol == '+')
                System.out.printf("%s ", keys[i]);
        }
        System.out.println();
    }
}
