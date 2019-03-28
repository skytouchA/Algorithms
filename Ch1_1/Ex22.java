package Ch1_1;

public class Ex22
{
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length-1, 0);
    }

    public static int rank(int key, int[]a , int lo, int hi, int depth)
    {
        for (int i = 0; i < depth; i++) {
            System.out.printf("  ");
        }
        System.out.printf("Deep %d: low = %d, high = %d\n", depth, lo, hi);
        if (lo>hi) return -1;
        int mid = lo + (hi - lo ) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else  if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 6,7, 9, 10, 24, 66};
        int key = 10;
        int position = rank(key, a);
        if (position == -1){
            System.out.println("Can't found");
        }else {
            System.out.println("position=" + position);
        }
    }
}
