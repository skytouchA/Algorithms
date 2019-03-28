package Ch1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.introcs.StdRandom;

public class Ex1
{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(StdRandom.random(),StdRandom.random());
            points[i].draw();
        }

        if (N>1){
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < points.length-1; i++) {
                for (int j = i+1; j < points.length; j++) {
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println("Min distance: " + min);
        }
    }
}
