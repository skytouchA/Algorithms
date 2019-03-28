package Ch1_2;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator visualAccumulator = new VisualAccumulator(T, 1);
        for (int i = 0; i < T; i++) {
            visualAccumulator.addDataValue(StdRandom.random());
        }
        StdOut.println(visualAccumulator);
    }
}
